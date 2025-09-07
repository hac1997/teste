package ifsc.melhorelli.model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Faixa implements Jogada {

    protected int ordem;            //Ordem no tabuleiro, de dentro para fora
    protected Cor cor;              //Cor da faixa
    public Posicao[] posicoes;   //Colecao de posicoes que pertence a faixa

    public Faixa(int ordem) {

        //Ordem da faixa no tabuleiro, de dentro para fora
        this.ordem = ordem;
        this.cor = Cor.values()[ordem];

        //Faixa do centro
        if (ordem == 0) {

            this.posicoes = new Posicao[1];
            this.addPosicao(0, 0, 6, 6);

        }
        //Outras faixas
        else {
            preencherFaixa(ordem);
        }
    }

    public Posicao[] getPosicoes() {
        return posicoes;
    }


    public void addPosicao(int indice, int ordem, int linha, int coluna) {
        Posicao posicao = new Posicao(ordem, linha, coluna);
        this.posicoes[indice] = posicao;
    }

    public void preencherFaixa(int ordem) {
        int numPosicoes = ordem * 8;
        this.posicoes = new Posicao[numPosicoes];

        int i = 0;
        int linha = 6 - ordem;
        int coluna;

        //Canto superior
        for (coluna = linha; coluna <= 6 + ordem; coluna++) {
            this.addPosicao(i, ordem, linha, coluna);
            i++;
        }

        //Canto direito
        coluna--;
        for (linha++; linha <= 6 + ordem; linha++) {
            this.addPosicao(i, ordem, linha, coluna);
            i++;
        }

        //Canto inferior
        linha--;
        for (coluna--; coluna >= 6 - ordem; coluna--) {
            this.addPosicao(i, ordem, linha, coluna);
            i++;
        }

        //Canto esquerdo
        coluna++;
        for (linha--; linha >= 7 - ordem; linha--) {
            this.addPosicao(i, ordem, linha, coluna);
            i++;
        }
    }

}
