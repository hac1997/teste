package br.ufsc.inf.leobr.cliente;

import br.ufsc.inf.leobr.cliente.Jogada;

import java.io.Serializable;


/**
 * @author Leonardo Brasil
 * 
 */
public interface OuvidorProxy extends Serializable {

	/**
	 * Indica que o jogador requisitou uma nova partida e que ela foi aceita e
	 * portanto ele deve "se preparar" parar iniciar essa partida.
	 */
	public void iniciarNovaPartida(Integer posicao);

	/**
	 * Indica que a partida terminou por algum problema Como por exemplo, se um
	 * dos jogadores for desconectado. E o jogo deve finalizar seu estado no
	 * momento que recebe essa mensagem.
	 */
	public void finalizarPartidaComErro(String message);


	public void receberMensagem(String msg);

	/**
	 * Recebe uma jogada do servidor.
	 * 
	 * @param jogada
	 */
	public void receberJogada(Jogada jogada);

	/**
	 * Caso n�o consigua se comunicar com o servidor, ex O servidor caiu,
	 * conex�o de rede n�o dispon�vel. Esse m�todo � chamado em todos os
	 * ouvintes.
	 */
	public void tratarConexaoPerdida();
	
	/**
	 * Caso n�o consigua se comunicar com o servidor, ex O servidor caiu,
	 * conex�o de rede n�o dispon�vel. Esse m�todo � chamado em todos os
	 * ouvintes.
	 */
	public void tratarPartidaNaoIniciada(String message);

	
}
