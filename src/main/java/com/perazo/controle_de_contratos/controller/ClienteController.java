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
	public String clientedetalhes(@PathVariable("id") Long id, Model model) {
		Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		model.addAttribute("cliente", cliente);
		return "cliente/detalhescliente";
	}
		
	@GetMapping("/delete/{id}")
	public String deleteCliente(@PathVariable("id") Long id, Model model) {
		Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		clienteRepository.delete(cliente);
		return "redirect:/clientes";
	}
	
	@GetMapping("/atualizar/{id}")
	public String editarCliente(@PathVariable("id") Long id, Model model) {
		Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("id " + id + " é inválido"));
		model.addAttribute("cliente", cliente);
		return "cliente/formulario";
	}
	
		
}
