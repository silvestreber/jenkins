package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@GetMapping("/")
	public String prueba() {
		return ""
				+ "<h1 align=\"center\">WORKS!<h1>"
				+ "<h3 align=\"center\">Probando Jenkins<h3>"
				+ "<h4 align=\"center\">Prueba 4<h4>";
	}

}
