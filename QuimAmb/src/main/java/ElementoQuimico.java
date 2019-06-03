
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ElementoQuimico")
public class ElementoQuimico implements Identificavel{
	
	@Id
	@GeneratedValue
	
	private Long id;
	private Long natomico;;
	private String nome;
	private Long massa;
	private Long familia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNatomico() {
		return natomico;
	}
	public void setNatomico(Long natomico) {
		this.natomico = natomico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getMassa() {
		return massa;
	}
	public void setMassa(Long massa) {
		this.massa = massa;
	}
	public Long getFamilia() {
		return familia;
	}
	public void setFamilia(Long familia) {
		this.familia = familia;
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
		ElementoQuimico other = (ElementoQuimico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	


}
