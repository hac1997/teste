package ifsc.melhorelli.model;

public class Ajuda {

    protected String[] textoAjuda;

    public Ajuda() {
        this.textoAjuda = new String[4];
        this.textoAjuda[0] = "Realizar acordo: Um usuário, em qualquer momento do jogo, pode solicitar um acordo entre os dois jogadores para que a partida seja encerrada sem que um deles seja considerado vencedor (empate).";
        this.textoAjuda[1] = "Abandonar partida: Em uma partida em andamento, um usuário poderá abandonar o jogo a qualquer momento, declarando o seu oponente como o vencedor da partida.";
        this.textoAjuda[2] = "Como movimentar uma peça: Com um jogo em andamento, um usuário deverá selecionar com o mouse a peça que deseja movimentar e, em seguida, selecionar uma posição válida para finalizar o movimento.";
        this.textoAjuda[3] = "Para que um movimento seja possível, deve haver pelo menos uma posição, em pelo menos uma faixa interior (mais próxima do centro), que esteja em uma linha ortogonal ou diagonal a partir da posição original da peça a ser movimentada;";
    }

    public String getTextoAjuda() {
        StringBuilder instrucoes = new StringBuilder();

        for (String ajuda : textoAjuda) {
            instrucoes.append(ajuda).append("\n");
        }

        return instrucoes.toString();
    }

}
