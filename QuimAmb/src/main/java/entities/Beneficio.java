package entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Beneficio")
public class Beneficio implements Identificavel{
	
	@Id
	private Long id;
	
	@OneToOne
	@JoinColumn(name="id_elemento")
	private ElementoQuimico elementoQuimico;
	
	private Double quantidadeMaxima;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ElementoQuimico getElementoQuimico() {
		return elementoQuimico;
	}
	public void setElementoQuimico(ElementoQuimico elementoQuimico) {
		this.elementoQuimico = elementoQuimico;
	}
	public Double getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
	public void setQuantidadeMaxima(Double quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
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
		Beneficio other = (Beneficio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
