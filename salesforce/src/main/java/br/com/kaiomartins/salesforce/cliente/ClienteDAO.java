package br.com.kaiomartins.salesforce.cliente;

import java.util.List;

public interface ClienteDAO {
	public void salvar(Cliente cliente);

	public void excluir(Cliente cliente);

	public Cliente carregar(Integer idPessoa);

	public List<Cliente> listar();
}
