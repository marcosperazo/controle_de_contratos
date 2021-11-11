package com.perazo.controle_de_contratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/{id}")
	public String contratoDetalhes(@PathVariable("id") Long id, Model model) {
		Contrato contrato = contratoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		model.addAttribute("contrato", contrato);
		return "contrato/detalhes-contrato";
	}
		
	@GetMapping("/delete/{id}")
	public String deleteContrato(@PathVariable("id") Long id, Model model) {
		Contrato contrato = contratoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		contratoRepository.delete(contrato);
		return "redirect:/contratos";
	}
	
	
	
	
}
