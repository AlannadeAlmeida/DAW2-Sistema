import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ConsequenciaBEAN {
	
	@Inject
	private ConsequenciaService service;

	private Consequencia consequencia;
	
	private List<Consequencia> consequencias;
	
	
	
	public List<Consequencia> getConsequencias() {
		return consequencias;
	}
	
	public void setElementos(List<Consequencia> consequencias) {
		this.consequencias = consequencias;
	}
	
	
	public Consequencia getConsequencia() {
		return consequencia;
	}
	
	public void setElemento(Consequencia consequencia) {
		this.consequencia = consequencia;
	}
	
	public void save() {
		getService().save(consequencia);
		limpar();
	}

	public void editar(Long id) {
		this.getConsequencia().setId(id);
		save();
	}

	public void limpar() {
		consequencias = getService().getAll();
		consequencia = newEntidade();
	}

	protected Consequencia newEntidade() {
		return new Consequencia();
	}

	public ConsequenciaService getService() {
		return service;
	}

}
