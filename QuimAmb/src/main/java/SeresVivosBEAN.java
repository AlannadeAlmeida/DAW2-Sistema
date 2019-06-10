import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class SeresVivosBEAN {
	
	@Inject
	private SeresVivosService service;

	private SeresVivos seresVivos;
	
	private List<SeresVivos> seresVivo;
	
	
	
	public List<SeresVivos> getSeresVivo() {
		return seresVivo;
	}
	
	public void setSeresVivo(List<SeresVivos> SeresVivo) {
		this.seresVivo = seresVivo;
	}
	
	
	public SeresVivos getSeresVivos() {
		return seresVivos;
	}
	
	public void setElemento(SeresVivos seresVivos) {
		this.seresVivos = seresVivos;
	}
	
	public void save() {
		getService().save(seresVivos);
		limpar();
	}

	public void editar(Long id) {
		this.getSeresVivos().setId(id);
		save();
	}

	public void limpar() {
		seresVivo = getService().getAll();
		seresVivos = newEntidade();
	}

	protected SeresVivos newEntidade() {
		return new SeresVivos();
	}

	public SeresVivosService getService() {
		return service;
	}

}
