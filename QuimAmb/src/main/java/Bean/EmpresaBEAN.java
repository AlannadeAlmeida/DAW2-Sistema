package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.EmpresaService;
import entities.Empresa;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class EmpresaBEAN {
	
	@Inject
	private EmpresaService service;

	private Empresa empresa;
	
	private List<Empresa> empresas;
	
	
	
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
