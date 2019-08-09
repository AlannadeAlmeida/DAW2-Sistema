package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.FaunaService;
import entities.Fauna;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class FaunaBEAN {
	
	@Inject
	private FaunaService service;

	private Fauna fauna;
	
	private List<Fauna> faunas;
	
	
	
	public List<Fauna> getFaunas() {
		return faunas;
	}
	
	public void setElementos(List<Fauna> faunas) {
		this.faunas = faunas;
	}
	
	
	public Fauna getFauna() {
		return fauna;
	}
	
	public void setFauna(Fauna fauna) {
		this.fauna = fauna;
	}
	
	public void save() {
		getService().save(fauna);
		limpar();
	}

	public void editar(Long id) {
		this.getFauna().setId(id);
		save();
	}

	public void limpar() {
		faunas = getService().getAll();
		fauna = newEntidade();
	}

	protected Fauna newEntidade() {
		return new Fauna();
	}

	public FaunaService getService() {
		return service;
	}

}
