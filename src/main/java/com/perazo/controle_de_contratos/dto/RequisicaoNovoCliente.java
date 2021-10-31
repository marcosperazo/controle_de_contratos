package com.perazo.controle_de_contratos.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.perazo.controle_de_contratos.model.Cliente;

public class RequisicaoNovoCliente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min = 11, max = 14)
	private String cpfCliente;
	
	@NotBlank
	@Size(min = 10, max = 100)
	private String nomeCliente;
	
	@Size(min = 0, max = 20)
	private String identidadeCliente;
	
	@Email	
	@Size(min = 0, max = 50)
	private String emailCliente;

	@Size(min = 0, max = 20)
	private String telefoneCliente;
	
	@Size(min = 0, max = 100)
	private String nomeRepresentanteCliente;
	
	@Email
	@Size(min = 0, max = 50)
	private String emailRepresentanteCliente;
	
	@Size(min = 0, max = 20)
	private String telefoneRepresentanteCliente;

	@Size(min = 0, max = 255)
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
