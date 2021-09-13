package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.PedidoFinalizado;

public class GeraPedidoHandler {
	
	private List<PedidoFinalizado> PedidoFinalizado;
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler(List<PedidoFinalizado> PedidoFinalizado) {
		PedidoFinalizado = PedidoFinalizado;
	}
	
	public void finalizarPedido(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQuantidadeItens());
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
	
		this.PedidoFinalizado.forEach(a -> a.executarAcao(pedido));
	}
}
