package Bean;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import Service.UsuarioService;
import entities.Usuario;


@Named
@SessionScoped
public class UsuarioBEAN {
	
	@Inject
	private UsuarioService service;

	private Usuario usuario;
	
	private List<Usuario> usuarios;
	
	
	
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