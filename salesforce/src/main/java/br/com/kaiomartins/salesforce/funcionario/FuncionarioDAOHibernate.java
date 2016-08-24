package br.com.kaiomartins.salesforce.funcionario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class FuncionarioDAOHibernate implements FuncionarioDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Funcionario funcionario) {
		session.beginTransaction();
		this.session.saveOrUpdate(funcionario);

	}

	public void excluir(Funcionario funcionario) {
		this.session.delete(funcionario);

	}

	public Funcionario carregar(Integer idPessoa) {
		return (Funcionario) this.session.get(Funcionario.class, idPessoa);
	}

	public List<Funcionario> listar() {
		return this.session.createCriteria(Funcionario.class).list();

	}

	public Funcionario buscaPorLogin(String login) {
		String hql = "select u from Funcionario u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
		return (Funcionario) consulta.uniqueResult();
	}
}
