package br.com.kaiomartins.salesforce.web;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.kaiomartins.salesforce.cliente.Cliente;
import br.com.kaiomartins.salesforce.cliente.ClienteRN;
import br.com.kaiomartins.salesforce.funcionario.Funcionario;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioRN;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();
	private Cliente cliente = new Cliente();
	private List<Funcionario> lista;
	private List<Cliente> listaClientes;
	private String destinoSalvar;



	public String novo() {
		try {
			this.destinoSalvar = "funcionariosucesso";
			this.funcionario = new Funcionario();
			this.funcionario.setAtivo(true);
			return "cad_funcionario";
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		
	}

	public String editar() {
		this.destinoSalvar = "funcionariosucesso";
		return "cad_funcionario";
	}

	public String salvar() {
		try {
			FacesContext context = FacesContext.getCurrentInstance();

			Set<Cliente> clientes = new HashSet<>(listaClientes);

			FuncionarioRN funcionarioRN = new FuncionarioRN();
			this.funcionario.setClientes(clientes);
			funcionarioRN.salvar(this.funcionario);

			return this.destinoSalvar;

		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public String excluir() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.excluir(funcionario);
		this.lista = null;
		return null;
	}

	public String ativar() {
		if (this.funcionario.isAtivo()) {
			this.funcionario.setAtivo(false);
		} else {
			this.funcionario.setAtivo(true);

		}
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.salvar(this.funcionario);
		return null;
	}

	public List<Cliente> getListaClientes() {
		if (this.listaClientes == null) {
			ClienteRN clienteRN = new ClienteRN();
			this.listaClientes = clienteRN.listar();
		}
		return this.listaClientes;
	}

	public List<Funcionario> getLista() {
		if (this.lista == null) {
			FuncionarioRN funcionarioRN = new FuncionarioRN();
			this.lista = funcionarioRN.listar();
		}
		return this.lista;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setLista(List<Funcionario> lista) {
		this.lista = lista;
	}



	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


}
