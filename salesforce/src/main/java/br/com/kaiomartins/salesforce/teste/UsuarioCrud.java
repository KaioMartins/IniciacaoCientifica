package br.com.kaiomartins.salesforce.teste;

import org.hibernate.Session;

import br.com.kaiomartins.salesforce.funcionario.Funcionario;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioRN;

public class UsuarioCrud {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return session;
	}

	public static void main(String[] args) {
		FuncionarioRN usuarioRN = new FuncionarioRN();
		Funcionario usuario = new Funcionario();

		try {

			usuario.setNome("joao");
			usuario.setEndereco("Rua Waldir Lacerda, 349");
			usuario.setCidade("Tanabi");
			usuario.setTelefone("123456");
			usuario.setCelular("98764");
			usuario.setEmail("kaio.ccmartins@gmail.com");
			usuario.setFuncStatus(1);
			usuario.setCargo("Vendedor");
			usuario.setSalario(2500);
			usuario.setComissao(200);


			usuarioRN.salvar(usuario);

			System.out.println("Cadastro efetuado !!");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {

		}



	}

}
