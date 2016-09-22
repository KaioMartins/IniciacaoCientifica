package br.com.kaiomartins.salesforce.produto;

import java.util.List;

public interface ProdutoDAO {
	public void salvar(Produto produto);

	public void excluir(Produto produto);

	public Produto carregar(Integer idProduto);

	public List<Produto> listar();

}
