package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acoes.EmailConfirmacao;
import br.com.alura.loja.pedido.acoes.RegistrarPedido;

public class TestaPedido {

	public static void main(String[] args) {
		
		String cliente = "Carlos Andrade";
		BigDecimal valorOrcamento = new BigDecimal("698.29");
		int quantidadeItens = (3);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new EmailConfirmacao(),
				new RegistrarPedido()));
		
		handler.finalizarPedido(gerador);
	}

}
