package entities;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Consequencia")
public class Consequencia implements Identificavel{
	
	@Id
	private Long id;
	ArrayList <ElementoQuimico> quantidade;
	ArrayList <ElementoQuimico> prejudiciais;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ArrayList<ElementoQuimico> getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(ArrayList<ElementoQuimico> quantidade) {
		this.quantidade = quantidade;
	}
	public ArrayList<ElementoQuimico> getPrejudiciais() {
		return prejudiciais;
	}
	public void setPrejudiciais(ArrayList<ElementoQuimico> prejudiciais) {
		this.prejudiciais = prejudiciais;
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
		Consequencia other = (Consequencia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
