package Bean;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.ResponsavelService;
import entities.Responsavel;

@Named
@ViewScoped
public class ResponsavelBEAN {
	
	@Inject
	private ResponsavelService service;

	private Responsavel responsavel;
	
	private List<Responsavel> responsaveis;
	
	
	
	public List<Responsavel> getResponsaveis() {
		return responsaveis;
	}
	
	public void setElementos(List<Responsavel> responsaveis) {
		this.responsaveis = responsaveis;
	}
	
	
	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public void save() {
		getService().save(responsavel);
		limpar();
	}

	public void editar(Long id) {
		this.getResponsavel().setId(id);
		save();
	}

	public void limpar() {
		responsaveis = getService().getAll();
		responsavel = newEntidade();
	}

	protected Responsavel newEntidade() {
		return new Responsavel();
	}

	public ResponsavelService getService() {
		return service;
	}

}
