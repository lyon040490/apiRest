package com.servicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping
	public String Inico() {
		return "Bienvenido a la pagina de inicio.";
	}

}
