package br.com.kaiomartins.salesforce.usuario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class UsuarioDAOHibernate implements UsuarioDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Usuario usuario) {
		session.beginTransaction();
		this.session.saveOrUpdate(usuario);

	}

	public void excluir(Usuario usuario) {
		this.session.delete(usuario);

	}

	public Usuario carregar(Integer idPessoa) {
		return (Usuario) this.session.get(Usuario.class, idPessoa);
	}

	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();

	}

	public Usuario buscaPorLogin(String login) {
		String hql = "select u from Usuario u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
		return (Usuario) consulta.uniqueResult();
	}
}
