import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario implements Identificavel {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String senha;
	private String login;
	private String email;
	ArrayList <Denuncia> denuncias;
	
	@OneToOne (mappedBy="end")
	private Denuncia denuncia;
	
	@OneToOne (mappedBy="end")
	private Eventos eventos;
	
	@ManyToMany
	@JoinTable(name="Auxilia", joinColumns=@JoinColumn(name="id_Usuario"), inverseJoinColumns=@JoinColumn(name="id_Meio_Ambiente"))
    private Set<MeioAmbiente> meioAmbiente;
	
	public Set<MeioAmbiente> getMeioAmbiente() {
		return meioAmbiente;
	}
	
	public void setMeioAmbiente(Set<MeioAmbiente> meioAmbientes) {
		this.meioAmbiente = meioAmbientes;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
	
	
}