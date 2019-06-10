import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class MeioAmbienteBEAN {
	
	@Inject
	private MeioAmbienteService service;

	private MeioAmbiente meioAmbiente;
	
	private List<MeioAmbiente> meioAmbientes;
	
	
	
	public List<MeioAmbiente> getMeioAmbientes() {
		return meioAmbientes;
	}
	
	public void setElementos(List<MeioAmbiente> meioAmbientes) {
		this.meioAmbientes = meioAmbientes;
	}
	
	
	public MeioAmbiente getMeioAmbiente() {
		return meioAmbiente;
	}
	
	public void setElemento(MeioAmbiente meioAmbiente) {
		this.meioAmbiente = meioAmbiente;
	}
	
	public void save() {
		getService().save(meioAmbiente);
		limpar();
	}

	public void editar(Long id) {
		this.getMeioAmbiente().setId(id);
		save();
	}

	public void limpar() {
		meioAmbientes = getService().getAll();
		meioAmbiente = newEntidade();
	}

	protected MeioAmbiente newEntidade() {
		return new MeioAmbiente();
	}

	public MeioAmbienteService getService() {
		return service;
	}

}
