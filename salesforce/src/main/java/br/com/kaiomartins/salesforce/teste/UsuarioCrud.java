package br.com.kaiomartins.salesforce.teste;

import org.hibernate.Session;

import br.com.kaiomartins.salesforce.usuario.Usuario;
import br.com.kaiomartins.salesforce.usuario.UsuarioRN;

public class UsuarioCrud {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public static void main(String[] args) {
		UsuarioRN usuarioRN = new UsuarioRN();
		Usuario usuario = new Usuario();


		usuario.setNome("Paranaue");
		usuario.setEndereco("Rua Waldir Lacerda, 349");
		usuario.setCidade("Tanabi");
		usuario.setTelefone("123456");
		usuario.setCelular("98764");
		usuario.setEmail("kaio.ccmartins@gmail.com");
		usuario.setFuncStatus(1);
		usuario.setCargo("Vendedor");
		usuario.setSalario(2500);
		usuario.setComissao(200);

		UsuarioCrud usuarioCrud = new UsuarioCrud();

		usuarioCrud.session.beginTransaction();
		usuarioRN.salvar(usuario);
		usuarioCrud.session.getTransaction().commit();
		System.out.println("Cadastro efetuado !!");

	}

}
