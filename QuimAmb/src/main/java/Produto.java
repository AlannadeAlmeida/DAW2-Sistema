import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto implements Identificavel {

	@Id
	@GeneratedValue
	
	private Long id;
	private String nome;
	private Long tempodedecomposicao;
	
	@ManyToMany
	@JoinTable(name="afeta", joinColumns=@JoinColumn(name="id_produto"), inverseJoinColumns=@JoinColumn(name="id_meio_ambiente"))
	private Set<MeioAmbiente> meioAmbientes;
	
	public Set<MeioAmbiente> getMeioAmbientes() {
		return meioAmbientes;
	}
	
	public void setMeioAmbientes(Set<MeioAmbiente> meioAmbientes) {
		this.meioAmbientes = meioAmbientes;
	}
	
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
	public Long getTempodedecomposicao() {
		return tempodedecomposicao;
	}
	public void setTempodedecomposicao(Long tempodedecomposicao) {
		this.tempodedecomposicao = tempodedecomposicao;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
