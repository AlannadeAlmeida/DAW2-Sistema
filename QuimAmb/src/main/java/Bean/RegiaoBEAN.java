package Bean;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.RegiaoService;
import entities.Regiao;

@Named
@ViewScoped
public class RegiaoBEAN {
	
	@Inject
	private RegiaoService service;

	private Regiao regiao;
	
	private List<Regiao> regioes;
	
	
	
	public List<Regiao> getRegioes() {
		return regioes;
	}
	
	public void setElementos(List<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	
	public Regiao getRegiao() {
		return regiao;
	}
	
	public void setDenuncia(Regiao regiao) {
		this.regiao = regiao;
	}
	
	public void save() {
		getService().save(regiao);
		limpar();
	}

	public void editar(Long id) {
		this.getRegiao().setId(id);
		save();
	}

	public void limpar() {
		regioes = getService().getAll();
		regiao = newEntidade();
	}

	protected Regiao newEntidade() {
		return new Regiao();
	}

	public RegiaoService getService() {
		return service;
	}

}
