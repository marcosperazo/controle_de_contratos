package com.perazo.controle_de_contratos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perazo.controle_de_contratos.model.Imovel;
import com.perazo.controle_de_contratos.repository.ImovelRepository;

@Controller
@RequestMapping("imoveis")
public class ImovelController {

	@Autowired
	private ImovelRepository imovelRepository;

	@GetMapping("")
	public String Clientes(Model model) {
		
		List<Imovel> imoveis = imovelRepository.findAll();
		model.addAttribute("imoveis", imoveis);
		return "imovel/imoveis";
	}
}
