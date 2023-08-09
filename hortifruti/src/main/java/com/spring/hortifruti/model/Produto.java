package com.spring.hortifruti.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProduto;
	private String nome;
	private String unidadeMedida;
	private Date dataValidade;
	private String categoria;
	private String armazenamento;
	private String fornecedor;
	private String precoCusto;
	private String precoVenda;
	private Integer quantidade;
	private Integer qtdEstoqueMin;
	private Integer qtdEstoqueMax;

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(String precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getQtdEstoqueMin() {
		return qtdEstoqueMin;
	}

	public void setQtdEstoqueMin(Integer qtdEstoqueMin) {
		this.qtdEstoqueMin = qtdEstoqueMin;
	}

	public Integer getQtdEstoqueMax() {
		return qtdEstoqueMax;
	}

	public void setQtdEstoqueMax(Integer qtdEstoqueMax) {
		this.qtdEstoqueMax = qtdEstoqueMax;
	}

}
