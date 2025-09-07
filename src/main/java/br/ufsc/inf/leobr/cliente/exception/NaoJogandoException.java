package br.ufsc.inf.leobr.cliente.exception;


/**
 * Exce??o lan?ada quando o jogador n?o estiver conectado ou 
 * participando de uma partida.
 * @author leonardo.brasil
 *
 */
public class NaoJogandoException extends Exception {

	public NaoJogandoException(){
		super("Ainda n?o est? participando de uma partida no servidor");
	}
	
}
