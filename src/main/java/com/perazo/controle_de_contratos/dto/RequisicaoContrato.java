package com.perazo.controle_de_contratos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.perazo.controle_de_contratos.model.Contrato;

public class RequisicaoContrato {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private RequisicaoImovel requisicaoImovel;	
	private RequisicaoCliente requisicaoCliente;
	private BigDecimal valorAluguelContrato;
	private LocalDate dataContratacaoContrato;
	private LocalDate dataFimContrato;
	private LocalDate dataReajusteContrato;
	private LocalDate dataPagamentoContrato;
	
	public RequisicaoImovel getRequisicaoImovel() {
		return requisicaoImovel;
	}
	public void setRequisicaoImovel(RequisicaoImovel requisicaoImovel) {
		this.requisicaoImovel = requisicaoImovel;
	}
	public RequisicaoCliente getRequisicaoCliente() {
		return requisicaoCliente;
	}
	public void setRequisicaoCliente(RequisicaoCliente requisicaoCliente) {
		this.requisicaoCliente = requisicaoCliente;
	}
	public BigDecimal getValorAluguelContrato() {
		return valorAluguelContrato;
	}
	public void setValorAluguelContrato(BigDecimal valorAluguelContrato) {
		this.valorAluguelContrato = valorAluguelContrato;
	}
	public LocalDate getDataContratacaoContrato() {
		return dataContratacaoContrato;
	}
	public void setDataContratacaoContrato(LocalDate dataContratacaoContrato) {
		this.dataContratacaoContrato = dataContratacaoContrato;
	}
	public LocalDate getDataFimContrato() {
		return dataFimContrato;
	}
	public void setDataFimContrato(LocalDate dataFimContrato) {
		this.dataFimContrato = dataFimContrato;
	}
	public LocalDate getDataReajusteContrato() {
		return dataReajusteContrato;
	}
	public void setDataReajusteContrato(LocalDate dataReajusteContrato) {
		this.dataReajusteContrato = dataReajusteContrato;
	}
	public LocalDate getDataPagamentoContrato() {
		return dataPagamentoContrato;
	}
	public void setDataPagamentoContrato(LocalDate dataPagamentoContrato) {
		this.dataPagamentoContrato = dataPagamentoContrato;
	}	
	
	public Contrato toContrato() {
		
		Contrato contrato = new Contrato();
		
		contrato.setCliente(null);;
		contrato.setImovel(null);
		contrato.setValorAluguel(valorAluguelContrato);
		contrato.setDataContratacao(dataContratacaoContrato);
		contrato.setDataFim(dataFimContrato);
		contrato.setDataPagamento(dataPagamentoContrato);
		contrato.setDataReajuste(dataReajusteContrato);
		contrato.setValorAluguel(valorAluguelContrato);
		
		
		return contrato;
	}
}
