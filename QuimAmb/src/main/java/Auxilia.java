
public class Auxilia {
	
	private Long id;
	private Long id_usuario;
	private Long id_ma;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Long getId_ma() {
		return id_ma;
	}
	public void setId_ma(Long id_ma) {
		this.id_ma = id_ma;
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
		Auxilia other = (Auxilia) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Auxilia(Long id, Long id_usuario, Long id_ma) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_ma = id_ma;
	}
	
	

}
