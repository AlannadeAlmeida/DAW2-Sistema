package entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Responsavel implements Identificavel{
	
	@Id
	private Long id;
	private String nome;
	private String NomeDaEmpresa;
	
	@ManyToMany
	@JoinTable(name="resp_eve", joinColumns=@JoinColumn(name="id_Responsavel"), inverseJoinColumns=@JoinColumn(name="id_Eventos"))
    private Set<Eventos> evento;
	
	public Set<Eventos> getEventos() {
		return evento;
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
	public String getNomeDaEmpresa() {
		return NomeDaEmpresa;
	}
	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		NomeDaEmpresa = nomeDaEmpresa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Responsavel other = (Responsavel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
