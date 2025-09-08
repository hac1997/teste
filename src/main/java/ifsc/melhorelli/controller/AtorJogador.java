package ifsc.melhorelli.controller;

import ifsc.melhorelli.model.Jogador;
import ifsc.melhorelli.model.Posicao;
import ifsc.melhorelli.model.Faixa;
import ifsc.melhorelli.model.TipoJogada;
import ifsc.melhorelli.model.JogadaMorelli;
import ifsc.melhorelli.service.TabuleiroService;
import ifsc.melhorelli.service.NetworkService;
import ifsc.melhorelli.service.GameEventHandler;
import ifsc.melhorelli.view.TelaJogador;

import javax.swing.*;

public class AtorJogador implements GameEventHandler {
    protected NetworkService networkService;
    protected TabuleiroService tabuleiroService;
    protected TelaJogador tela = new TelaJogador(this);
    protected boolean conectado;
    protected Jogador jogador;
    protected boolean daVez;
    protected Faixa[] tabuleiroAtualizado;

    public AtorJogador() {
        this.networkService = new NetworkService(this);
        this.tabuleiroService = new TabuleiroService();
        this.tela.setVisible(true);
        this.conectado = false;
        this.jogador = null;
        this.daVez = false;

    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setDaVez(boolean vez) {
        this.daVez = vez;
    }

    public void conectar() {
        if (!this.conectado) {
            String ip = this.solicitaIpServidor();
            String nomeJogador = this.solicitaNomeJogador();
            this.conectado = this.networkService.conectar(ip, nomeJogador);
        } else {
            this.notificarConectado();
        }

        this.informarEstadoConexao();
    }

    public String solicitaIpServidor() {
        String ip = "";
        while (ip.trim().isEmpty()) {
            ip = JOptionPane.showInputDialog("IP do servidor:", "");
        }
        return ip;
    }

    public String solicitaNomeJogador() {
        String nome = "";
        while (nome.trim().isEmpty()) {
            nome = JOptionPane.showInputDialog("Insira seu nome:", "");
        }
        return nome;
    }

    public void desconectar() {
        if (this.conectado) {
            this.tabuleiroService.setPartidaEmAndamento(false);
            this.conectado = this.networkService.desconectar();
        } else {
            this.notificarDesconectado();
        }

        this.informarEstadoConexao();
    }

    public void iniciarPartida() {
        if (this.tabuleiroService.isPartidaEmAndamento()) {
            this.notificarPartidaEmAndamento();
            if (this.confirmarReiniciarPartida()) {
                this.tabuleiroService.setPartidaEmAndamento(false);
                this.networkService.iniciarPartida();
            }
        } else {
            this.networkService.iniciarPartida();
        }
    }

    @Override
    public void receberSolicitacaoInicio(int ordem) {
        // Inicializar o jogador baseado na ordem recebida
        String nomeJogador1 = this.networkService.getNomeAdversario(1);
        String nomeJogador2 = this.networkService.getNomeAdversario(2);
        
        // Criar o jogador atual baseado na ordem
        if (ordem == 1) {
            this.jogador = new Jogador(nomeJogador1);
            // Jogador 1 joga com peças brancas (false)
        } else {
            this.jogador = new Jogador(nomeJogador2);
            // Jogador 2 joga com peças pretas (true)
            this.jogador.setPecasPretas();
        }
        
        if (ordem == 1) {
            this.tela.setPainel("Nome: " + nomeJogador1 + "\n");
            this.tela.setPainel("Adversario: " + nomeJogador2 + "\n\n");
            this.tela.setPainel("Você joga com as peças brancas.\n");
            this.tela.setPainel("Você começa jogando.");
            this.setDaVez(true);
        } else {
            this.tela.setPainel("Nome: " + nomeJogador2 + "\n");
            this.tela.setPainel("Adversario: " + nomeJogador1 + "\n\n");
            this.tela.setPainel("Você joga com as peças pretas.\n");
            this.tela.setPainel("Seu adversário começa jogando. Aguarde a sua vez!");
            this.setDaVez(false);
        }

        this.tabuleiroAtualizado = this.tabuleiroService.iniciarPartida(ordem, nomeJogador1, nomeJogador2);
        if (ordem == 1) {
            this.enviarJogada(TipoJogada.ATUALIZARTABULEIRO);
            this.tela.atualizaTabuleiro(this.tabuleiroAtualizado);
        }
    }

    @Override
    public void finalizarPartidaEmpate() {
        this.tabuleiroService.setPartidaEmAndamento(false);
        this.exibeMensagemEmpate();
    }

    public boolean confirmarReiniciarPartida() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja reiniciar a partida?", "Reiniciar Partida", 0);
        return resposta == 0;
    }

