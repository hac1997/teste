package br.ufsc.inf.leobr.cliente.exception;


/**
 * Exce??o lan?ada quando o usu?rio tenta enviar uma mensagem sem estar
 * conectado ao serivodr.
 * 
 * @author leonardo.brasil
 * 
 */
public class NaoConectadoException extends Exception {

	public NaoConectadoException(){
		super("N?o existe uma conex?o entre cliente e servidor");
	}
	
}
