import java.util.ArrayList;

import entities.Eventos;
import entities.Usuario;

public interface Meio {
	
	public void cadastrar (Usuario usuario);
	
	
	// verifica aqui se a senha confere com a recebida como parametro  
	public boolean autentica(String login, String senha);
    
	public boolean autentica1(int email);
	
	public void salvarusuario (Usuario usuario);

	public void deletarusuario (Usuario usuario);
	
	// A funcao busca e retorna o elemento atraves de seu identificador
	public Usuario getById(Usuario id);
	
	// getAll retorna todo o objeto da subclasse armazenada em um banco de dados
	public ArrayList<Usuario> getAll();
	
	public ArrayList<Eventos> getByCausa(String causa);
	
}
