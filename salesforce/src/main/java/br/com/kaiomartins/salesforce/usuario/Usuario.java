package br.com.kaiomartins.salesforce.usuario;

import java.io.Serializable;

import javax.persistence.Entity;

import br.com.kaiomartins.salesforce.pessoa.Pessoa;

@Entity
public class Usuario extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -274854337533806638L;
	private int funcStatus;
	private String cargo;
	private float salario;
	private float comissao;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + Float.floatToIntBits(comissao);
		result = prime * result + funcStatus;
		result = prime * result + Float.floatToIntBits(salario);
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
		Usuario other = (Usuario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (Float.floatToIntBits(comissao) != Float.floatToIntBits(other.comissao))
			return false;
		if (funcStatus != other.funcStatus)
			return false;
		if (Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
			return false;
		return true;
	}

	public int getFuncStatus() {
		return funcStatus;
	}

	public void setFuncStatus(int funcStatus) {
		this.funcStatus = funcStatus;
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
