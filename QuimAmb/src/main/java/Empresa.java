
public class Empresa implements Identificavel{

	private Long id_emp;
	private String nome;
	private String area_de_atuacao;
	private Long financiamento;
	private String representante;
	
	public Long getId_emp() {
		return id_emp;
	}
	public void setId_emp(Long id_emp) {
		this.id_emp = id_emp;
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
		result = prime * result + ((id_emp == null) ? 0 : id_emp.hashCode());
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
		if (id_emp == null) {
			if (other.id_emp != null)
				return false;
		} else if (!id_emp.equals(other.id_emp))
			return false;
		return true;
	}
	
	
}
