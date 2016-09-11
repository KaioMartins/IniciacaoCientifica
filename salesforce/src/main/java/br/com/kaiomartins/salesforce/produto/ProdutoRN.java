package br.com.kaiomartins.salesforce.produto;

import java.util.List;

import br.com.kaiomartins.salesforce.util.DAOFactory;

public class ProdutoRN {
	private ProdutoDAO produtoDAO;

	public ProdutoRN() {
		this.produtoDAO = DAOFactory.criarProdutoDAO();
	}

	public Produto carregar(Integer idProduto) {
		return this.produtoDAO.carregar(idProduto);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	public void excluir(Produto produto) {
		this.produtoDAO.excluir(produto);
	}

	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}
}
