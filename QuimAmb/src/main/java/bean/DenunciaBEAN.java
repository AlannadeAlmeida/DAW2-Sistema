package bean;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Denuncia;
import service.DenunciaService;

@Named
@ViewScoped
public class DenunciaBEAN implements Serializable{
	
	@Inject
	private DenunciaService service;

	private Denuncia denuncia;
	
	private List<Denuncia> denuncias;
	
	@PostConstruct
	public void init() {
		denuncia = newEntidade();
		denuncias = getService().getAll();
	}
	
	public List<Denuncia> getDenuncias() {
		return denuncias;
	}
	
	public void setElementos(List<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}
	
	
	public Denuncia getDenuncia() {
		return denuncia;
	}
	
	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}
	
	public void save() {
		getService().save(denuncia);
		limpar();
	}

	public void editar(Long id) {
		this.getDenuncia().setId(id);
		save();
	}

	public void limpar() {
		denuncias = getService().getAll();
		denuncia = newEntidade();
	}

	protected Denuncia newEntidade() {
		return new Denuncia();
	}

	public DenunciaService getService() {
		return service;
	}

}
