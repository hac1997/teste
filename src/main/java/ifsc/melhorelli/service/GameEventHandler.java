package ifsc.melhorelli.service;

import ifsc.melhorelli.model.JogadaMorelli;

/**
 * Interface para tratar eventos do jogo, removendo dependência circular
 * entre AtorJogador e outros componentes
 */
public interface GameEventHandler {
    
    /**
     * Recebe solicitação de início de partida
     * @param ordem posição do jogador (1 ou 2)
     */
    void receberSolicitacaoInicio(int ordem);
    
    /**
     * Recebe uma jogada do adversário
     * @param jogada jogada recebida
     */
    void receberJogada(JogadaMorelli jogada);
    
    /**
     * Finaliza partida com empate
     */
    void finalizarPartidaEmpate();
    
    /**
     * Informa que a partida foi encerrada
     */
    void informaPartidaEncerrada();
    
    /**
     * Notifica mensagem ao jogador
     * @param msg mensagem a ser exibida
     */
    void notificar(String msg);
}