package br.com.alura.loja.desconto.tipos;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

public class DezPorCento extends Desconto {
	
	public DezPorCento(Desconto proximo) {
		super(proximo);
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("1000"))> 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(orcamento);
	}
}
