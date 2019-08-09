package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.FloraService;
import entities.Flora;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class FloraBEAN {
	
	@Inject
	private FloraService service;

	private Flora flora;
	
	private List<Flora> floras;
	
	
	
	public List<Flora> getFloras() {
		return floras;
	}
	
	public void setElementos(List<Flora> Floras) {
		this.floras = floras;
	}
	
	
	public Flora getFlora() {
		return flora;
	}
	
	public void setFlora(Flora flora) {
		this.flora = flora;
	}
	
	public void save() {
		getService().save(flora);
		limpar();
	}

	public void editar(Long id) {
		this.getFlora().setId(id);
		save();
	}

	public void limpar() {
		floras = getService().getAll();
		flora = newEntidade();
	}

	protected Flora newEntidade() {
		return new Flora();
	}

	public FloraService getService() {
		return service;
	}

}
