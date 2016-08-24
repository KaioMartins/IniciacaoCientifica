package br.com.kaiomartins.salesforce.util;

import br.com.kaiomartins.salesforce.funcionario.FuncionarioDAO;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioDAOHibernate;

public class DAOFactory {
	public static FuncionarioDAO criarUsuarioDAO() {
		FuncionarioDAOHibernate usuarioDAO = new FuncionarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
