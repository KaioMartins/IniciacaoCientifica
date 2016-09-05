package br.com.kaiomartins.salesforce.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.kaiomartins.salesforce.cliente.Cliente;
import br.com.kaiomartins.salesforce.cliente.ClienteRN;

@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean {
	private Cliente cliente = new Cliente();
	private List<Cliente> lista;
	private String destinoSalvar;


	public String novo() {
		this.destinoSalvar = "clientesucesso";
		this.cliente = new Cliente();
		this.cliente.setAtivo(true);
		return "cad_cliente";
	}

	public String salvar() {
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(this.cliente);
		return this.destinoSalvar;

	}

	public String editar() {
		this.destinoSalvar = "clientesucesso";
		return "cad_cliente";
	}

	public String excluir() {
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.excluir(cliente);
		this.lista = null;
		return null;
	}

	public String ativar() {
		if (this.cliente.isAtivo()) {
			this.cliente.setAtivo(false);
		} else {
			this.cliente.setAtivo(true);
		}
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(this.cliente);
		return null;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
		if (this.lista == null) {
			ClienteRN clienteRN = new ClienteRN();
			this.lista = clienteRN.listar();
		}
		return lista;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}


}
