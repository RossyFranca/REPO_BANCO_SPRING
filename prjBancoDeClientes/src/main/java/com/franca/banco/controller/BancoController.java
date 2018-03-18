package com.franca.banco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BancoController {
	@GetMapping("/banco")
	public String listar() {
		return "ListaBanco";
	}
}
