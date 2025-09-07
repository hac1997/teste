package br.ufsc.inf.leobr.cliente.exception;


/**
 * Exce??o lan?ada quando o usu?rio tenta se conectar ao servidor, por?m o mesmo
 * j? est? conectado.
 * @author leonardo.brasil
 *
 */
public class JahConectadoException extends Exception {
	
	public JahConectadoException(){
		super("J? existe uma conex?o ativa entre cliente e servidor");
	}

	
}
