package com.perazo.controle_de_contratos.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.perazo.controle_de_contratos.model.Cliente;

@Controller
public class ClienteController {

	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/clientes")
	public String Clientes(Model model) {
		
		Query query = entityManager.createQuery("select c from Cliente c", Cliente.class);
		List<Cliente> clientes = query.getResultList();
		
		model.addAttribute("clientes", clientes);
		return "clientes";
	}
	
}
