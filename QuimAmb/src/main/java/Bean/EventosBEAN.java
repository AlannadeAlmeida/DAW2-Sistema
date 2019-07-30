package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.EventosService;
import entities.Eventos;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class EventosBEAN {
	
	@Inject
	private EventosService service;

	private Eventos eventos;
	
	private List<Eventos> evento;
	
	
	
	public List<Eventos> getEvento() {
		return evento;
	}
	
	public void setElementos(List<Eventos> evento) {
		this.evento = evento;
	}
	
	
	public Eventos getEventos() {
		return eventos;
	}
	
	public void setElemento(Eventos eventos) {
		this.evento = evento;
	}
	
	public void save() {
		getService().save(eventos);
		limpar();
	}

	public void editar(Long id) {
		this.getEventos().setId(id);
		save();
	}

	public void limpar() {
		evento = getService().getAll();
		eventos = newEntidade();
	}

	protected Eventos newEntidade() {
		return new Eventos();
	}

	public EventosService getService() {
		return service;
	}
	

}
