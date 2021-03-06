package com.perazo.controle_de_contratos.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imoveis")
public class Imovel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50)
	private String apelido;
	@Column(length = 20)
	private String inscricaoMunicipal;
	@Column(length = 50)
	private String matricula;
	@Column(length = 255)
	private String endereco;	
	private BigDecimal valorCondominio;
	private BigDecimal valorIPTU;
	@Column(length = 255)
	private String descricao;
	@Column(length = 255)
	private String observacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public BigDecimal getValorCondominio() {
		return valorCondominio;
	}
	public void setValorCondominio(BigDecimal valorCondominio) {
		this.valorCondominio = valorCondominio;
	}
	public BigDecimal getValorIPTU() {
		return valorIPTU;
	}
	public void setValorIPTU(BigDecimal valorIPTU) {
		this.valorIPTU = valorIPTU;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	@Override
	public String toString() {
		
		return "Im??vel: " + apelido + ", c??digo de identifica????o: " + id;
	}
}
