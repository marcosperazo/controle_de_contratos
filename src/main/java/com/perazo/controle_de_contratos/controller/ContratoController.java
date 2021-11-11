package com.perazo.controle_de_contratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perazo.controle_de_contratos.model.Contrato;
import com.perazo.controle_de_contratos.repository.ContratoRepository;

@Controller
@RequestMapping("contratos")
public class ContratoController {

	@Autowired
	private ContratoRepository contratoRepository;

	@GetMapping("")
	public String Contratos(Model model) {
		
		List<Contrato> contratos = contratoRepository.findAll();
		model.addAttribute("contratos", contratos);
		return "contrato/contratos";
	}
	
}
