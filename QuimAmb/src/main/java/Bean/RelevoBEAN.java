package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.RelevoService;
import entities.Relevo;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class RelevoBEAN {
	
	@Inject
	private RelevoService service;

	private Relevo relevo;
	
	private List<Relevo> relevos;
	
	
	
	public List<Relevo> getRelevos() {
		return relevos;
	}
	
	public void setElementos(List<Relevo> relevos) {
		this.relevos = relevos;
	}
	
	
	public Relevo getRelevo() {
		return relevo;
	}
	
	public void setRelevo(Relevo relevo) {
		this.relevo = relevo;
	}
	
	public void save() {
		getService().save(relevo);
		limpar();
	}

	public void editar(Long id) {
		this.getRelevo().setId(id);
		save();
	}

	public void limpar() {
		relevos = getService().getAll();
		relevo = newEntidade();
	}

	protected Relevo newEntidade() {
		return new Relevo();
	}

	public RelevoService getService() {
		return service;
	}

}
