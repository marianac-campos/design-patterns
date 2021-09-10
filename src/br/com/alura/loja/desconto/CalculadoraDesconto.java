package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.desconto.tipos.CincoPorCento;
import br.com.alura.loja.desconto.tipos.DezPorCento;
import br.com.alura.loja.desconto.tipos.SemDesconto;

public class CalculadoraDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		//deixar o maior desconto primeiro
		Desconto cadeiaDesconto = new DezPorCento(
				new CincoPorCento(
						new SemDesconto()));
		
		return cadeiaDesconto.calcular(orcamento);
	}
}
