package com.perazo.controle_de_contratos.dto;

import com.perazo.controle_de_contratos.model.Cliente;

public class RequisicaoNovoCliente {

	private String cpfCliente;
	private String nomeCliente;
	private String identidadeCliente;
	private String emailCliente;
	private String telefoneCliente;
	private String nomeRepresentanteCliente;
	private String emailRepresentanteCliente;
	private String telefoneRepresentanteCliente;
	private String observacaoCliente;
	
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getIdentidadeCliente() {
		return identidadeCliente;
	}
	public void setIdentidadeCliente(String identidadeCliente) {
		this.identidadeCliente = identidadeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getNomeRepresentanteCliente() {
		return nomeRepresentanteCliente;
	}
	public void setNomeRepresentanteCliente(String nomeRepresentanteCliente) {
		this.nomeRepresentanteCliente = nomeRepresentanteCliente;
	}
	public String getEmailRepresentanteCliente() {
		return emailRepresentanteCliente;
	}
	public void setEmailRepresentanteCliente(String emailRepresentanteCliente) {
		this.emailRepresentanteCliente = emailRepresentanteCliente;
	}
	public String getTelefoneRepresentanteCliente() {
		return telefoneRepresentanteCliente;
	}
	public void setTelefoneRepresentanteCliente(String telefoneRepresentanteCliente) {
		this.telefoneRepresentanteCliente = telefoneRepresentanteCliente;
	}
	public String getObservacaoCliente() {
		return observacaoCliente;
	}
	public void setObservacaoCliente(String observacaoCliente) {
		this.observacaoCliente = observacaoCliente;
	}
	public Cliente toCliente() {
		
		Cliente cliente = new Cliente();
		cliente.setCpf(cpfCliente);
		cliente.setNome(nomeCliente);
		cliente.setIdentidade(identidadeCliente);
		cliente.setEmail(emailCliente);
		cliente.setTelefone(telefoneCliente);
		cliente.setRepresentante(nomeRepresentanteCliente);
		cliente.setEmailRepresentante(emailRepresentanteCliente);
		cliente.setTelefoneRepresentante(telefoneRepresentanteCliente);
		cliente.setObservacao(observacaoCliente);
		
		return cliente;
	}
	
	
	
	
	
}
