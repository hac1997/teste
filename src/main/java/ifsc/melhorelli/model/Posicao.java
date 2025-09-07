package ifsc.melhorelli.model;

import br.ufsc.inf.leobr.cliente.Jogada;

public class Posicao implements Jogada {

    protected int faixa;                //Ordem da faixa a que pertence
    protected int linha;                //Linha a que pertence
    protected int coluna;               //Coluna a que pertence
    public boolean ocupada;          //Ocupada = true
    public boolean preta;            //Cor da peca que ocupa a posicao

    public Posicao(int faixa, int linha, int coluna) {
        this.faixa = faixa;
        this.linha = linha;
        this.coluna = coluna;
        this.ocupada = false;
    }

    public int getFaixa() {
        return faixa;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void retirarPeca() {
        ocupada = false;
    }


    public void posicionarPeca(boolean corPeca) {
        preta = corPeca;
        ocupada = true;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }

    public void setCor(boolean corPeca) {
        this.preta = corPeca;
    }

    public boolean getCor() {
        return preta;
    }


    @Override
    public boolean equals(Object posicao) {
        if (!(posicao instanceof Posicao)) {
            return false;
        }

        return posicao == this;
    }

    //método em posicao para verificar se é igual à faixa
    public boolean equals(Posicao posicao) {
        return (this.getLinha() == posicao.getLinha()) && (this.getColuna() == posicao.getColuna());
    }


}
