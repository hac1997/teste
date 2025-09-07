package ifsc.melhorelli.service;

import ifsc.melhorelli.model.Ajuda;
import ifsc.melhorelli.model.Faixa;
import ifsc.melhorelli.model.Jogador;
import ifsc.melhorelli.model.Posicao;

import java.util.Random;

/**
 * Serviço responsável pela lógica do tabuleiro
 * Removida dependência circular com AtorJogador
 */
public class TabuleiroService {

    protected Ajuda ajuda;
    Random random = new Random();

    protected boolean partidaEmAndamento;

    protected Faixa[] faixasTabuleiro;
    protected Faixa trono;

    protected Jogador jogador1;
    protected Jogador jogador2;

    public TabuleiroService() {
        this.ajuda = new Ajuda();
        this.partidaEmAndamento = false;
        this.faixasTabuleiro = new Faixa[7]; //O tabuleiro sempre tem 7 faixas
    }

    public void setPartidaEmAndamento(boolean partidaEmAndamento) {
        this.partidaEmAndamento = partidaEmAndamento;
    }

    public boolean isPartidaEmAndamento() {
        return this.partidaEmAndamento;
    }

    public void atualizarTabuleiro(Faixa[] tabuleiro) {
        this.faixasTabuleiro = tabuleiro;
    }

    public Faixa[] getFaixasTabuleiro() {
        return faixasTabuleiro;
    }

    public Faixa[] iniciarPartida(int ordem, String nomeJogador1, String nomeJogador2) {

        //Cria os jogadores
        jogador1 = new Jogador(nomeJogador1);
        jogador2 = new Jogador(nomeJogador2);

        //jogador1 joga com as pecas pretas e inica a partida
        jogador2.setPecasPretas();

        //Prepara o tabuleiro para iniciar a partida
        this.limparTabuleiro();
        if (ordem == 1) {
            this.distribuiPecas();
        }

        //Inicia a partida
        setPartidaEmAndamento(true);
        return faixasTabuleiro;
    }

    public void limparTabuleiro() {

        //Cria as faixas do tabuleiro
        for (int i = 0; i < 7; i++) {
            Faixa faixa = new Faixa(i);
            this.faixasTabuleiro[i] = faixa;
        }

        //Define trono
        this.trono = faixasTabuleiro[0];

    }

    public void distribuiPecas() {

        for (int i = 0; i <= 23; i++) {

            int x = random.nextInt(2);

            if (x == 0) {
                faixasTabuleiro[6].posicoes[i].preta = true;
                faixasTabuleiro[6].posicoes[i].ocupada = true;
                faixasTabuleiro[6].posicoes[i + 24].preta = false;
            } else {
                faixasTabuleiro[6].posicoes[i].preta = false;
                faixasTabuleiro[6].posicoes[i].ocupada = true;
                faixasTabuleiro[6].posicoes[i + 24].preta = true;
            }
            faixasTabuleiro[6].posicoes[i + 24].ocupada = true;
        }
    }

    public String getAjuda() {
        return ajuda.getTextoAjuda();
    }

    public boolean movimentoAoCentro(Posicao origem, Posicao destino) {
        return origem.getFaixa() > destino.getFaixa();
    }

