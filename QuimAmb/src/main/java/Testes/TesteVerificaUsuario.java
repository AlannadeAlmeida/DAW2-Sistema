package Testes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import entities.Usuario;
import service.UsuarioService;

public class TesteVerificaUsuario {
	
	class Testes {

		@Test
		void verificarCadastrarUsuario() {
			UsuarioService service = new UsuarioService();
			Usuario usuario = new Usuario();
			usuario.setLogin("login");
			usuario.setEmail("email");
			service.save(usuario);
			assertNotNull(usuario.getId());
			Usuario outro = service.getByID(usuario.getId());
			assertEquals(outro, usuario);
			usuario.setNome("nome");
			service.update(usuario);
			outro = service.getByID(usuario.getId());
			assertEquals(outro.getNome(), usuario.getNome());
			service.remove(usuario);
			outro = service.getByID(usuario.getId());
			assertNull(outro);
			
		}
		
	}
}

