package com.perazo.controle_de_contratos.dto;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.perazo.controle_de_contratos.model.Imovel;

public class RequisicaoImovel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 1, max = 50)
	private String apelidoImovel;
	@Size(min = 0, max = 20)
	private String inscricaoMunicipalImovel;
	@Size(min = 0, max = 50)
	private String matriculaImovel;
	@NotBlank
	@Size(min = 10, max = 255)
	private String enderecoImovel;	
	private BigDecimal valorCondominioImovel;
	private BigDecimal valorIPTUImovel;
	@Size(min = 0, max = 255)
	private String descricaoImovel;
	@Size(min = 0, max = 255)
	private String observacaoImovel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getApelidoImovel() {
		return apelidoImovel;
	}
	public void setApelidoImovel(String apelidoImovel) {
		this.apelidoImovel = apelidoImovel;
	}
	public String getInscricaoMunicipalImovel() {
		return inscricaoMunicipalImovel;
	}
	public void setInscricaoMunicipalImovel(String inscricaoMunicipalImovel) {
		this.inscricaoMunicipalImovel = inscricaoMunicipalImovel;
	}
	public String getMatriculaImovel() {
		return matriculaImovel;
	}
	public void setMatriculaImovel(String matriculaImovel) {
		this.matriculaImovel = matriculaImovel;
	}
	public String getEnderecoImovel() {
		return enderecoImovel;
	}
	public void setEnderecoImovel(String enderecoImovel) {
		this.enderecoImovel = enderecoImovel;
	}
	public BigDecimal getValorCondominioImovel() {
		return valorCondominioImovel;
	}
	public void setValorCondominioImovel(BigDecimal valorCondominioImovel) {
		this.valorCondominioImovel = valorCondominioImovel;
	}
	public BigDecimal getValorIPTUImovel() {
		return valorIPTUImovel;
	}
	public void setValorIPTUImovel(BigDecimal valorIPTUImovel) {
		this.valorIPTUImovel = valorIPTUImovel;
	}
	public String getDescricaoImovel() {
		return descricaoImovel;
	}
	public void setDescricaoImovel(String descricaoImovel) {
		this.descricaoImovel = descricaoImovel;
	}
	public String getObservacaoImovel() {
		return observacaoImovel;
	}
	public void setObservacaoImovel(String observacaoImovel) {
		this.observacaoImovel = observacaoImovel;
	}
	
	public Imovel toImovel() {
		
		Imovel imovel = new Imovel();
		
		imovel.setApelido(apelidoImovel);
		imovel.setEndereco(enderecoImovel);
		imovel.setDescricao(descricaoImovel);
		imovel.setInscricaoMunicipal(inscricaoMunicipalImovel);
		imovel.setObservacao(observacaoImovel);
		imovel.setValorCondominio(valorCondominioImovel);
		imovel.setValorIPTU(valorIPTUImovel);
		imovel.setMatricula(matriculaImovel);
		
		return imovel;
	}
	
}
