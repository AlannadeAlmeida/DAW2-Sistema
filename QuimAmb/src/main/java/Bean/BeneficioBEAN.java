package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.BeneficioService;
import entities.Beneficio;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class BeneficioBEAN {

	@Inject
	private BeneficioService service;

	private Beneficio beneficio;
	
	private List<Beneficio> beneficios;
	
	
	public List<Beneficio> getBeneficios() {
		return beneficios;
	}
	
	public void setElementos(List<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}
	
	
	public Beneficio getBeneficio() {
		return beneficio;
	}
	
	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}
	
	public void save() {
		getService().save(beneficio);
		limpar();
	}

	public void editar(Long id) {
		this.getBeneficio().setId(id);
		save();
	}

	public void limpar() {
		beneficios = getService().getAll();
		beneficio = newEntidade();
	}

	protected Beneficio newEntidade() {
		return new Beneficio();
	}

	public BeneficioService getService() {
		return service;
	}
	
	
}
