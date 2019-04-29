import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SeresVivos")
public class SeresVivos {
	
	@Id
	@GeneratedValue
	
	private Long id_sv;
	private String especie;
	private String classe;
	public Long getId_sv() {
		return id_sv;
	}
	public void setId_sv(Long id_sv) {
		this.id_sv = id_sv;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_sv == null) ? 0 : id_sv.hashCode());
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
		SeresVivos other = (SeresVivos) obj;
		if (id_sv == null) {
			if (other.id_sv != null)
				return false;
		} else if (!id_sv.equals(other.id_sv))
			return false;
		return true;
	}

}
