package br.ufsc.inf.leobr.cliente.exception;


public class ChamadaPerdidaException extends Exception {

	/**
	 * Lan?ada quando por algum motivo n?o ? poss?vel chamar uma fun??o no
	 * servidor. Nesse caso a conex?o de rede ainda existe, pois se n?o
	 * existisse seria tratada pelo ConexaoPerdidaTratador, por?m
	 * n?o ? poss?vel chamar a fun??o no servidor.
	 * Poss?vel erro: a fun??o n?o existe no servidor.
	 */
	public ChamadaPerdidaException() {
		super(
				"Por algum motivo n?o foi poss?vel enviar essa mensagem ao servidor");
	}

}
