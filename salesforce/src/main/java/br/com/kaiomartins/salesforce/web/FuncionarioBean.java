package br.com.kaiomartins.salesforce.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.kaiomartins.salesforce.funcionario.Funcionario;
import br.com.kaiomartins.salesforce.funcionario.FuncionarioRN;

@ManagedBean(name = "funcionarioBean")
@RequestScoped
public class FuncionarioBean {
	private Funcionario funcionario = new Funcionario();

	public String novo() {
		this.funcionario = new Funcionario();
		this.funcionario.setStatus(true);
		return "/admin/cad_funcionario";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.salvar(this.funcionario);

		return "sucesso";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	

}
