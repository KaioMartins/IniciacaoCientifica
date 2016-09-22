package br.com.kaiomartins.salesforce.produto;

import java.util.List;

public class ProdutoRN {
	private ProdutoDAO produtoDAO;

	/*
	 * public ProdutoRN() { this.produtoDAO = DAOFactory.criarProdutoDAO(); }
	 */

	public Produto carregar(Integer idProduto) {
		return this.produtoDAO.carregar(idProduto);
	}

	public void salvar(Produto produto) {
		Integer estoque = produto.getEstoque();
		Integer qtd = produto.getQuantidade();
		estoque = estoque + qtd;

		this.produtoDAO.salvar(produto);
	}

	public void excluir(Produto produto) {
		this.produtoDAO.excluir(produto);
	}

	public List<Produto> lista() {
		return this.produtoDAO.listar();
	}
}
