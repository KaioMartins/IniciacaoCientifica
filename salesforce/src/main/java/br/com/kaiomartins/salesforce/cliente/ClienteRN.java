package br.com.kaiomartins.salesforce.cliente;

import java.util.List;

import br.com.kaiomartins.salesforce.util.DAOFactory;

public class ClienteRN {
	private ClienteDAO clienteDAO;

	public ClienteRN() {
		this.clienteDAO = DAOFactory.criarClienteDAO();
	}

	public void salvar(Cliente cliente) {
		this.clienteDAO.salvar(cliente);
	}

	public void excluir(Cliente cliente) {
		this.clienteDAO.excluir(cliente);
	}

	public List<Cliente> listar() {
		return this.clienteDAO.listar();
	}

	public Cliente carregar(Integer clienteId) {
		return this.clienteDAO.carregar(clienteId);
	}
}
