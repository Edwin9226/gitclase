package com.kruger.intro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	
	// Generar un listado 
	// generar un ingreso d edatos 
	// ver una datos de usuario 
	
	@GetMapping({"/index","/","","/home"})
	public String index(Model model) {
	model.addAttribute("message", "Este es un mensaje desede Usuario");

	return "index";
	}

}
