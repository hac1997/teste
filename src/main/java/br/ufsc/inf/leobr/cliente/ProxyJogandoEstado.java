package br.ufsc.inf.leobr.cliente;

import java.io.IOException;

import br.ufsc.inf.leobr.cliente.EstadoProxy;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoJogandoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;

import com.retrogui.dualrpc.common.CallException;

public class ProxyJogandoEstado extends EstadoProxy {

	private br.ufsc.inf.leobr.cliente.Proxy proxy;

	public ProxyJogandoEstado(Proxy proxy) {
		this.proxy = proxy;
	}

	public void conectar(String ipServidor, String nome)
			throws JahConectadoException, NaoPossivelConectarException {
		throw new JahConectadoException();

	}

	 
	public void desconectar() throws NaoConectadoException {
		super.desconectar();
		proxy.setEstadoProxy(proxy.getEstadoDesconectado());
	}

	 
	public void enviaJogada(Jogada jogada) throws NaoJogandoException {
		try {
			cliente.enviaJogada(jogada);
		} catch (IOException e) {
			// Caso um dos objetos a ser transferido n�o implementar
			// Serializable
			// ou um dos objetos que possuam associa��o, essa exce��o ser�
			// gerada.
			System.err.println("Todos os objetos transferidos pela rede devem estender Jogada");
			e.printStackTrace();
		} catch (CallException e) {
			e.printStackTrace();
		}

	}

	 
	public void iniciarPartida(Integer qtdeJogadoresNaPartida)
			throws NaoConectadoException {
		try {
			cliente.iniciarPartida(qtdeJogadoresNaPartida);
		} catch (CallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 
	public void reiniciarPartida() throws NaoConectadoException,
			NaoJogandoException {
		try {
			cliente.reiniciarPartida();
		} catch (CallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 
	public void finalizarPartida() throws NaoConectadoException,
			NaoJogandoException {
		try {
			cliente.finalizarPartida();
		} catch (CallException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
