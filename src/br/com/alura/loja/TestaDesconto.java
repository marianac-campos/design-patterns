package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.desconto.CalculadoraDesconto;


public class TestaDesconto {

	public static void main(String[] args) {
		
		Orcamento barbara = new Orcamento(new BigDecimal("1010"));
		Orcamento eduardo = new Orcamento(new BigDecimal("700"));
		
		
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		System.out.println(calculadora.calcular(barbara));
		System.out.println(calculadora.calcular(eduardo));
	}

}
