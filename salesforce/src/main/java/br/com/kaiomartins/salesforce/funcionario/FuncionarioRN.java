package br.com.kaiomartins.salesforce.funcionario;

import java.util.List;

import br.com.kaiomartins.salesforce.util.DAOFactory;

public class FuncionarioRN {
	private FuncionarioDAO funcionarioDAO;

	public FuncionarioRN() {
		this.funcionarioDAO = DAOFactory.criarFuncionarioDAO();
	}

	public Funcionario carregar(Integer idPessoa) {
		return this.funcionarioDAO.carregar(idPessoa);
	}

	public Funcionario buscaPorLogin(String login) {
		return this.funcionarioDAO.buscaPorLogin(login);
	}

	public void salvar(Funcionario funcionario) {
		Integer idPessoa = funcionario.getIdPessoa();
		if (idPessoa == null || idPessoa == 0) {
			this.funcionarioDAO.salvar(funcionario);
		}
	}

	public void excluir(Funcionario funcionario) {
		this.funcionarioDAO.excluir(funcionario);
	}

	public List<Funcionario> listar() {
		return this.funcionarioDAO.listar();
	}
}
