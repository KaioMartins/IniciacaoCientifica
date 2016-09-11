package br.com.kaiomartins.salesforce.produto;

import java.util.List;

import org.hibernate.Session;

public class ProdutoDAOHibernate implements ProdutoDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Produto produto) {
		this.session.saveOrUpdate(produto);
	}

	public void excluir(Produto produto) {
		this.session.delete(produto);
	}

	public Produto carregar(Integer idProduto) {
		return (Produto) this.session.get(Produto.class, idProduto);
	}

	public List<Produto> listar() {
		return this.session.createCriteria(Produto.class).list();
	}
}
