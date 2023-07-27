package com.spring.hortifruti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.hortifruti.model.Fornecedor;
import com.spring.hortifruti.model.Produto;
import com.spring.hortifruti.repository.FornecedorRepository;

@Controller
public class FornecedorController {
	
	@Autowired
	private FornecedorRepository fr;
	
	@RequestMapping(value = "cadastrar-fornecedor", method = RequestMethod.GET)
	public String cadastrarFornecedor() {
		return "cadastrar-fornecedor";
	}
	
	@RequestMapping(value = "cadastrar-fornecedor", method = RequestMethod.POST)
	public String cadastrarFornecedor(Fornecedor fornecedor) {
		fr.save(fornecedor);
		return "redirect:/listar-fornecedores";
	}
	
	@RequestMapping("listar-fornecedores")
	public ModelAndView listarFornecedores() {
		ModelAndView mv = new ModelAndView("/listar-fornecedores");
		Iterable<Fornecedor> fornecedores = fr.findAll();
		mv.addObject("fornecedores", fornecedores);

		return mv;
	}
}
