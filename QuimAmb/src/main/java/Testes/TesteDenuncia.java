package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import Service.DenunciaService;
import entities.Denuncia;

public class TesteDenuncia {
	
	@Test
	void verificarDenuncia() {
		DenunciaService service = new DenunciaService();
		Denuncia denuncia = new Denuncia();
		denuncia.setCidade("cidade");
		denuncia.setRegiao("regiao");
		denuncia.setLocal("local");
		service.save(denuncia);
		assertNotNull(denuncia.getId());
		Denuncia outro = service.getByID(denuncia.getId());
		assertEquals(outro, denuncia);
		denuncia.setLocal("local");
		service.update(denuncia);
		outro = service.getByID(denuncia.getId());
		assertEquals(outro.getDenuncia(), denuncia.getDenuncia());
		service.remove(denuncia);
		outro = service.getByID(denuncia.getId());
		assertNull(outro);
		
	}
	
}