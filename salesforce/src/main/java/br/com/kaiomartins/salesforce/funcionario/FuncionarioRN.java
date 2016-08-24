package br.com.kaiomartins.salesforce.funcionario;

import java.util.List;

import br.com.kaiomartins.salesforce.util.DAOFactory;

public class FuncionarioRN {
	private FuncionarioDAO usuarioDAO;

	public FuncionarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}

	public Funcionario carregar(Integer idPessoa) {
		return this.usuarioDAO.carregar(idPessoa);
	}

	public Funcionario buscaPorLogin(String login) {
		return this.usuarioDAO.buscaPorLogin(login);
	}

	public void salvar(Funcionario usuario) {
		Integer idPessoa = usuario.getIdPessoa();
		if (idPessoa == null || idPessoa == 0) {
			this.usuarioDAO.salvar(usuario);
		}
	}

	public void excluir(Funcionario usuario) {
		this.usuarioDAO.excluir(usuario);
	}

	public List<Funcionario> listar() {
		return this.usuarioDAO.listar();
	}
}
