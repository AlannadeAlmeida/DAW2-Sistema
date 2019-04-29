import static org.junit.Assert.*;
import org.junit.Test;

class Testes {

	@Test
	void verificarCadastrarUsuario() {
		Meio m = null;
		Usuario usuario = new Usuario();
		m.cadatrar(usuario);
		assertTrue(m.autentica(usuario.getLogin(), usuario.getSenha()));
		m.deletarusuario(usuario);
		assertFalse(m.autentica(usuario.getLogin(), usuario.getSenha()));
		m.salvarusuario(usuario);
		assert(m.autentica(usuario.getLogin(), usuario.getSenha()));
		m.getById(usuario);
		equals(usuario);
	}
	
}

