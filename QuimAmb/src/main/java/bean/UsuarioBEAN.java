package bean;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entities.Usuario;
import service.UsuarioService;


@Named
@ViewScoped
public class UsuarioBEAN implements Serializable{
	
	@Inject
	private UsuarioService service;

	private Usuario usuario;
	
	private List<Usuario> usuarios;
	
	@PostConstruct
	public void init() {
		usuario = newEntidade();
		usuarios = getService().getAll();
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setElemento(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void save() {
		getService().save(usuario);
		limpar();
	}

	public void editar(Long id) {
		this.getUsuario().setId(id);
		save();
	}

	public void limpar() {
		usuarios = getService().getAll();
		usuario = newEntidade();
	}

	protected Usuario newEntidade() {
		return new Usuario();
	}

	public UsuarioService getService() {
		return service;
	}

}
