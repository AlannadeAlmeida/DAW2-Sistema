package entities;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Eventos")
public class Eventos implements Identificavel {

    @ManyToMany
    @JoinTable(name="usu_eve", joinColumns=@JoinColumn(name="id_Eventos"), inverseJoinColumns=@JoinColumn(name="id_usu"))
    private Set<Usuario> usuarios;
   
	@Id
	@GeneratedValue    
	private Long id;
	private String causa;
	private Long duracao;
	private String local;
	private Date data;
	
	@ManyToMany
	@JoinTable(name="Denunciar", joinColumns=@JoinColumn(name="id_Eventos"), inverseJoinColumns=@JoinColumn(name="id_Denuncia")) 
	private Set<Denuncia> denuncias;
	
	public Set<Denuncia> getDenuncia() {
		return denuncias;
	}
	
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public Long getDuracao() {
		return duracao;
	}
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
		Eventos other = (Eventos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
