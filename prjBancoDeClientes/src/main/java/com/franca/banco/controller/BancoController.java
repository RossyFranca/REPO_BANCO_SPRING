package com.franca.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.franca.banco.repository.Clientes;

@Controller
public class BancoController {
	/*
	 * @GetMapping("/banco") public String listar() {
	 *  return "ListaBanco"; }
	 */

	@Autowired
	private Clientes clientes;

	@GetMapping("/banco")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaBanco");
		modelAndView.addObject("clientes", clientes.findAll());

		return modelAndView;
	}
}
