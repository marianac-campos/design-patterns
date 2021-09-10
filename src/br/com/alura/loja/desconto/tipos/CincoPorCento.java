package br.com.alura.loja.desconto.tipos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.desconto.Desconto;

public class CincoPorCento extends Desconto {
	
	public CincoPorCento(Desconto proximo) {
		super(proximo);
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return (orcamento.getValor().compareTo(new BigDecimal("500")) > 0);
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}
}
