package br.com.kaiomartins.salesforce.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.kaiomartins.salesforce.produto.Produto;

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


}
