package com.perazo.controle_de_contratos.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.perazo.controle_de_contratos.dto.RequisicaoNovoCliente;
import com.perazo.controle_de_contratos.model.Cliente;
import com.perazo.controle_de_contratos.repository.ClienteRepository;

@Controller
@RequestMapping("clientes")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("")
	public String Clientes(Model model) {
		
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clientes", clientes);
		return "cliente/clientes";
	}
	
	@GetMapping("/formulario")
	public String formulario(RequisicaoNovoCliente requisicao) {
		
		return "cliente/formulario";
	}
	
	@PostMapping("/novo")
	public String novo(@Valid RequisicaoNovoCliente requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "cliente/formulario";
		}
		
		Cliente cliente = requisicao.toCliente();
		clienteRepository.save(cliente);
		
		return "redirect:/clientes";
	}
	
	@GetMapping("/{id}")
	public ModelAndView clientedetalhes(@PathVariable Long id) {
		Optional<Cliente> optional = this.clienteRepository.findById(id);
		if(optional.isPresent()) {
			Cliente cliente = optional.get();
			ModelAndView mv = new ModelAndView();
			mv.setViewName("cliente/detalhescliente");
			mv.addObject("cliente", cliente);
			return mv;
			
		} else {
			System.out.println("$$$$$$$ NÃO ENCONTROU O CLIENTE COM ID " + id + " $$$$$$$");
			return new ModelAndView( "redirect:/clientes");
			
		}		
	}
	
	/*
	 * @ExceptionHandler(IllegalArgumentException.class) public String onError() {
	 * return "redirect:/clientes"; }
	 */
	
}
