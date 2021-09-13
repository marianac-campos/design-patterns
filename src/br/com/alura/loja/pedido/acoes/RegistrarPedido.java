package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class RegistrarPedido implements PedidoFinalizado {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido salvo no banco de dados com sucesso!");
	}

}
