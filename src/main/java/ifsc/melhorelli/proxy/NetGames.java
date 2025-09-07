package ifsc.melhorelli.proxy;


import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import ifsc.melhorelli.controller.AtorJogador;
import ifsc.melhorelli.model.JogadaMorelli;

public class NetGames implements OuvidorProxy {

    protected transient AtorJogador atorJogador;
    protected transient Proxy proxy;

    public NetGames(AtorJogador atorJogador) {

        super();

        this.atorJogador = atorJogador;
        this.proxy = Proxy.getInstance();

        this.proxy.addOuvinte(this);
    }

    public boolean conectar(String ip, String nomeJogador) {
        try {
            this.proxy.conectar(ip, nomeJogador);
            return true;
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
        return false;
    }

    public boolean desconectar() {
        try {
            this.proxy.desconectar();
            return false;
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
        return true;
    }

    public void iniciarPartida() {
        try {
            this.proxy.iniciarPartida(2);
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
    }

    @Override
    public void iniciarNovaPartida(Integer posicao) {
        atorJogador.receberSolicitacaoInicio(posicao);
    }

    public void enviarJogada(JogadaMorelli jogada) {
        try {
            Proxy.getInstance().enviaJogada(jogada);
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
    }

    public void reiniciarPartida() {
        try {
            proxy.reiniciarPartida();
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
    }

    public void finalizarPartida() {
        try {
            proxy.finalizarPartida();
        } catch (Exception e) {
            atorJogador.notificar(e.getMessage());
        }
    }

    @Override
    public void receberJogada(Jogada jogada) {
        atorJogador.receberJogada((JogadaMorelli) jogada);
    }

    public String getNomeJogador() {
        return proxy.getNomeJogador();
    }

    public String getNomeAdversario(int posicao) {
        return proxy.obterNomeAdversario(posicao);
    }

    @Override
    public void finalizarPartidaComErro(String msg) {
        atorJogador.notificar(msg);
    }

    @Override
    public void tratarConexaoPerdida() {
        String msg = "A conexão com o servidor foi perdida. Partida encerrada";
        atorJogador.notificar(msg);
    }

    @Override
    public void tratarPartidaNaoIniciada(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receberMensagem(String msg) {
        atorJogador.notificar(msg);
    }

    public void receberJogada() {
        receberJogada((Jogada) null);
    }


}
