package br.ufsc.inf.leobr.cliente.exception;


public class ArquivoMultiplayerException extends Exception {

	/**
	 * Lan?ada caso ocorra algum erro com o arquivo, pode ser um erro 
	 * de IOException ou ent?o um erro de ciframento.
	 * A mensagem do erro ? exibida para o desevolvedor.
	 * Esse tipo de erro impede que o jogo multiPlayer seja jogado.
	 */
	public ArquivoMultiplayerException(String message) {
		super(message);
	}

}
