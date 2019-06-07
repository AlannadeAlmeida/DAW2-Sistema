import javax.persistence.Id;

public class Consequencia implements Identificavel{
	
	@Id
	private Long id;
	private Long id_ma;
	private Long id_eq;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_ma() {
		return id_ma;
	}
	public void setId_ma(Long id_ma) {
		this.id_ma = id_ma;
	}
	public Long getId_eq() {
		return id_eq;
	}
	public void setId_eq(Long id_eq) {
		this.id_eq = id_eq;
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
	public Consequencia(Long id, Long id_ma, Long id_eq) {
		super();
		this.id = id;
		this.id_ma = id_ma;
		this.id_eq = id_eq;
	}
	
	
	
}
