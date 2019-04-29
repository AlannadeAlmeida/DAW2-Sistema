import java.util.ArrayList;

public interface Meio {
	
	public void cadatrar (Usuario usuario);
	  
	public boolean autentica(int senha);
    // verifica aqui se a senha confere com a recebida como parametro
	public boolean autentica1(int email);
	
	public void salvarusuario (Usuario usuario);

	public void deletarusuario (Usuario usuario);
	
	public Usuario getById(Usuario usuario);
	// A funcao busca e retorna o elemento através de seu identificador
	public ArrayList<Usuario> getAll();
	// getAll retorna todo o objeto da subclasse armazenada em um banco de dados
	
	public ArrayList<Usuario> acessar();
	
	public void login(Usuario usuario);
	
	
}
