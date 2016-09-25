package br.com.kaiomartins.salesforce.cliente;

import java.util.List;

import org.hibernate.Session;

public class ClienteDAOHibernate implements ClienteDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Cliente cliente) {
		this.session.saveOrUpdate(cliente);
	}

	public void excluir(Cliente cliente) {
		this.session.delete(cliente);
	}

	public Cliente carregar(Integer clienteId) {
		return (Cliente) this.session.get(Cliente.class, clienteId);
	}
	public List<Cliente> listar() {
		return this.session.createCriteria(Cliente.class).list();
	}
}
