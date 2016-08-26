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
	private String tabelaDados;

	public String retornar() {
		return this.tabelaDados;
	}

	public String novo() {

		this.destinoSalvar = "sucesso";
		this.cliente = new Cliente();
		this.cliente.setAtivo(true);
		return "cad_cliente";
	}

	public String salvar() {
		this.tabelaDados = "cliente";
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(this.cliente);
		return this.destinoSalvar;

	}

	public String editar() {
		this.destinoSalvar = "cliente";
		return "cad_cliente";
	}

	public String excluir() {
		ClienteRN clienteRN = new ClienteRN();
		clienteRN.excluir(cliente);
		this.lista = null;
		return null;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
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

	public String getTabelaDados() {
		return tabelaDados;
	}

	public void setTabelaDados(String tabelaDados) {
		this.tabelaDados = tabelaDados;
	}
}
