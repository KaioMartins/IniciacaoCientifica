package br.com.kaiomartins.salesforce.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.kaiomartins.salesforce.produto.Produto;
import br.com.kaiomartins.salesforce.produto.ProdutoRN;

@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Produto> lista;
	private String destinoSalvar;

	public String novo() {
		this.destinoSalvar = "produtosucesso";
		this.produto = new Produto();
		this.produto.setAtivo(true);
		return "cad_produto";
	}

	public String salvar(){
		ProdutoRN produtoRN = new ProdutoRN();
		produtoRN.salvar(this.produto);
		return this.destinoSalvar;
	}

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListar() {
		return lista;
	}

	public void setListar(List<Produto> lista) {
		this.lista = lista;
	}

}
