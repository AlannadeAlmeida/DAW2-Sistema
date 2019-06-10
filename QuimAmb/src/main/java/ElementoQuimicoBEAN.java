import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ElementoQuimicoBEAN {
	
	@Inject
	private ElementoQuimicoService service;

	private ElementoQuimico elemento;
	
	private List<ElementoQuimico> elementos;
	
	
	
	public List<ElementoQuimico> getElementos() {
		return elementos;
	}
	
	public void setElementos(List<ElementoQuimico> elementos) {
		this.elementos = elementos;
	}
	
	
	public ElementoQuimico getElemento() {
		return elemento;
	}
	
	public void setElemento(ElementoQuimico elemento) {
		this.elemento = elemento;
	}
	
	public void save() {
		getService().save(elemento);
		limpar();
	}

	public void editar(Long id) {
		this.getElemento().setId(id);
		save();
	}

	public void limpar() {
		elementos = getService().getAll();
		elemento = newEntidade();
	}

	protected ElementoQuimico newEntidade() {
		return new ElementoQuimico();
	}

	public ElementoQuimicoService getService() {
		return service;
	}
	
}
