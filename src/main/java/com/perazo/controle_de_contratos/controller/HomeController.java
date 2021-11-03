package com.perazo.controle_de_contratos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/") 
	public String home() {
		return "home";
	}
}

