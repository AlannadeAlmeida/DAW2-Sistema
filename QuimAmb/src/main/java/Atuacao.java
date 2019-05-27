
public class Atuacao implements Identificavel {
	
	private Long id;
	private Long id_eq;
	private Long id_ev;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_eq() {
		return id_eq;
	}
	public void setId_eq(Long id_eq) {
		this.id_eq = id_eq;
	}
	public Long getId_ev() {
		return id_ev;
	}
	public void setId_ev(Long id_ev) {
		this.id_ev = id_ev;
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
		Atuacao other = (Atuacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Atuacao(Long id, Long id_eq, Long id_ev) {
		super();
		this.id = id;
		this.id_eq = id_eq;
		this.id_ev = id_ev;
	}
	
	

}