    public boolean calcularMovimentoLinha(Posicao origem, Posicao destino) {
        int linhaOrigem = origem.getLinha();
        int linhaDestino = destino.getLinha();

        if (linhaOrigem != linhaDestino) {
            return false;
        }

        int faixaOrigem = origem.getFaixa();

        for (int faixa = faixaOrigem - 1; faixa > 0; faixa--) {
            Posicao[] posicoesFaixa = faixasTabuleiro[faixa].getPosicoes();

            for (Posicao posicao : posicoesFaixa) {
                if (posicao.getLinha() == linhaOrigem && !posicao.isOcupada()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean calcularMovimentoColuna(Posicao origem, Posicao destino) {
        if (origem.getColuna() != destino.getColuna()) {
            return false;
        }

        int coluna = origem.getColuna();
        int faixaOrigem = origem.getFaixa();

        // verifica faixas internas até o centro
        for (int i = faixaOrigem - 1; i >= 0; i--) {
            Posicao[] posicoes = faixasTabuleiro[i].getPosicoes();
            for (Posicao p : posicoes) {
                if (p.getColuna() == coluna && !p.isOcupada()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean calcularMovimentoDiagonal(Posicao origem, Posicao destino) {
        int linhaOrigem = origem.getLinha();
        int colunaOrigem = origem.getColuna();

        int linhaDestino = destino.getLinha();
        int colunaDestino = destino.getColuna();

        int diagonalOrigem;
        int diagonalDestino;

        //Diagonal superior-esquerdo <-> inferior-direito
        diagonalOrigem = linhaOrigem - colunaOrigem;
        diagonalDestino = linhaDestino - colunaDestino;
        if (diagonalOrigem == diagonalDestino) {
            return true;
        }

        //Diagonal superior-direito <-> inferior-esquerdo
        diagonalOrigem = linhaOrigem + colunaOrigem;
        diagonalDestino = linhaDestino + colunaDestino;
        return diagonalOrigem == diagonalDestino;
    }

    public void calcularCaptura(Posicao destino) {
        try {
            boolean cor = destino.getCor();
            Posicao[] adjacentesDestino = verificarAdjacentes(destino);

            for (Posicao inimigo : adjacentesDestino) {
                if (inimigo == null || !inimigo.isOcupada() || inimigo.getCor() == cor) continue;

                Posicao oposta = buscarOposta(inimigo, destino);
                if (oposta != null && oposta.getCor() == cor) {
                    inimigo.setCor(cor);
                    atualizarPosicaoTabuleiro(inimigo);
                }
            }
        } catch (Exception e) {
            System.err.println("Erro em calcularCaptura: " + e.getMessage());
        }
    }

    private Posicao buscarOposta(Posicao inimigo, Posicao destino) {
        Posicao[] adj = verificarAdjacentes(inimigo);
        for (int i = 0; i < adj.length; i++) {
            if (adj[i] != null && destino.equals(adj[i])) {
                return adj[(i + 4) % 8]; // posição oposta
            }
        }
        return null;
    }

    public Posicao[] verificarAdjacentes(Posicao destino) {
        int linha = destino.getLinha();
        int coluna = destino.getColuna();
        boolean cor = destino.getCor();
        int faixaAtual = destino.getFaixa();

        Posicao[] adjacentes = new Posicao[8];

        // deslocamentos (linha, coluna) para as 8 direções
        int[][] direcoes = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, 1}, {1, 1}, {1, 0},
                {1, -1}, {0, -1}
        };

        for (int i = 0; i < direcoes.length; i++) {
            int dl = direcoes[i][0];
            int dc = direcoes[i][1];
            int novaLinha = linha + dl;
            int novaColuna = coluna + dc;

            int faixaDestino = faixaAtual + dl;
            if (faixaDestino < 0 || faixaDestino >= faixasTabuleiro.length) continue;

            Posicao posicaoAlvo = buscarPosicao(faixasTabuleiro[faixaDestino], novaLinha, novaColuna);

            adjacentes[i] = posicaoAlvo;
        }

        return adjacentes;
    }

    /**
     * Busca uma posição dentro da faixa pelo par (linha, coluna)
     */
    private Posicao buscarPosicao(Faixa faixa, int linha, int coluna) {
        for (Posicao p : faixa.getPosicoes()) {
            if (p.getLinha() == linha && p.getColuna() == coluna) {
                return p;
            }
        }
        return null;
    }

    public void calcularTomadaTrono(Posicao posicao) {
        int faixa = posicao.getFaixa();
        boolean cor = posicao.getCor();

        Posicao[] posicoes = faixasTabuleiro[faixa].getPosicoes();
        int indice = encontrarIndice(posicoes, posicao);

        int lado = faixa * 2;
        int numPosicoes = lado * 4;

        for (int passo = 1; passo <= 3; passo++) {
            int novoIndice = (indice + lado) % numPosicoes;
            Posicao vertice = posicoes[novoIndice];

            if (!vertice.isOcupada() || vertice.getCor() != cor) {
                return;
            }
            lado *= 2;
        }

        Posicao tronoTomado = trono.posicoes[0];
        tronoTomado.setCor(cor);
        tronoTomado.posicionarPeca(cor);
        atualizarPosicaoTabuleiro(tronoTomado);
    }

    private int encontrarIndice(Posicao[] posicoes, Posicao alvo) {
        for (int i = 0; i < posicoes.length; i++) {
            if (posicoes[i].equals(alvo)) {
                return i;
            }
        }
        return -1;
    }

    public void finalizaPartida() {
        setPartidaEmAndamento(false);
    }

    public boolean calcularMovimento(Posicao origem, Posicao destino) {

        //O trono não pode receber movimento; deve ser conquistado
        if (((destino.getColuna() == 6) && (destino.getLinha() == 6)) || destino.isOcupada() || !movimentoAoCentro(origem, destino)) {
            return false;
        }

        //Verifica se a peca se move na mesma linha
        //Verifica se a peca se move na mesma coluna
        //Verifica se a peca se move na mesma diagonal
        else if (calcularMovimentoLinha(origem, destino)
                || calcularMovimentoColuna(origem, destino)
                || calcularMovimentoDiagonal(origem, destino)) {

            moverPeca(origem, destino);
            return true;
        }

        return false;
    }

    public void moverPeca(Posicao origem, Posicao destino) {
        destino.posicionarPeca(origem.getCor());
        origem.retirarPeca();
        atualizarPosicaoTabuleiro(origem);
        atualizarPosicaoTabuleiro(destino);
    }

    public void atualizarPosicaoTabuleiro(Posicao posicao) {
        int ordemFaixa = posicao.getFaixa();
        Posicao[] faixa = faixasTabuleiro[ordemFaixa].getPosicoes();
        for (int i = 0; i < faixa.length; i++) {
            if (posicao.equals(faixa[i])) {
                faixa[i] = posicao;
                break;
            }
        }
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }
}