package br.com.kaiomartins.salesforce.util;

import br.com.kaiomartins.salesforce.usuario.UsuarioDAO;
import br.com.kaiomartins.salesforce.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
