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

import com.spring.hortifruti.model.Produto;
import com.spring.hortifruti.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoRepository pr;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "cadastrar-produto", method = RequestMethod.GET)
	public String cadastrarProduto() {
		return "cadastrar-produto";
	}

	@RequestMapping(value = "cadastrar-produto", method = RequestMethod.POST)
	public String cadastrarProduto(Produto produto) {
		pr.save(produto);
		return "redirect:/listar-produtos";
	}

	@RequestMapping("listar-produtos")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView("/listar-produtos");
		Iterable<Produto> produtos = pr.findAll();
		mv.addObject("produtos", produtos);

		return mv;
	}

	@RequestMapping(value = "alterar-produto/{idProduto}", method = RequestMethod.GET)
	public ModelAndView formAlterarProduto(@PathVariable("idProduto") int idProduto) {
		Produto produto = pr.findById(idProduto);
		ModelAndView mv = new ModelAndView("alterar-produto");
		mv.addObject("produto", produto);
		
		return mv;
	}
	
	@RequestMapping(value = "alterarProduto/{idProduto}", method = RequestMethod.POST)
	public String alterarProduto(@Validated Produto produto, BindingResult result, RedirectAttributes attributes) {
		pr.save(produto);
		return "redirect:/listar-produtos";
	}
	
	@RequestMapping(value= "excluir-produto")
	public String excluirProduto(Integer idProduto) {
		pr.deleteById(idProduto);
		return "redirect:/listar-produtos";
	}

	
}
