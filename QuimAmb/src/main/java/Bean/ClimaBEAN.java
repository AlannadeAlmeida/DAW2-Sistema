package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.ClimaService;
import entities.Clima;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class ClimaBEAN {
	
	@Inject
	private ClimaService service;

	private Clima clima;
	
	private List<Clima> climas;
	
	
	
	public List<Clima> getClimas() {
		return climas;
	}
	
	public void setElementos(List<Clima> climas) {
		this.climas = climas;
	}
	
	
	public Clima getClima() {
		return clima;
	}
	
	public void setClima(Clima clima) {
		this.clima = clima;
	}
	
	public void save() {
		getService().save(clima);
		limpar();
	}

	public void editar(Long id) {
		this.getClima().setId(id);
		save();
	}

	public void limpar() {
		climas = getService().getAll();
		clima = newEntidade();
	}

	protected Clima newEntidade() {
		return new Clima();
	}

	public ClimaService getService() {
		return service;
	}

}
