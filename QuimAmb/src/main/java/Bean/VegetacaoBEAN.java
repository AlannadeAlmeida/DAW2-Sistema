package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.VegetacaoService;
import entities.Vegetacao;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class VegetacaoBEAN {
	
	@Inject
	private VegetacaoService service;

	private Vegetacao vegetacao;
	
	private List<Vegetacao> vegetacoes;
	
	
	
	public List<Vegetacao> getVegetacoes() {
		return vegetacoes;
	}
	
	public void setElementos(List<Vegetacao> vegetacoes) {
		this.vegetacoes = vegetacoes;
	}
	
	
	public Vegetacao getVegetacao() {
		return vegetacao;
	}
	
	public void setVegetacao(Vegetacao vegetacao) {
		this.vegetacao = vegetacao;
	}
	
	public void save() {
		getService().save(vegetacao);
		limpar();
	}

	public void editar(Long id) {
		this.getVegetacao().setId(id);
		save();
	}

	public void limpar() {
		vegetacoes = getService().getAll();
		vegetacao = newEntidade();
	}

	protected Vegetacao newEntidade() {
		return new Vegetacao();
	}

	public VegetacaoService getService() {
		return service;
	}

}
