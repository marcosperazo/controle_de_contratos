package com.perazo.controle_de_contratos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.perazo.controle_de_contratos.model.Imovel;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long>{

}
