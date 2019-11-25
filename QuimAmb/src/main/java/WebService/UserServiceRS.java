package WebService;
import javax.inject.Inject;
import javax.ws.rs.Path;
import service.UsuarioService;

@Path("/user")
public class UserServiceRS {
	
	@Inject
	private UsuarioService usuarioService;
	
	//http://localhost:8888/quimica/rest/user/nome/1
	@GET
	@Path("/nome/{id}")
	@Produces("text/html")
	

}
