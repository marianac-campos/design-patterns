package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class EmailConfirmacao implements PedidoFinalizado {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Verifique sua caixa do Email");
		System.out.println("Acabamos de enviar por email os detalhes do pedido. "
				+ "Acompanhe o andamento da sua compra por lá!");
	}

}
