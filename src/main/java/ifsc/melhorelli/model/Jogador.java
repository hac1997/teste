package ifsc.melhorelli.model;

public class Jogador {

    protected String nome;               //Nome do jogador humano
    protected boolean pecasPretas;       //Pretas = true; Brancas = False


    public Jogador(String nome) {
        this.nome = nome;
        this.pecasPretas = false;
    }

    public void setPecasPretas() {
        this.pecasPretas = true;
    }

    public boolean getCor() {
        return pecasPretas;
    }


}
