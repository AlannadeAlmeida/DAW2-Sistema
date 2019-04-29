import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MeioAmbiente")
public class MeioAmbiente {
	 
	@Id
	@GeneratedValue
	
	private Long id_ma;
	private String floresta;
	public Long getId_ma() {
		return id_ma;
	}
	public void setId_ma(Long id_ma) {
		this.id_ma = id_ma;
	}
	public String getFloresta() {
		return floresta;
	}
	public void setFloresta(String floresta) {
		this.floresta = floresta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_ma == null) ? 0 : id_ma.hashCode());
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
		MeioAmbiente other = (MeioAmbiente) obj;
		if (id_ma == null) {
			if (other.id_ma != null)
				return false;
		} else if (!id_ma.equals(other.id_ma))
			return false;
		return true;
	}
	
	
	
	
}
