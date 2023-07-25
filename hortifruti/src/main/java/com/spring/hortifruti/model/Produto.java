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
	private String produtor;
	private double precoCusto;
	private double precoVenda;
	private Integer quantidade;
	private byte imagem;
	private double valorEstoqueMin;
	private double valorEstoqueMax;

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

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public byte getImagem() {
		return imagem;
	}

	public void setImagem(byte imagem) {
		this.imagem = imagem;
	}

	public double getValorEstoqueMin() {
		return valorEstoqueMin;
	}

	public void setValorEstoqueMin(double valorEstoqueMin) {
		this.valorEstoqueMin = valorEstoqueMin;
	}

	public double getValorEstoqueMax() {
		return valorEstoqueMax;
	}

	public void setValorEstoqueMax(double valorEstoqueMax) {
		this.valorEstoqueMax = valorEstoqueMax;
	}

}