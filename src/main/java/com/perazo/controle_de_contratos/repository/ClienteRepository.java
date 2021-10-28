package com.perazo.controle_de_contratos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perazo.controle_de_contratos.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
		
		
		
}
