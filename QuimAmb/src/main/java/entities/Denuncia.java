package entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Denuncia")
public class Denuncia implements Identificavel {

	@Id
	private Long id;
	private String cidade;
	private String regiao;
	private String local;
	private Denuncia denuncia;
	
	@ManyToMany
	@JoinTable(name="usu_denun", joinColumns=@JoinColumn(name="id_usuario"), inverseJoinColumns=@JoinColumn(name="id_Denuncia"))
	private Set<Usuario> denuncias;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Denuncia getDenuncia() {
		return denuncia;
	}
	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}
	public Set<Usuario> getDenuncias() {
		return denuncias;
	}
	public void setDenuncias(Set<Usuario> denuncias) {
		this.denuncias = denuncias;
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
		Denuncia other = (Denuncia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
