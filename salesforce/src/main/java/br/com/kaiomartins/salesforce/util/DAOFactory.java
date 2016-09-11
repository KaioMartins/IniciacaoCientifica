package br.com.kaiomartins.salesforce.util;

import br.com.kaiomartins.salesforce.cliente.ClienteDAO;
import br.com.kaiomartins.salesforce.cliente.ClienteDAOHibernate;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioDAO;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioDAOHibernate;
import br.com.kaiomartins.salesforce.produto.ProdutoDAO;
import br.com.kaiomartins.salesforce.produto.ProdutoDAOHibernate;

public class DAOFactory {
	public static FuncionarioDAO criarFuncionarioDAO() {
		FuncionarioDAOHibernate funcionarioDAO = new FuncionarioDAOHibernate();
		funcionarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return funcionarioDAO;
	}

	public static ClienteDAO criarClienteDAO() {
		ClienteDAOHibernate clienteDAO = new ClienteDAOHibernate();
		clienteDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return clienteDAO;
	}

	public static ProdutoDAO criarProdutoDAO() {
		ProdutoDAOHibernate produtoDAO = new ProdutoDAOHibernate();
		produtoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return produtoDAO;
	}
}
