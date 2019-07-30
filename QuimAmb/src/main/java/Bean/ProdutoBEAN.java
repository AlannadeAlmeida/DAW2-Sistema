package Bean;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import Service.ProdutoService;
import entities.Produto;

@Named
@ViewScoped
@SessionScoped
@RequestScoped
public class ProdutoBEAN {

	@Inject
	private ProdutoService service;

	private Produto produto;
	
	private List<Produto> produtos;
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setElemento(Produto produto) {
		this.produto = produto;
	}
	
	public void save() {
		getService().save(produto);
		limpar();
	}

	public void editar(Long id) {
		this.getProduto().setId(id);
		save();
	}

	public void limpar() {
		produtos = getService().getAll();
		produto = newEntidade();
	}

	protected Produto newEntidade() {
		return new Produto();
	}

	public ProdutoService getService() {
		return service;
	}
	
}
