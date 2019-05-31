
public class Denuncia implements Identificavel {

	private Long id_de;
	private String cidade;
	private String regiao;
	private String local;
	
	public Long getId_de() {
		return id_de;
	}
	public void setId_de(Long id_de) {
		this.id_de = id_de;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_de == null) ? 0 : id_de.hashCode());
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
		Denuncia other = (Denuncia) obj;
		if (id_de == null) {
			if (other.id_de != null)
				return false;
		} else if (!id_de.equals(other.id_de))
			return false;
		return true;
	}
	
	
}