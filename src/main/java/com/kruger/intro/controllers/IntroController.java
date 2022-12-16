package com.kruger.intro.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {

	@Value("${texto.properties.index.titulo}")
	private String textoIndex;
	
	@GetMapping({"/index1"})
	public String index(Model model) {
	model.addAttribute("message", "Este es un mensaje desde MVC");
	model.addAttribute("textoIndex", textoIndex);
	
	model.getAttribute(textoIndex);
	 System.out.println(textoIndex);
		return "index1";
	}
}
