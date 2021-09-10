package br.com.alura.loja.desconto.tipos;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.Desconto;
import br.com.alura.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}
	
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
}
