package com.perazo.controle_de_contratos.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "contratos")
public class Contrato {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Imovel imovel;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Cliente cliente;
	
	private BigDecimal valorAluguel;
	private LocalDate dataContratacao;
	private Period periodo;
	private LocalDate dataFim;
	private LocalDate dataReajuste;
	private LocalDate dataPagamento;
	

	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public BigDecimal getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(BigDecimal valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public LocalDate getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public Period getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Period periodo) {
		this.periodo = periodo;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public LocalDate getDataReajuste() {
		return dataReajuste;
	}
	public void setDataReajuste(LocalDate dataReajuste) {
		this.dataReajuste = dataReajuste;
	}
	public LocalDate getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	@Override
	public String toString() {
		
		return "Contrato - " + imovel + ", locatário: " + cliente;
	}
	
}
