
public class Afeta {
	
	private Long id;
	private Long id_ma;
	private Long id_m;
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
	public Long getId_m() {
		return id_m;
	}
	public void setId_m(Long id_m) {
		this.id_m = id_m;
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
		Afeta other = (Afeta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Afeta(Long id, Long id_ma, Long id_m) {
		super();
		this.id = id;
		this.id_ma = id_ma;
		this.id_m = id_m;
	}
	
	

}
