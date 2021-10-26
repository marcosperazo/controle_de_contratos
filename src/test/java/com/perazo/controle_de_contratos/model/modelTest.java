package com.perazo.controle_de_contratos.model;

public class modelTest {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
	
		cliente.setNome("Jacquelino");
		
		Imovel imovel = new Imovel();

		imovel.setApelido("Prédio Cabocla");
		
		Contrato contrato = new Contrato();
		contrato.setCliente(cliente);
		contrato.setImovel(imovel);
		
		System.out.println(contrato);
		

	}


}
