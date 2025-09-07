package br.ufsc.inf.leobr.cliente.exception;


/**
 * Lan?ada quando n?o ? poss?vel por algum motivo se conectar ao cleinte.
 * Dentre a gama de poss?veis motivos est?o:
 * Firewall bloquando
 * N?mero m?ximo de clientes conectados
 * Servidor fora do ar.
 * @author LSB
 *
 */
public class NaoPossivelConectarException extends Exception {
	
	public NaoPossivelConectarException(){
		super("Por algum motivo n?o ? poss?vel conectar, poss?veis motivos:" + "\n" +
				"Firewall bloquando" + "\n" +
				"N?mero m?ximo de clientes conectados" + "\n" +
				"Servidor Fora do ar" + "\n" +
				"Por favor tente mais tarde");
	}
}
