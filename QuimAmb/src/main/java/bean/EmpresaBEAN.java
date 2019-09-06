package bean;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Empresa;
import service.EmpresaService;

@Named
@ViewScoped
public class EmpresaBEAN implements Serializable {
	
	@Inject
	private EmpresaService service;

	private Empresa empresa;
	
	private List<Empresa> empresas;
	
	@PostConstruct
	public void init() {
		empresa = newEntidade();
		empresas = getService().getAll();
	}
	
	public List<Empresa> getEmpresas() {
		return empresas;
	}
	
	public void setElementos(List<Empresa> empresas) {
		this.empresas = empresas;
	}
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setElemento(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public void save() {
		getService().save(empresa);
		limpar();
	}

	public void editar(Long id) {
		this.getEmpresa().setId(id);
		save();
	}

	public void limpar() {
		empresas = getService().getAll();
		empresa = newEntidade();
	}

	protected Empresa newEntidade() {
		return new Empresa();
	}

	public EmpresaService getService() {
		return service;
	}

}
