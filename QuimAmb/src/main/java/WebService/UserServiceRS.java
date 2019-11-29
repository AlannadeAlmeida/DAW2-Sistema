package WebService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import entities.Usuario;
import service.UsuarioService;

@Path("/user")
public class UserServiceRS {
	
	@Inject
	private UsuarioService usuarioService;
	
	//http://localhost:8888/quimica/rest/user/nome/1
	@GET
	@Path("/nome/{id}")
	@Produces("text/html")
	public String getUsuario(@PathParam("id") Long id) {
		Usuario u = usuarioService.getByID(id);
		return u.toString();
	}

}
