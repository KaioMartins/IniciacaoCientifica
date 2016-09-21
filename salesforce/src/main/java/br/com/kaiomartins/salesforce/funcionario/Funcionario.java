package br.com.kaiomartins.salesforce.funcionario;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.kaiomartins.salesforce.cliente.Cliente;
import br.com.kaiomartins.salesforce.pessoa.Pessoa;

@Entity
public class Funcionario extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -274854337533806638L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int funcionarioId;

	private boolean ativo;
	private String cargo;
	private float salario;
	private float comissao;
	private String login;
	private String senha;

	@OneToMany(mappedBy = "funcionario", targetEntity = Cliente.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Cliente> clientes;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + Float.floatToIntBits(comissao);
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + Float.floatToIntBits(salario);
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (ativo != other.ativo)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (Float.floatToIntBits(comissao) != Float.floatToIntBits(other.comissao))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}



	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}
