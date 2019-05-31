import java.awt.List;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Eventos")
public class Eventos implements Identificavel {

	@Id
	@GeneratedValue
	
	@ManyToMany
        
    @OneToMany(mappedBy = "Usuario")
    private List usuarios;
        
	private Long id_ev;
	private String causa;
	private Long duracao;
	private String local;
	private Date data;
	public List getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List usuarios) {
		this.usuarios = usuarios;
	}
	public Long getId_ev() {
		return id_ev;
	}
	public void setId_ev(Long id_ev) {
		this.id_ev = id_ev;
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
		result = prime * result + ((id_ev == null) ? 0 : id_ev.hashCode());
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
		if (id_ev == null) {
			if (other.id_ev != null)
				return false;
		} else if (!id_ev.equals(other.id_ev))
			return false;
		return true;
	}
	
}
