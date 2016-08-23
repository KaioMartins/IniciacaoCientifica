package br.com.kaiomartins.salesforce.usuario;

import java.util.List;


public interface UsuarioDAO {
	public void salvar(Usuario usuario);

	public void excluir(Usuario usuario);

	public Usuario carregar(Integer idPessoa);

	public Usuario buscaPorLogin(String login);

	public List<Usuario> listar();

}
