package br.com.kaiomartins.salesforce.usuario;

import java.util.List;

import br.com.kaiomartins.salesforce.util.DAOFactory;

public class UsuarioRN {
	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}

	public Usuario carregar(Integer idPessoa) {
		return this.usuarioDAO.carregar(idPessoa);
	}

	public Usuario buscaPorLogin(String login) {
		return this.usuarioDAO.buscaPorLogin(login);
	}

	public void salvar(Usuario usuario) {
		Integer idPessoa = usuario.getIdPessoa();
		if (idPessoa == null || idPessoa == 0) {
			this.usuarioDAO.salvar(usuario);
		}
	}

	public void excluir(Usuario usuario) {
		this.usuarioDAO.excluir(usuario);
	}

	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}
}
