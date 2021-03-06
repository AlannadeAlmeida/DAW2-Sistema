package entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Regiao")

public class Regiao implements Identificavel{
	
	@Id
	private Long id;
	private String clima;
	private String relevo;
	private String nome;
	
	@ManyToMany
	@JoinTable(name="Eventos_regiao", joinColumns=@JoinColumn(name="id_Regiao"), inverseJoinColumns=@JoinColumn(name="id_Eventos"))
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
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getRelevo() {
		return relevo;
	}
	public void setRelevo(String relevo) {
		this.relevo = relevo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		Regiao other = (Regiao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