    public void realizarAcordo() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar o acordo e terminar a partida com um empate?", "O seu oponente pediu um acordo", 0);
        if (resposta == 0) {
            this.finalizarPartidaEmpate();
            this.enviarJogada(TipoJogada.ACORDOACEITO);
        } else {
            this.enviarJogada(TipoJogada.ACORDONEGADO);
        }

    }

    public String ajuda() {
        return this.tabuleiroService.getAjuda();
    }

    public void movimentarPeca(Posicao origem, Posicao destino) {
        try {
            if (this.daVez && this.tabuleiroService.isPartidaEmAndamento() && origem.getCor() == this.jogador.getCor() && this.tabuleiroService.calcularMovimento(origem, destino)) {
                this.tabuleiroService.calcularCaptura(destino);
                this.tabuleiroService.calcularTomadaTrono(destino);
                this.tabuleiroAtualizado = this.tabuleiroService.getFaixasTabuleiro();
                this.enviarJogada(TipoJogada.ATUALIZARTABULEIRO);
                this.tela.atualizaTabuleiro(this.tabuleiroAtualizado);

            }
        } catch (Exception e) {
            this.notificar(e + " movimentarPeca");
        }

    }

    public void enviarJogada(TipoJogada tipoJogada) {
        if (this.daVez && this.tabuleiroService.isPartidaEmAndamento()) {
            this.setDaVez(false);
            this.tela.setPainel("Aguarde seu adversário jogar");
            if (null != tipoJogada) {
                JogadaMorelli jogada;
                switch (tipoJogada) {
                    case REALIZARACORDO:
                        jogada = new JogadaMorelli(TipoJogada.REALIZARACORDO);
                        this.networkService.enviarJogada(jogada);
                        break;
                    case ACORDOACEITO:
                        jogada = new JogadaMorelli(TipoJogada.ACORDOACEITO);
                        this.networkService.enviarJogada(jogada);
                        this.networkService.finalizarPartida();
                        break;
                    case ACORDONEGADO:
                        jogada = new JogadaMorelli(TipoJogada.ACORDONEGADO);
                        this.networkService.enviarJogada(jogada);
                        break;
                    case ABANDONARPARTIDA:
                        jogada = new JogadaMorelli(TipoJogada.ABANDONARPARTIDA);
                        this.networkService.enviarJogada(jogada);
                        break;
                    case ATUALIZARTABULEIRO:
                        jogada = new JogadaMorelli(TipoJogada.ATUALIZARTABULEIRO, this.tabuleiroAtualizado);
                        this.networkService.enviarJogada(jogada);
                        break;
                    default:
                        new JogadaMorelli(TipoJogada.ENCERRAMENTO);
                        String msg = "A partida foi encerrada!";
                        this.notificar(msg);
                        this.networkService.finalizarPartida();
                }
            }
        }

    }

    @Override
    public void receberJogada(JogadaMorelli jogada) {
        this.setDaVez(true);
        this.tela.setPainel("Sua vez de jogar!");
        TipoJogada tipoJogada = jogada.getTipoDeJogada();
        if (null != tipoJogada) {
            switch (tipoJogada) {
                case REALIZARACORDO:
                    this.realizarAcordo();
                    break;
                case ACORDOACEITO:
                    this.finalizarPartidaEmpate();
                    break;
                case ACORDONEGADO:
                    this.exibeMensagemAcordoNegado();
                    break;
                case ABANDONARPARTIDA:
                    this.tabuleiroService.setPartidaEmAndamento(false);
                    this.networkService.finalizarPartida();
                    String msg = this.networkService.getNomeJogador() + " abandonou a partida. Você é o vencedor!";
                    this.notificar(msg);
                    break;
                case ATUALIZARTABULEIRO:
                    this.atualizaTabuleiro(jogada.getTabuleiro());
                    break;
                case ENCERRAMENTO:
                    this.informaPartidaEncerrada();
            }
        }

    }

    public void abandonarPartida() {
        if (this.tabuleiroService.isPartidaEmAndamento()) {
            this.tabuleiroService.setPartidaEmAndamento(false);
            this.enviarJogada(TipoJogada.ABANDONARPARTIDA);
            JOptionPane.showMessageDialog(this.tela, "Você abandonou a partida e perdeu!");
        }

    }

    public void atualizaTabuleiro(Faixa[] tabuleiroAtualizado) {
        this.tabuleiroAtualizado = tabuleiroAtualizado;
        this.tabuleiroService.atualizarTabuleiro(tabuleiroAtualizado);
        this.tela.atualizaTabuleiro(tabuleiroAtualizado);
    }

    public void notificarIrregularidade() {
        JOptionPane.showMessageDialog(this.tela, "Jogada Irregular!");
    }

    public void notificar(String msg) {
        JOptionPane.showMessageDialog(this.tela, msg);
    }

    public void informarEstadoConexao() {
        if (this.conectado) {
            this.tela.setPainel("Conectado");
        } else {
            this.tela.setPainel("Desconectado");
        }

    }


    public void notificarPartidaEmAndamento() {
        this.tela.setPainel("Há uma partida em andamento!");
    }

    public void exibeMensagemEmpate() {
        this.tela.setPainel("O acordo foi aceito e a partida terminou empatada!");
    }

    @Override
    public void informaPartidaEncerrada() {
        this.tabuleiroService.finalizaPartida();
    }

    public void exibeMensagemAcordoNegado() {
        this.tela.setPainel("O acordo foi negado. A partida continuará.");
    }

    public void notificarConectado() {
        JOptionPane.showMessageDialog(this.tela, "Você já está conectado!");
    }

    public void notificarDesconectado() {
        JOptionPane.showMessageDialog(this.tela, "Você já está desconectado!");
    }
}
