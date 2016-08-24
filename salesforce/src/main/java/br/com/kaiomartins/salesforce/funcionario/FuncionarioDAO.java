package br.com.kaiomartins.salesforce.funcionario;

import java.util.List;


public interface FuncionarioDAO {
	public void salvar(Funcionario funcionario);

	public void excluir(Funcionario funcionario);

	public Funcionario carregar(Integer idPessoa);

	public Funcionario buscaPorLogin(String login);

	public List<Funcionario> listar();

}
