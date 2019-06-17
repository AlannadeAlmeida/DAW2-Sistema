import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarUsuario extends Usuario {

	public static void main(String[] args) {
		
        Scanner l = new Scanner(System.in);
        System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
        System.out.println("Digite os dados: "+"\nNome ");
        String nome = l.nextLine();
        System.out.println("Login");
        String login = l.nextLine();
        System.out.println("Senha de acesso");
        int senha = l.nextInt();
        Usuario cadastrarusuario;
        cadastrarusuario = new Usuario();
        cadastrarusuario.setNome(nome);
        cadastrarusuario.setLogin(login);
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(cadastrarusuario);
        System.out.println(cadastrarusuario.getNome()+"\n"+cadastrarusuario.getLogin());
     }
	
	

}
