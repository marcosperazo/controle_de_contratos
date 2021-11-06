package com.perazo.controle_de_contratos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perazo.controle_de_contratos.model.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long>{

}
