package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraImposto;
import br.com.alura.loja.imposto.tipos.ICMS;
import br.com.alura.loja.imposto.tipos.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestaImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento((new BigDecimal("100")));
		CalculadoraImposto calculadora = new CalculadoraImposto();
		
		System.out.println(calculadora.calcular(orcamento, new ISS()));
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		
	}

}
