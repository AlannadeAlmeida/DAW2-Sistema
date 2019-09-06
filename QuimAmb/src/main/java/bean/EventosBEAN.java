package bean;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Eventos;
import service.EventosService;

@Named
@ViewScoped
public class EventosBEAN implements Serializable{
	
	@Inject
	private EventosService service;

	private Eventos eventos;
	
	private List<Eventos> entidades;
	
	@PostConstruct
	public void init() {
		eventos = newEntidade();
		entidades = getService().getAll();
	}
	
	
	public Eventos getEventos() {
		return eventos;
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
		entidades = getService().getAll();
		eventos = newEntidade();
	}

	protected Eventos newEntidade() {
		return new Eventos();
	}

	public EventosService getService() {
		return service;
	}
	public List<Eventos> getEntidades() {
		return entidades;
	}
	

}
