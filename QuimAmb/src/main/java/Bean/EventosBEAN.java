package Bean;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.EventosService;
import entities.Eventos;

@Named
@ViewScoped
public class EventosBEAN {
	
	@Inject
	private EventosService service;

	private Eventos eventos;
	
	private List<Eventos> evento;
	
	
	public List<Eventos> getEvento() {
		return evento;
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
