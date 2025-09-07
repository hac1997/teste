package ifsc.melhorelli.service;

import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import ifsc.melhorelli.model.JogadaMorelli;

/**
 * Serviço responsável pela comunicação de rede
 * Removida dependência circular com AtorJogador
 */
public class NetworkService implements OuvidorProxy {

    protected transient GameEventHandler gameEventHandler;
    protected transient Proxy proxy;

    public NetworkService(GameEventHandler gameEventHandler) {
        this.gameEventHandler = gameEventHandler;
        this.proxy = Proxy.getInstance();
        this.proxy.addOuvinte(this);
    }

    public boolean conectar(String ip, String nomeJogador) {
        try {
            this.proxy.conectar(ip, nomeJogador);
            return true;
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
        return false;
    }

    public boolean desconectar() {
        try {
            this.proxy.desconectar();
            return false;
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
        return true;
    }

    public void iniciarPartida() {
        try {
            this.proxy.iniciarPartida(2);
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        gameEventHandler.receberSolicitacaoInicio(posicao);
    }

    public void enviarJogada(JogadaMorelli jogada) {
        try {
            Proxy.getInstance().enviaJogada(jogada);
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
    }

    public void reiniciarPartida() {
        try {
            proxy.reiniciarPartida();
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
    }

    public void finalizarPartida() {
        try {
            proxy.finalizarPartida();
        } catch (Exception e) {
            gameEventHandler.notificar(e.getMessage());
        }
    }

    @Override
    public void receberJogada(Jogada jogada) {
        gameEventHandler.receberJogada((JogadaMorelli) jogada);
    }

    public String getNomeJogador() {
        return proxy.getNomeJogador();
    }

    public String getNomeAdversario(int posicao) {
        return proxy.obterNomeAdversario(posicao);
    }

    @Override
    public void finalizarPartidaComErro(String msg) {
        gameEventHandler.notificar(msg);
    }

    @Override
    public void tratarConexaoPerdida() {
        String msg = "A conexão com o servidor foi perdida. Partida encerrada";
        gameEventHandler.notificar(msg);
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        gameEventHandler.notificar(message);
    }

    @Override
    public void receberMensagem(String msg) {
        gameEventHandler.notificar(msg);
    }
}