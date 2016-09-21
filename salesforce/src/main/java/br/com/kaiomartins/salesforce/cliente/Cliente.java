package br.com.kaiomartins.salesforce.cliente;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.kaiomartins.salesforce.funcionario.Funcionario;
import br.com.kaiomartins.salesforce.pessoa.Pessoa;

@Entity
public class Cliente extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6972081221500600357L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int clienteId;

	private String descricao;
	private String produtoVendido;
	private String secretaria;
	private String empresa;
	private boolean ativo;
	private String localizacao;

	@ManyToOne
	@JoinColumn(name = "funcionarioId")
	private Funcionario funcionario;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getProdutoVendido() {
		return produtoVendido;
	}

	public void setProdutoVendido(String produtoVendido) {
		this.produtoVendido = produtoVendido;
	}

	public String getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((localizacao == null) ? 0 : localizacao.hashCode());
		result = prime * result + ((produtoVendido == null) ? 0 : produtoVendido.hashCode());
		result = prime * result + ((secretaria == null) ? 0 : secretaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (ativo != other.ativo)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (localizacao == null) {
			if (other.localizacao != null)
				return false;
		} else if (!localizacao.equals(other.localizacao))
			return false;
		if (produtoVendido == null) {
			if (other.produtoVendido != null)
				return false;
		} else if (!produtoVendido.equals(other.produtoVendido))
			return false;
		if (secretaria == null) {
			if (other.secretaria != null)
				return false;
		} else if (!secretaria.equals(other.secretaria))
			return false;
		return true;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
