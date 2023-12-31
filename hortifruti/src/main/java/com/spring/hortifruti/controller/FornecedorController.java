package com.spring.hortifruti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.hortifruti.model.Fornecedor;
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

	@RequestMapping(value = "alterar-fornecedor/{idFornecedor}", method = RequestMethod.GET)
	public ModelAndView formAlterarFornecedor(@PathVariable("idFornecedor") int idFornecedor) {
		Fornecedor fornecedor = fr.findById(idFornecedor);
		ModelAndView mv = new ModelAndView("alterar-fornecedor");
		mv.addObject("fornecedor", fornecedor);

		return mv;
	}

	@RequestMapping(value = "alterarFornecedor/{idFornecedor}", method = RequestMethod.POST)
	public String alterarFornecedor(@Validated Fornecedor fornecedor, BindingResult result,
			RedirectAttributes attributes) {
		fr.save(fornecedor);
		return "redirect:/listar-fornecedores";
	}

	@RequestMapping(value = "excluir-fornecedor")
	public String excluirFornecedor(int idFornecedor) {
		fr.deleteById(idFornecedor);
		return "redirect:/listar-fornecedores";
	}

}
