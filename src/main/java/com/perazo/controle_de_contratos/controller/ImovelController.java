package com.perazo.controle_de_contratos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.perazo.controle_de_contratos.dto.RequisicaoImovel;
import com.perazo.controle_de_contratos.model.Imovel;
import com.perazo.controle_de_contratos.repository.ImovelRepository;

@Controller
@RequestMapping("imoveis")
public class ImovelController {

	@Autowired
	private ImovelRepository imovelRepository;

	@GetMapping("")
	public String Imoveis(Model model) {
		
		List<Imovel> imoveis = imovelRepository.findAll();
		model.addAttribute("imoveis", imoveis);
		return "imovel/imoveis";
	}

	@GetMapping("/formulario")
	public String formulario(RequisicaoImovel requisicao) {
		
		return "imovel/formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoImovel requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "imovel/formulario";
		}
		
		Imovel imovel = requisicao.toImovel();
		imovelRepository.save(imovel);
		
		return "redirect:/imoveis";
	}
	
	@GetMapping("/{id}")
	public String imoveldetalhes(@PathVariable("id") Long id, Model model) {
		Imovel imovel = imovelRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		model.addAttribute("imovel", imovel);
		return "imovel/detalhes-imovel";
	}
		
	@GetMapping("/delete/{id}")
	public String deleteImovel(@PathVariable("id") Long id, Model model) {
		Imovel imovel = imovelRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		imovelRepository.delete(imovel);
		return "redirect:/imoveis";
	}
	
	@GetMapping("/atualizarForm/{id}")
	public String mostrarFormEditar(@PathVariable("id") Long id, Model model) {
		Imovel imovel = imovelRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		model.addAttribute("imovel", imovel);
		return "imovel/form-editar";
	}
	
	
	@PostMapping("/update/{id}")
	public String update(@PathVariable("id") long id, @Valid Imovel imovel, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	        return "imovel/form-editar";
	    }
	    
	    imovelRepository.save(imovel);
	    return "redirect:/imoveis";
	}
	
		
}

