package entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Usuario implements Identificavel {
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha + ", email=" + email
				+ ", denuncia=" + denuncia + ", regioes=" + regioes + "]";
	}

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String senha;
	private String email;
	
	@ManyToMany
	@JoinTable(name="Den_usu", joinColumns=@JoinColumn(name="id_Usuario"), inverseJoinColumns=@JoinColumn(name="id_Eventos"))
	private Set<Denuncia> denuncia;
	
	@ManyToMany
	@JoinTable(name="Reg_usu", joinColumns=@JoinColumn(name="id_Usuario"), inverseJoinColumns=@JoinColumn(name="id_Regiao"))
    private Set<Regiao> regioes;
	
	public Set<Regiao> getRegiao() {
		return regioes;
	}
	
	public Set<Denuncia> getDenuncia() {
		return denuncia;
	}
	
	public Set<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(Set<Regiao> regioes) {
		this.regioes = regioes;
	}
	
	public void setDenuncia(Set<Denuncia> denuncia) {
		this.denuncia = denuncia;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}