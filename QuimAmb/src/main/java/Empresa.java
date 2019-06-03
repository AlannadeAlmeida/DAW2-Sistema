
public class Empresa implements Identificavel{

	private Long id;
	private String nome;
	private String area_de_atuacao;
	private Long financiamento;
	private String representante;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea_de_atuacao() {
		return area_de_atuacao;
	}
	public void setArea_de_atuacao(String area_de_atuacao) {
		this.area_de_atuacao = area_de_atuacao;
	}
	public Long getFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(Long financiamento) {
		this.financiamento = financiamento;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id== null) ? 0 : id.hashCode());
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
		Empresa other = (Empresa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
