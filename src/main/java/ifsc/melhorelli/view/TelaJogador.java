//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ifsc.melhorelli.view;

import ifsc.melhorelli.controller.AtorJogador;
import ifsc.melhorelli.model.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaJogador extends JFrame {
    protected JButton btAmarelo_0;
    protected JButton btAmarelo_1;
    protected JButton btAmarelo_10;
    protected JButton btAmarelo_11;
    protected JButton btAmarelo_12;
    protected JButton btAmarelo_13;
    protected JButton btAmarelo_14;
    protected JButton btAmarelo_15;
    protected JButton btAmarelo_16;
    protected JButton btAmarelo_17;
    protected JButton btAmarelo_18;
    protected JButton btAmarelo_19;
    protected JButton btAmarelo_2;
    protected JButton btAmarelo_20;
    protected JButton btAmarelo_21;
    protected JButton btAmarelo_22;
    protected JButton btAmarelo_23;
    protected JButton btAmarelo_24;
    protected JButton btAmarelo_25;
    protected JButton btAmarelo_26;
    protected JButton btAmarelo_27;
    protected JButton btAmarelo_28;
    protected JButton btAmarelo_29;
    protected JButton btAmarelo_3;
    protected JButton btAmarelo_30;
    protected JButton btAmarelo_31;
    protected JButton btAmarelo_4;
    protected JButton btAmarelo_5;
    protected JButton btAmarelo_6;
    protected JButton btAmarelo_7;
    protected JButton btAmarelo_8;
    protected JButton btAmarelo_9;
    protected JButton btAzulClaro_0;
    protected JButton btAzulClaro_1;
    protected JButton btAzulClaro_10;
    protected JButton btAzulClaro_11;
    protected JButton btAzulClaro_12;
    protected JButton btAzulClaro_13;
    protected JButton btAzulClaro_14;
    protected JButton btAzulClaro_15;
    protected JButton btAzulClaro_2;
    protected JButton btAzulClaro_3;
    protected JButton btAzulClaro_4;
    protected JButton btAzulClaro_5;
    protected JButton btAzulClaro_6;
    protected JButton btAzulClaro_7;
    protected JButton btAzulClaro_8;
    protected JButton btAzulClaro_9;
    protected JButton btAzulEscuro_0;
    protected JButton btAzulEscuro_1;
    protected JButton btAzulEscuro_2;
    protected JButton btAzulEscuro_3;
    protected JButton btAzulEscuro_4;
    protected JButton btAzulEscuro_5;
    protected JButton btAzulEscuro_6;
    protected JButton btAzulEscuro_7;
    protected JButton btLaranja_0;
    protected JButton btLaranja_1;
    protected JButton btLaranja_10;
    protected JButton btLaranja_11;
    protected JButton btLaranja_12;
    protected JButton btLaranja_13;
    protected JButton btLaranja_14;
    protected JButton btLaranja_15;
    protected JButton btLaranja_16;
    protected JButton btLaranja_17;
    protected JButton btLaranja_18;
    protected JButton btLaranja_19;
    protected JButton btLaranja_2;
    protected JButton btLaranja_20;
    protected JButton btLaranja_21;
    protected JButton btLaranja_22;
    protected JButton btLaranja_23;
    protected JButton btLaranja_24;
    protected JButton btLaranja_25;
    protected JButton btLaranja_26;
    protected JButton btLaranja_27;
    protected JButton btLaranja_28;
    protected JButton btLaranja_29;
    protected JButton btLaranja_3;
    protected JButton btLaranja_30;
    protected JButton btLaranja_31;
    protected JButton btLaranja_32;
    protected JButton btLaranja_33;
    protected JButton btLaranja_34;
    protected JButton btLaranja_35;
    protected JButton btLaranja_36;
    protected JButton btLaranja_37;
    protected JButton btLaranja_38;
    protected JButton btLaranja_39;
    protected JButton btLaranja_4;
    protected JButton btLaranja_5;
    protected JButton btLaranja_6;
    protected JButton btLaranja_7;
    protected JButton btLaranja_8;
    protected JButton btLaranja_9;
    protected JButton btRoxo_0;
    protected JButton btVerde_0;
    protected JButton btVerde_1;
    protected JButton btVerde_10;
    protected JButton btVerde_11;
    protected JButton btVerde_12;
    protected JButton btVerde_13;
    protected JButton btVerde_14;
    protected JButton btVerde_15;
    protected JButton btVerde_16;
    protected JButton btVerde_17;
    protected JButton btVerde_18;
    protected JButton btVerde_19;
    protected JButton btVerde_2;
    protected JButton btVerde_20;
    protected JButton btVerde_21;
    protected JButton btVerde_22;
    protected JButton btVerde_23;
    protected JButton btVerde_3;
    protected JButton btVerde_4;
    protected JButton btVerde_5;
    protected JButton btVerde_6;
    protected JButton btVerde_7;
    protected JButton btVerde_8;
    protected JButton btVerde_9;
    protected JButton btVermelho_0;
    protected JButton btVermelho_1;
    protected JButton btVermelho_10;
    protected JButton btVermelho_11;
    protected JButton btVermelho_12;
    protected JButton btVermelho_13;
    protected JButton btVermelho_14;
    protected JButton btVermelho_15;
    protected JButton btVermelho_16;
    protected JButton btVermelho_17;
    protected JButton btVermelho_18;
    protected JButton btVermelho_19;
    protected JButton btVermelho_2;
    protected JButton btVermelho_20;
    protected JButton btVermelho_21;
    protected JButton btVermelho_22;
    protected JButton btVermelho_23;
    protected JButton btVermelho_24;
    protected JButton btVermelho_25;
    protected JButton btVermelho_26;
    protected JButton btVermelho_27;
    protected JButton btVermelho_28;
    protected JButton btVermelho_29;
    protected JButton btVermelho_3;
    protected JButton btVermelho_30;
    protected JButton btVermelho_31;
    protected JButton btVermelho_32;
    protected JButton btVermelho_33;
    protected JButton btVermelho_34;
    protected JButton btVermelho_35;
    protected JButton btVermelho_36;
    protected JButton btVermelho_37;
    protected JButton btVermelho_38;
    protected JButton btVermelho_39;
    protected JButton btVermelho_4;
    protected JButton btVermelho_40;
    protected JButton btVermelho_41;
    protected JButton btVermelho_42;
    protected JButton btVermelho_43;
    protected JButton btVermelho_44;
    protected JButton btVermelho_45;
    protected JButton btVermelho_46;
    protected JButton btVermelho_47;
    protected JButton btVermelho_5;
    protected JButton btVermelho_6;
    protected JButton btVermelho_7;
    protected JButton btVermelho_8;
    protected JButton btVermelho_9;
    protected JMenuBar jMenuBar2;
    protected JPanel jPanel1;
    protected JScrollPane jScrollPane1;
    protected JMenu mnAbandonarPartida;
    protected JMenu mnAjuda;
    protected JMenu mnConectar;
    protected JMenu mnDesconectar;
    protected JMenu mnIniciarPartida;
    protected JMenu mnRealizarAcordo;
    protected JTextPane painel;
    protected JPanel painelBotoes;
    protected AtorJogador jogo;
    protected Posicao posicaoOrigem;
    protected Posicao posicaoDestino;
    protected int linhaOrigem;
    protected int colunaOrigem;
    protected int linhaDestino;
    protected int colunaDestino;
    protected int linhaSelecionada;
    protected int colunaSelecionada;
    protected boolean origemSelecionada;
    protected JButton[] botoesVermelhos = new JButton[48];
    protected JButton[] botoesLaranja = new JButton[40];
    protected JButton[] botoesAmarelos = new JButton[32];
    protected JButton[] botoesVerdes = new JButton[24];
    protected JButton[] botoesAzulClaro = new JButton[16];
    protected JButton[] botoesAzulEscuro = new JButton[8];
    protected JButton[] botaoRoxo = new JButton[1];
    protected Posicao[] posicoesVermelhas = new Posicao[48];
    protected Posicao[] posicoesLaranja = new Posicao[40];
    protected Posicao[] posicoesAmarelas = new Posicao[32];
    protected Posicao[] posicoesVerdes = new Posicao[24];
    protected Posicao[] posicoesAzulClaro = new Posicao[16];
    protected Posicao[] posicoesAzulEscuro = new Posicao[8];
    protected Posicao[] posicoesRoxas = new Posicao[1];

    public TelaJogador(AtorJogador atorJogador) {
        this.initComponents();
        this.defineFaixas();
        this.jogo = atorJogador;
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jScrollPane1 = new JScrollPane();
        this.painel = new JTextPane();
        this.painelBotoes = new JPanel();
        this.btAmarelo_21 = new JButton();
        this.btVerde_16 = new JButton();
        this.btLaranja_21 = new JButton();
        this.btVermelho_26 = new JButton();
        this.btAmarelo_16 = new JButton();
        this.btAmarelo_15 = new JButton();
        this.btAmarelo_14 = new JButton();
        this.btLaranja_16 = new JButton();
        this.btVermelho_10 = new JButton();
        this.btAzulClaro_11 = new JButton();
        this.btAmarelo_10 = new JButton();
        this.btVermelho_5 = new JButton();
        this.btLaranja_9 = new JButton();
        this.btAzulClaro_1 = new JButton();
        this.btAmarelo_11 = new JButton();
        this.btLaranja_4 = new JButton();
        this.btAzulEscuro_0 = new JButton();
        this.btAmarelo_3 = new JButton();
        this.btAzulEscuro_7 = new JButton();
        this.btVerde_2 = new JButton();
        this.btVermelho_45 = new JButton();
        this.btAmarelo_19 = new JButton();
        this.btVermelho_41 = new JButton();
        this.btVerde_14 = new JButton();
        this.btVermelho_37 = new JButton();
        this.btVermelho_36 = new JButton();
        this.btVermelho_38 = new JButton();
        this.btVermelho_39 = new JButton();
        this.btVermelho_40 = new JButton();
        this.btLaranja_34 = new JButton();
        this.btVerde_5 = new JButton();
        this.btAmarelo_8 = new JButton();
        this.btAzulClaro_7 = new JButton();
        this.btAmarelo_12 = new JButton();
        this.btVermelho_0 = new JButton();
        this.btLaranja_23 = new JButton();
        this.btLaranja_20 = new JButton();
        this.btVermelho_44 = new JButton();
        this.btVermelho_28 = new JButton();
        this.btVermelho_47 = new JButton();
        this.btVermelho_25 = new JButton();
        this.btVermelho_43 = new JButton();
        this.btAmarelo_18 = new JButton();
        this.btVermelho_46 = new JButton();
        this.btVerde_13 = new JButton();
        this.btVermelho_42 = new JButton();
        this.btLaranja_30 = new JButton();
        this.btVermelho_35 = new JButton();
        this.btLaranja_31 = new JButton();
        this.btLaranja_32 = new JButton();
        this.btLaranja_33 = new JButton();
        this.btVermelho_1 = new JButton();
        this.btLaranja_37 = new JButton();
        this.btLaranja_0 = new JButton();
        this.btLaranja_36 = new JButton();
        this.btLaranja_39 = new JButton();
        this.btAzulClaro_8 = new JButton();
        this.btVerde_10 = new JButton();
        this.btVermelho_8 = new JButton();
        this.btAzulClaro_4 = new JButton();
        this.btLaranja_7 = new JButton();
        this.btAzulClaro_5 = new JButton();
        this.btAmarelo_6 = new JButton();
        this.btAzulClaro_6 = new JButton();
        this.btLaranja_22 = new JButton();
        this.btVermelho_27 = new JButton();
        this.btLaranja_35 = new JButton();
        this.btLaranja_38 = new JButton();
        this.btAmarelo_23 = new JButton();
        this.btVerde_18 = new JButton();
        this.btVerde_19 = new JButton();
        this.btVermelho_3 = new JButton();
        this.btVerde_23 = new JButton();
        this.btLaranja_2 = new JButton();
        this.btVerde_22 = new JButton();
        this.btAmarelo_1 = new JButton();
        this.btAmarelo_17 = new JButton();
        this.btVerde_12 = new JButton();
        this.btVerde_11 = new JButton();
        this.btVermelho_9 = new JButton();
        this.btVerde_7 = new JButton();
        this.btLaranja_8 = new JButton();
        this.btVerde_8 = new JButton();
        this.btAmarelo_7 = new JButton();
        this.btVerde_9 = new JButton();
        this.btVerde_6 = new JButton();
        this.btVerde_21 = new JButton();
        this.btVerde_0 = new JButton();
        this.btAmarelo_31 = new JButton();
        this.btAmarelo_27 = new JButton();
        this.btLaranja_29 = new JButton();
        this.btVermelho_34 = new JButton();
        this.btAmarelo_24 = new JButton();
        this.btAmarelo_25 = new JButton();
        this.btAmarelo_26 = new JButton();
        this.btVerde_20 = new JButton();
        this.btLaranja_19 = new JButton();
        this.btLaranja_18 = new JButton();
        this.btLaranja_17 = new JButton();
        this.btVermelho_11 = new JButton();
        this.btLaranja_13 = new JButton();
        this.btLaranja_10 = new JButton();
        this.btLaranja_14 = new JButton();
        this.btLaranja_11 = new JButton();
        this.btLaranja_15 = new JButton();
        this.btLaranja_12 = new JButton();
        this.btVermelho_2 = new JButton();
        this.btAmarelo_30 = new JButton();
        this.btLaranja_1 = new JButton();
        this.btAmarelo_29 = new JButton();
        this.btAmarelo_0 = new JButton();
        this.btAmarelo_28 = new JButton();
        this.btLaranja_28 = new JButton();
        this.btVermelho_33 = new JButton();
        this.btLaranja_25 = new JButton();
        this.btVermelho_30 = new JButton();
        this.btAmarelo_9 = new JButton();
        this.btAmarelo_13 = new JButton();
        this.btVermelho_12 = new JButton();
        this.btVermelho_13 = new JButton();
        this.btVermelho_14 = new JButton();
        this.btVermelho_15 = new JButton();
        this.btVermelho_16 = new JButton();
        this.btVermelho_17 = new JButton();
        this.btVermelho_18 = new JButton();
        this.btVermelho_19 = new JButton();
        this.btAmarelo_20 = new JButton();
        this.btVerde_15 = new JButton();
        this.btAzulClaro_10 = new JButton();
        this.btAzulEscuro_4 = new JButton();
        this.btVermelho_6 = new JButton();
        this.btAzulClaro_2 = new JButton();
        this.btLaranja_5 = new JButton();
        this.btAzulEscuro_1 = new JButton();
        this.btVerde_1 = new JButton();
        this.btAmarelo_4 = new JButton();
        this.btVermelho_20 = new JButton();
        this.btVermelho_21 = new JButton();
        this.btVermelho_22 = new JButton();
        this.btVermelho_23 = new JButton();
        this.btVermelho_24 = new JButton();
        this.btAzulClaro_13 = new JButton();
        this.btRoxo_0 = new JButton();
        this.btLaranja_27 = new JButton();
        this.btLaranja_24 = new JButton();
        this.btVermelho_32 = new JButton();
        this.btVermelho_29 = new JButton();
        this.btAmarelo_22 = new JButton();
        this.btVerde_17 = new JButton();
        this.btAzulClaro_12 = new JButton();
        this.btAzulEscuro_6 = new JButton();
        this.btAzulClaro_9 = new JButton();
        this.btVermelho_7 = new JButton();
        this.btAzulClaro_3 = new JButton();
        this.btLaranja_6 = new JButton();
        this.btAzulEscuro_2 = new JButton();
        this.btAmarelo_5 = new JButton();
        this.btAzulEscuro_3 = new JButton();
        this.btVermelho_4 = new JButton();
        this.btVerde_4 = new JButton();
        this.btAzulClaro_0 = new JButton();
        this.btVerde_3 = new JButton();
        this.btLaranja_3 = new JButton();
        this.btAzulEscuro_5 = new JButton();
        this.btAzulClaro_15 = new JButton();
        this.btAmarelo_2 = new JButton();
        this.btAzulClaro_14 = new JButton();
        this.btLaranja_26 = new JButton();
        this.btVermelho_31 = new JButton();
        this.jMenuBar2 = new JMenuBar();
        this.mnConectar = new JMenu();
        this.mnIniciarPartida = new JMenu();
        this.mnAbandonarPartida = new JMenu();
        this.mnRealizarAcordo = new JMenu();
        this.mnDesconectar = new JMenu();
        this.mnAjuda = new JMenu();
        this.setDefaultCloseOperation(3);
        this.setTitle("MORELLI");
        this.setResizable(false);
        this.painel.setEditable(false);
        this.painel.setName("");
        this.jScrollPane1.setViewportView(this.painel);
        this.btAmarelo_21.setBackground(new Color(255, 255, 0));
        this.btAmarelo_21.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_21.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_21.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_21ActionPerformed(evt);
            }
        });
        this.btVerde_16.setBackground(new Color(51, 255, 51));
        this.btVerde_16.setMaximumSize(new Dimension(40, 40));
        this.btVerde_16.setMinimumSize(new Dimension(40, 40));
        this.btVerde_16.setPreferredSize(new Dimension(40, 40));
        this.btVerde_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_16ActionPerformed(evt);
            }
        });
        this.btLaranja_21.setBackground(new Color(255, 153, 51));
        this.btLaranja_21.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_21.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_21.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_21ActionPerformed(evt);
            }
        });
        this.btVermelho_26.setBackground(new Color(255, 0, 0));
        this.btVermelho_26.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_26.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_26.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_26ActionPerformed(evt);
            }
        });
        this.btAmarelo_16.setBackground(new Color(255, 255, 0));
        this.btAmarelo_16.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_16.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_16.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_16ActionPerformed(evt);
            }
        });
        this.btAmarelo_15.setBackground(new Color(255, 255, 0));
        this.btAmarelo_15.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_15.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_15.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_15ActionPerformed(evt);
            }
        });
        this.btAmarelo_14.setBackground(new Color(255, 255, 0));
        this.btAmarelo_14.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_14.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_14.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_14ActionPerformed(evt);
            }
        });
        this.btLaranja_16.setBackground(new Color(255, 153, 51));
        this.btLaranja_16.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_16.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_16.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_16ActionPerformed(evt);
            }
        });
        this.btVermelho_10.setBackground(new Color(255, 0, 0));
        this.btVermelho_10.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_10.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_10.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_10ActionPerformed(evt);
            }
        });
        this.btAzulClaro_11.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_11.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_11.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_11.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_11ActionPerformed(evt);
            }
        });
        this.btAmarelo_10.setBackground(new Color(255, 255, 0));
        this.btAmarelo_10.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_10.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_10.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_10ActionPerformed(evt);
            }
        });
        this.btVermelho_5.setBackground(new Color(255, 0, 0));
        this.btVermelho_5.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_5.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_5.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_5ActionPerformed(evt);
            }
        });
        this.btLaranja_9.setBackground(new Color(255, 153, 51));
        this.btLaranja_9.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_9.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_9.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_9ActionPerformed(evt);
            }
        });
        this.btAzulClaro_1.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_1.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_1.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_1.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_1ActionPerformed(evt);
            }
        });
        this.btAmarelo_11.setBackground(new Color(255, 255, 0));
        this.btAmarelo_11.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_11.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_11.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_11ActionPerformed(evt);
            }
        });
        this.btLaranja_4.setBackground(new Color(255, 153, 51));
        this.btLaranja_4.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_4.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_4.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_4ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_0.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_0.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_0.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_0.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_0ActionPerformed(evt);
            }
        });
        this.btAmarelo_3.setBackground(new Color(255, 255, 0));
        this.btAmarelo_3.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_3.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_3.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_3ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_7.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_7.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_7.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_7.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_7ActionPerformed(evt);
            }
        });
        this.btVerde_2.setBackground(new Color(51, 255, 51));
        this.btVerde_2.setMaximumSize(new Dimension(40, 40));
        this.btVerde_2.setMinimumSize(new Dimension(40, 40));
        this.btVerde_2.setPreferredSize(new Dimension(40, 40));
        this.btVerde_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_2ActionPerformed(evt);
            }
        });
        this.btVermelho_45.setBackground(new Color(255, 0, 0));
        this.btVermelho_45.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_45.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_45.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_45.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_45ActionPerformed(evt);
            }
        });
        this.btAmarelo_19.setBackground(new Color(255, 255, 0));
        this.btAmarelo_19.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_19.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_19.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_19ActionPerformed(evt);
            }
        });
        this.btVermelho_41.setBackground(new Color(255, 0, 0));
        this.btVermelho_41.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_41.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_41.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_41.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_41ActionPerformed(evt);
            }
        });
        this.btVerde_14.setBackground(new Color(51, 255, 51));
        this.btVerde_14.setMaximumSize(new Dimension(40, 40));
        this.btVerde_14.setMinimumSize(new Dimension(40, 40));
        this.btVerde_14.setPreferredSize(new Dimension(40, 40));
        this.btVerde_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_14ActionPerformed(evt);
            }
        });
        this.btVermelho_37.setBackground(new Color(255, 0, 0));
        this.btVermelho_37.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_37.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_37.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_37.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_37ActionPerformed(evt);
            }
        });
        this.btVermelho_36.setBackground(new Color(255, 0, 0));
        this.btVermelho_36.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_36.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_36.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_36.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_36ActionPerformed(evt);
            }
        });
        this.btVermelho_38.setBackground(new Color(255, 0, 0));
        this.btVermelho_38.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_38.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_38.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_38.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_38ActionPerformed(evt);
            }
        });
        this.btVermelho_39.setBackground(new Color(255, 0, 0));
        this.btVermelho_39.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_39.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_39.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_39.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_39ActionPerformed(evt);
            }
        });
        this.btVermelho_40.setBackground(new Color(255, 0, 0));
        this.btVermelho_40.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_40.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_40.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_40.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_40ActionPerformed(evt);
            }
        });
        this.btLaranja_34.setBackground(new Color(255, 153, 51));
        this.btLaranja_34.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_34.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_34.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_34ActionPerformed(evt);
            }
        });
        this.btVerde_5.setBackground(new Color(51, 255, 51));
        this.btVerde_5.setMaximumSize(new Dimension(40, 40));
        this.btVerde_5.setMinimumSize(new Dimension(40, 40));
        this.btVerde_5.setPreferredSize(new Dimension(40, 40));
        this.btVerde_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_5ActionPerformed(evt);
            }
        });
        this.btAmarelo_8.setBackground(new Color(255, 255, 0));
        this.btAmarelo_8.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_8.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_8.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_8ActionPerformed(evt);
            }
        });
        this.btAzulClaro_7.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_7.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_7.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_7.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_7ActionPerformed(evt);
            }
        });
        this.btAmarelo_12.setBackground(new Color(255, 255, 0));
        this.btAmarelo_12.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_12.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_12.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_12ActionPerformed(evt);
            }
        });
        this.btVermelho_0.setBackground(new Color(255, 0, 0));
        this.btVermelho_0.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_0.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_0.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_0ActionPerformed(evt);
            }
        });
        this.btLaranja_23.setBackground(new Color(255, 153, 51));
        this.btLaranja_23.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_23.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_23.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_23ActionPerformed(evt);
            }
        });
        this.btLaranja_20.setBackground(new Color(255, 153, 51));
        this.btLaranja_20.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_20.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_20.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_20ActionPerformed(evt);
            }
        });
        this.btVermelho_44.setBackground(new Color(255, 0, 0));
        this.btVermelho_44.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_44.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_44.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_44.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_44ActionPerformed(evt);
            }
        });
        this.btVermelho_28.setBackground(new Color(255, 0, 0));
        this.btVermelho_28.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_28.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_28.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_28ActionPerformed(evt);
            }
        });
        this.btVermelho_47.setBackground(new Color(255, 0, 0));
        this.btVermelho_47.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_47.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_47.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_47.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_47ActionPerformed(evt);
            }
        });
        this.btVermelho_25.setBackground(new Color(255, 0, 0));
        this.btVermelho_25.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_25.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_25.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_25ActionPerformed(evt);
            }
        });
        this.btVermelho_43.setBackground(new Color(255, 0, 0));
        this.btVermelho_43.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_43.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_43.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_43.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_43ActionPerformed(evt);
            }
        });
        this.btAmarelo_18.setBackground(new Color(255, 255, 0));
        this.btAmarelo_18.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_18.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_18.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_18ActionPerformed(evt);
            }
        });
        this.btVermelho_46.setBackground(new Color(255, 0, 0));
        this.btVermelho_46.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_46.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_46.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_46.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_46ActionPerformed(evt);
            }
        });
        this.btVerde_13.setBackground(new Color(51, 255, 51));
        this.btVerde_13.setMaximumSize(new Dimension(40, 40));
        this.btVerde_13.setMinimumSize(new Dimension(40, 40));
        this.btVerde_13.setPreferredSize(new Dimension(40, 40));
        this.btVerde_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_13ActionPerformed(evt);
            }
        });
        this.btVermelho_42.setBackground(new Color(255, 0, 0));
        this.btVermelho_42.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_42.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_42.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_42.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_42ActionPerformed(evt);
            }
        });
        this.btLaranja_30.setBackground(new Color(255, 153, 51));
        this.btLaranja_30.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_30.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_30.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_30ActionPerformed(evt);
            }
        });
        this.btVermelho_35.setBackground(new Color(255, 0, 0));
        this.btVermelho_35.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_35.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_35.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_35.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_35ActionPerformed(evt);
            }
        });
        this.btLaranja_31.setBackground(new Color(255, 153, 51));
        this.btLaranja_31.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_31.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_31.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_31ActionPerformed(evt);
            }
        });
        this.btLaranja_32.setBackground(new Color(255, 153, 51));
        this.btLaranja_32.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_32.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_32.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_32ActionPerformed(evt);
            }
        });
        this.btLaranja_33.setBackground(new Color(255, 153, 51));
        this.btLaranja_33.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_33.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_33.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_33ActionPerformed(evt);
            }
        });
        this.btVermelho_1.setBackground(new Color(255, 0, 0));
        this.btVermelho_1.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_1.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_1.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_1ActionPerformed(evt);
            }
        });
        this.btLaranja_37.setBackground(new Color(255, 153, 51));
        this.btLaranja_37.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_37.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_37.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_37.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_37ActionPerformed(evt);
            }
        });
        this.btLaranja_0.setBackground(new Color(255, 153, 51));
        this.btLaranja_0.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_0.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_0.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_0ActionPerformed(evt);
            }
        });
        this.btLaranja_36.setBackground(new Color(255, 153, 51));
        this.btLaranja_36.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_36.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_36.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_36.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_36ActionPerformed(evt);
            }
        });
        this.btLaranja_39.setBackground(new Color(255, 153, 51));
        this.btLaranja_39.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_39.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_39.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_39.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_39ActionPerformed(evt);
            }
        });
        this.btAzulClaro_8.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_8.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_8.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_8.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_8ActionPerformed(evt);
            }
        });
        this.btVerde_10.setBackground(new Color(51, 255, 51));
        this.btVerde_10.setMaximumSize(new Dimension(40, 40));
        this.btVerde_10.setMinimumSize(new Dimension(40, 40));
        this.btVerde_10.setPreferredSize(new Dimension(40, 40));
        this.btVerde_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_10ActionPerformed(evt);
            }
        });
        this.btVermelho_8.setBackground(new Color(255, 0, 0));
        this.btVermelho_8.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_8.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_8.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_8ActionPerformed(evt);
            }
        });
        this.btAzulClaro_4.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_4.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_4.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_4.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_4ActionPerformed(evt);
            }
        });
        this.btLaranja_7.setBackground(new Color(255, 153, 51));
        this.btLaranja_7.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_7.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_7.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_7ActionPerformed(evt);
            }
        });
        this.btAzulClaro_5.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_5.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_5.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_5.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_5ActionPerformed(evt);
            }
        });
        this.btAmarelo_6.setBackground(new Color(255, 255, 0));
        this.btAmarelo_6.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_6.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_6.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_6ActionPerformed(evt);
            }
        });
        this.btAzulClaro_6.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_6.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_6.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_6.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_6ActionPerformed(evt);
            }
        });
        this.btLaranja_22.setBackground(new Color(255, 153, 51));
        this.btLaranja_22.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_22.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_22.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_22ActionPerformed(evt);
            }
        });
        this.btVermelho_27.setBackground(new Color(255, 0, 0));
        this.btVermelho_27.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_27.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_27.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_27ActionPerformed(evt);
            }
        });
        this.btLaranja_35.setBackground(new Color(255, 153, 51));
        this.btLaranja_35.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_35.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_35.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_35.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_35ActionPerformed(evt);
            }
        });
        this.btLaranja_38.setBackground(new Color(255, 153, 51));
        this.btLaranja_38.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_38.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_38.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_38.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_38ActionPerformed(evt);
            }
        });
        this.btAmarelo_23.setBackground(new Color(255, 255, 0));
        this.btAmarelo_23.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_23.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_23.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_23ActionPerformed(evt);
            }
        });
        this.btVerde_18.setBackground(new Color(51, 255, 51));
        this.btVerde_18.setMaximumSize(new Dimension(40, 40));
        this.btVerde_18.setMinimumSize(new Dimension(40, 40));
        this.btVerde_18.setPreferredSize(new Dimension(40, 40));
        this.btVerde_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_18ActionPerformed(evt);
            }
        });
        this.btVerde_19.setBackground(new Color(51, 255, 51));
        this.btVerde_19.setMaximumSize(new Dimension(40, 40));
        this.btVerde_19.setMinimumSize(new Dimension(40, 40));
        this.btVerde_19.setPreferredSize(new Dimension(40, 40));
        this.btVerde_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_19ActionPerformed(evt);
            }
        });
        this.btVermelho_3.setBackground(new Color(255, 0, 0));
        this.btVermelho_3.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_3.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_3.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_3ActionPerformed(evt);
            }
        });
        this.btVerde_23.setBackground(new Color(51, 255, 51));
        this.btVerde_23.setMaximumSize(new Dimension(40, 40));
        this.btVerde_23.setMinimumSize(new Dimension(40, 40));
        this.btVerde_23.setPreferredSize(new Dimension(40, 40));
        this.btVerde_23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_23ActionPerformed(evt);
            }
        });
        this.btLaranja_2.setBackground(new Color(255, 153, 51));
        this.btLaranja_2.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_2.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_2.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_2ActionPerformed(evt);
            }
        });
        this.btVerde_22.setBackground(new Color(51, 255, 51));
        this.btVerde_22.setMaximumSize(new Dimension(40, 40));
        this.btVerde_22.setMinimumSize(new Dimension(40, 40));
        this.btVerde_22.setPreferredSize(new Dimension(40, 40));
        this.btVerde_22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_22ActionPerformed(evt);
            }
        });
        this.btAmarelo_1.setBackground(new Color(255, 255, 0));
        this.btAmarelo_1.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_1.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_1.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_1ActionPerformed(evt);
            }
        });
        this.btAmarelo_17.setBackground(new Color(255, 255, 0));
        this.btAmarelo_17.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_17.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_17.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_17ActionPerformed(evt);
            }
        });
        this.btVerde_12.setBackground(new Color(51, 255, 51));
        this.btVerde_12.setMaximumSize(new Dimension(40, 40));
        this.btVerde_12.setMinimumSize(new Dimension(40, 40));
        this.btVerde_12.setPreferredSize(new Dimension(40, 40));
        this.btVerde_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_12ActionPerformed(evt);
            }
        });
        this.btVerde_11.setBackground(new Color(51, 255, 51));
        this.btVerde_11.setMaximumSize(new Dimension(40, 40));
        this.btVerde_11.setMinimumSize(new Dimension(40, 40));
        this.btVerde_11.setPreferredSize(new Dimension(40, 40));
        this.btVerde_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_11ActionPerformed(evt);
            }
        });
        this.btVermelho_9.setBackground(new Color(255, 0, 0));
        this.btVermelho_9.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_9.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_9.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_9ActionPerformed(evt);
            }
        });
        this.btVerde_7.setBackground(new Color(51, 255, 51));
        this.btVerde_7.setMaximumSize(new Dimension(40, 40));
        this.btVerde_7.setMinimumSize(new Dimension(40, 40));
        this.btVerde_7.setPreferredSize(new Dimension(40, 40));
        this.btVerde_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_7ActionPerformed(evt);
            }
        });
        this.btLaranja_8.setBackground(new Color(255, 153, 51));
        this.btLaranja_8.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_8.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_8.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_8ActionPerformed(evt);
            }
        });
        this.btVerde_8.setBackground(new Color(51, 255, 51));
        this.btVerde_8.setMaximumSize(new Dimension(40, 40));
        this.btVerde_8.setMinimumSize(new Dimension(40, 40));
        this.btVerde_8.setPreferredSize(new Dimension(40, 40));
        this.btVerde_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_8ActionPerformed(evt);
            }
        });
        this.btAmarelo_7.setBackground(new Color(255, 255, 0));
        this.btAmarelo_7.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_7.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_7.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_7ActionPerformed(evt);
            }
        });
        this.btVerde_9.setBackground(new Color(51, 255, 51));
        this.btVerde_9.setMaximumSize(new Dimension(40, 40));
        this.btVerde_9.setMinimumSize(new Dimension(40, 40));
        this.btVerde_9.setPreferredSize(new Dimension(40, 40));
        this.btVerde_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_9ActionPerformed(evt);
            }
        });
        this.btVerde_6.setBackground(new Color(51, 255, 51));
        this.btVerde_6.setMaximumSize(new Dimension(40, 40));
        this.btVerde_6.setMinimumSize(new Dimension(40, 40));
        this.btVerde_6.setPreferredSize(new Dimension(40, 40));
        this.btVerde_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_6ActionPerformed(evt);
            }
        });
        this.btVerde_21.setBackground(new Color(51, 255, 51));
        this.btVerde_21.setMaximumSize(new Dimension(40, 40));
        this.btVerde_21.setMinimumSize(new Dimension(40, 40));
        this.btVerde_21.setPreferredSize(new Dimension(40, 40));
        this.btVerde_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_21ActionPerformed(evt);
            }
        });
        this.btVerde_0.setBackground(new Color(51, 255, 51));
        this.btVerde_0.setMaximumSize(new Dimension(40, 40));
        this.btVerde_0.setMinimumSize(new Dimension(40, 40));
        this.btVerde_0.setPreferredSize(new Dimension(40, 40));
        this.btVerde_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_0ActionPerformed(evt);
            }
        });
        this.btAmarelo_31.setBackground(new Color(255, 255, 0));
        this.btAmarelo_31.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_31.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_31.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_31ActionPerformed(evt);
            }
        });
        this.btAmarelo_27.setBackground(new Color(255, 255, 0));
        this.btAmarelo_27.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_27.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_27.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_27ActionPerformed(evt);
            }
        });
        this.btLaranja_29.setBackground(new Color(255, 153, 51));
        this.btLaranja_29.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_29.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_29.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_29ActionPerformed(evt);
            }
        });
        this.btVermelho_34.setBackground(new Color(255, 0, 0));
        this.btVermelho_34.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_34.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_34.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_34.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_34ActionPerformed(evt);
            }
        });
        this.btAmarelo_24.setBackground(new Color(255, 255, 0));
        this.btAmarelo_24.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_24.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_24.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_24ActionPerformed(evt);
            }
        });
        this.btAmarelo_25.setBackground(new Color(255, 255, 0));
        this.btAmarelo_25.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_25.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_25.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_25ActionPerformed(evt);
            }
        });
        this.btAmarelo_26.setBackground(new Color(255, 255, 0));
        this.btAmarelo_26.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_26.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_26.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_26ActionPerformed(evt);
            }
        });
        this.btVerde_20.setBackground(new Color(51, 255, 51));
        this.btVerde_20.setMaximumSize(new Dimension(40, 40));
        this.btVerde_20.setMinimumSize(new Dimension(40, 40));
        this.btVerde_20.setPreferredSize(new Dimension(40, 40));
        this.btVerde_20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_20ActionPerformed(evt);
            }
        });
        this.btLaranja_19.setBackground(new Color(255, 153, 51));
        this.btLaranja_19.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_19.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_19.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_19ActionPerformed(evt);
            }
        });
        this.btLaranja_18.setBackground(new Color(255, 153, 51));
        this.btLaranja_18.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_18.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_18.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_18ActionPerformed(evt);
            }
        });
        this.btLaranja_17.setBackground(new Color(255, 153, 51));
        this.btLaranja_17.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_17.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_17.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_17ActionPerformed(evt);
            }
        });
        this.btVermelho_11.setBackground(new Color(255, 0, 0));
        this.btVermelho_11.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_11.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_11.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_11ActionPerformed(evt);
            }
        });
        this.btLaranja_13.setBackground(new Color(255, 153, 51));
        this.btLaranja_13.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_13.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_13.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_13ActionPerformed(evt);
            }
        });
        this.btLaranja_10.setBackground(new Color(255, 153, 51));
        this.btLaranja_10.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_10.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_10.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_10ActionPerformed(evt);
            }
        });
        this.btLaranja_14.setBackground(new Color(255, 153, 51));
        this.btLaranja_14.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_14.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_14.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_14ActionPerformed(evt);
            }
        });
        this.btLaranja_11.setBackground(new Color(255, 153, 51));
        this.btLaranja_11.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_11.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_11.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_11ActionPerformed(evt);
            }
        });
        this.btLaranja_15.setBackground(new Color(255, 153, 51));
        this.btLaranja_15.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_15.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_15.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_15ActionPerformed(evt);
            }
        });
        this.btLaranja_12.setBackground(new Color(255, 153, 51));
        this.btLaranja_12.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_12.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_12.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_12ActionPerformed(evt);
            }
        });
        this.btVermelho_2.setBackground(new Color(255, 0, 0));
        this.btVermelho_2.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_2.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_2.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_2ActionPerformed(evt);
            }
        });
        this.btAmarelo_30.setBackground(new Color(255, 255, 0));
        this.btAmarelo_30.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_30.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_30.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_30ActionPerformed(evt);
            }
        });
        this.btLaranja_1.setBackground(new Color(255, 153, 51));
        this.btLaranja_1.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_1.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_1.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_1ActionPerformed(evt);
            }
        });
        this.btAmarelo_29.setBackground(new Color(255, 255, 0));
        this.btAmarelo_29.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_29.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_29.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_29ActionPerformed(evt);
            }
        });
        this.btAmarelo_0.setBackground(new Color(255, 255, 0));
        this.btAmarelo_0.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_0.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_0.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_0ActionPerformed(evt);
            }
        });
        this.btAmarelo_28.setBackground(new Color(255, 255, 0));
        this.btAmarelo_28.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_28.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_28.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_28ActionPerformed(evt);
            }
        });
        this.btLaranja_28.setBackground(new Color(255, 153, 51));
        this.btLaranja_28.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_28.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_28.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_28.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_28ActionPerformed(evt);
            }
        });
        this.btVermelho_33.setBackground(new Color(255, 0, 0));
        this.btVermelho_33.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_33.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_33.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_33ActionPerformed(evt);
            }
        });
        this.btLaranja_25.setBackground(new Color(255, 153, 51));
        this.btLaranja_25.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_25.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_25.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_25.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_25ActionPerformed(evt);
            }
        });
        this.btVermelho_30.setBackground(new Color(255, 0, 0));
        this.btVermelho_30.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_30.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_30.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_30.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_30ActionPerformed(evt);
            }
        });
        this.btAmarelo_9.setBackground(new Color(255, 255, 0));
        this.btAmarelo_9.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_9.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_9.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_9ActionPerformed(evt);
            }
        });
        this.btAmarelo_13.setBackground(new Color(255, 255, 0));
        this.btAmarelo_13.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_13.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_13.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_13ActionPerformed(evt);
            }
        });
        this.btVermelho_12.setBackground(new Color(255, 0, 0));
        this.btVermelho_12.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_12.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_12.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_12ActionPerformed(evt);
            }
        });
        this.btVermelho_13.setBackground(new Color(255, 0, 0));
        this.btVermelho_13.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_13.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_13.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_13ActionPerformed(evt);
            }
        });
        this.btVermelho_14.setBackground(new Color(255, 0, 0));
        this.btVermelho_14.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_14.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_14.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_14ActionPerformed(evt);
            }
        });
        this.btVermelho_15.setBackground(new Color(255, 0, 0));
        this.btVermelho_15.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_15.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_15.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_15ActionPerformed(evt);
            }
        });
        this.btVermelho_16.setBackground(new Color(255, 0, 0));
        this.btVermelho_16.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_16.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_16.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_16ActionPerformed(evt);
            }
        });
        this.btVermelho_17.setBackground(new Color(255, 0, 0));
        this.btVermelho_17.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_17.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_17.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_17ActionPerformed(evt);
            }
        });
        this.btVermelho_18.setBackground(new Color(255, 0, 0));
        this.btVermelho_18.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_18.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_18.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_18ActionPerformed(evt);
            }
        });
        this.btVermelho_19.setBackground(new Color(255, 0, 0));
        this.btVermelho_19.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_19.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_19.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_19ActionPerformed(evt);
            }
        });
        this.btAmarelo_20.setBackground(new Color(255, 255, 0));
        this.btAmarelo_20.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_20.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_20.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_20ActionPerformed(evt);
            }
        });
        this.btVerde_15.setBackground(new Color(51, 255, 51));
        this.btVerde_15.setMaximumSize(new Dimension(40, 40));
        this.btVerde_15.setMinimumSize(new Dimension(40, 40));
        this.btVerde_15.setPreferredSize(new Dimension(40, 40));
        this.btVerde_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_15ActionPerformed(evt);
            }
        });
        this.btAzulClaro_10.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_10.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_10.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_10.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_10ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_4.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_4.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_4.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_4.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_4ActionPerformed(evt);
            }
        });
        this.btVermelho_6.setBackground(new Color(255, 0, 0));
        this.btVermelho_6.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_6.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_6.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_6ActionPerformed(evt);
            }
        });
        this.btAzulClaro_2.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_2.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_2.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_2.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_2ActionPerformed(evt);
            }
        });
        this.btLaranja_5.setBackground(new Color(255, 153, 51));
        this.btLaranja_5.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_5.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_5.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_5ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_1.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_1.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_1.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_1.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_1ActionPerformed(evt);
            }
        });
        this.btVerde_1.setBackground(new Color(51, 255, 51));
        this.btVerde_1.setMaximumSize(new Dimension(40, 40));
        this.btVerde_1.setMinimumSize(new Dimension(40, 40));
        this.btVerde_1.setPreferredSize(new Dimension(40, 40));
        this.btVerde_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_1ActionPerformed(evt);
            }
        });
        this.btAmarelo_4.setBackground(new Color(255, 255, 0));
        this.btAmarelo_4.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_4.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_4.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_4ActionPerformed(evt);
            }
        });
        this.btVermelho_20.setBackground(new Color(255, 0, 0));
        this.btVermelho_20.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_20.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_20.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_20ActionPerformed(evt);
            }
        });
        this.btVermelho_21.setBackground(new Color(255, 0, 0));
        this.btVermelho_21.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_21.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_21.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_21ActionPerformed(evt);
            }
        });
        this.btVermelho_22.setBackground(new Color(255, 0, 0));
        this.btVermelho_22.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_22.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_22.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_22ActionPerformed(evt);
            }
        });
        this.btVermelho_23.setBackground(new Color(255, 0, 0));
        this.btVermelho_23.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_23.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_23.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_23.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_23ActionPerformed(evt);
            }
        });
        this.btVermelho_24.setBackground(new Color(255, 0, 0));
        this.btVermelho_24.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_24.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_24.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_24ActionPerformed(evt);
            }
        });
        this.btAzulClaro_13.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_13.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_13.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_13.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_13ActionPerformed(evt);
            }
        });
        this.btRoxo_0.setBackground(new Color(153, 0, 153));
        this.btRoxo_0.setMaximumSize(new Dimension(40, 40));
        this.btRoxo_0.setMinimumSize(new Dimension(40, 40));
        this.btRoxo_0.setPreferredSize(new Dimension(40, 40));
        this.btRoxo_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btRoxo_0ActionPerformed(evt);
            }
        });
        this.btLaranja_27.setBackground(new Color(255, 153, 51));
        this.btLaranja_27.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_27.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_27.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_27.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_27ActionPerformed(evt);
            }
        });
        this.btLaranja_24.setBackground(new Color(255, 153, 51));
        this.btLaranja_24.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_24.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_24.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_24ActionPerformed(evt);
            }
        });
        this.btVermelho_32.setBackground(new Color(255, 0, 0));
        this.btVermelho_32.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_32.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_32.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_32.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_32ActionPerformed(evt);
            }
        });
        this.btVermelho_29.setBackground(new Color(255, 0, 0));
        this.btVermelho_29.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_29.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_29.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_29.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_29ActionPerformed(evt);
            }
        });
        this.btAmarelo_22.setBackground(new Color(255, 255, 0));
        this.btAmarelo_22.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_22.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_22.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_22ActionPerformed(evt);
            }
        });
        this.btVerde_17.setBackground(new Color(51, 255, 51));
        this.btVerde_17.setMaximumSize(new Dimension(40, 40));
        this.btVerde_17.setMinimumSize(new Dimension(40, 40));
        this.btVerde_17.setPreferredSize(new Dimension(40, 40));
        this.btVerde_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_17ActionPerformed(evt);
            }
        });
        this.btAzulClaro_12.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_12.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_12.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_12.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_12ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_6.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_6.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_6.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_6.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_6ActionPerformed(evt);
            }
        });
        this.btAzulClaro_9.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_9.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_9.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_9.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_9ActionPerformed(evt);
            }
        });
        this.btVermelho_7.setBackground(new Color(255, 0, 0));
        this.btVermelho_7.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_7.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_7.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_7ActionPerformed(evt);
            }
        });
        this.btAzulClaro_3.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_3.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_3.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_3.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_3ActionPerformed(evt);
            }
        });
        this.btLaranja_6.setBackground(new Color(255, 153, 51));
        this.btLaranja_6.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_6.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_6.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_6ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_2.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_2.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_2.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_2.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_2ActionPerformed(evt);
            }
        });
        this.btAmarelo_5.setBackground(new Color(255, 255, 0));
        this.btAmarelo_5.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_5.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_5.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_5ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_3.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_3.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_3.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_3.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_3ActionPerformed(evt);
            }
        });
        this.btVermelho_4.setBackground(new Color(255, 0, 0));
        this.btVermelho_4.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_4.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_4.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_4ActionPerformed(evt);
            }
        });
        this.btVerde_4.setBackground(new Color(51, 255, 51));
        this.btVerde_4.setMaximumSize(new Dimension(40, 40));
        this.btVerde_4.setMinimumSize(new Dimension(40, 40));
        this.btVerde_4.setPreferredSize(new Dimension(40, 40));
        this.btVerde_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_4ActionPerformed(evt);
            }
        });
        this.btAzulClaro_0.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_0.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_0.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_0.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_0ActionPerformed(evt);
            }
        });
        this.btVerde_3.setBackground(new Color(51, 255, 51));
        this.btVerde_3.setMaximumSize(new Dimension(40, 40));
        this.btVerde_3.setMinimumSize(new Dimension(40, 40));
        this.btVerde_3.setPreferredSize(new Dimension(40, 40));
        this.btVerde_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVerde_3ActionPerformed(evt);
            }
        });
        this.btLaranja_3.setBackground(new Color(255, 153, 51));
        this.btLaranja_3.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_3.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_3.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_3ActionPerformed(evt);
            }
        });
        this.btAzulEscuro_5.setBackground(new Color(0, 0, 153));
        this.btAzulEscuro_5.setMaximumSize(new Dimension(40, 40));
        this.btAzulEscuro_5.setMinimumSize(new Dimension(40, 40));
        this.btAzulEscuro_5.setPreferredSize(new Dimension(40, 40));
        this.btAzulEscuro_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulEscuro_5ActionPerformed(evt);
            }
        });
        this.btAzulClaro_15.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_15.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_15.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_15.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_15ActionPerformed(evt);
            }
        });
        this.btAmarelo_2.setBackground(new Color(255, 255, 0));
        this.btAmarelo_2.setMaximumSize(new Dimension(40, 40));
        this.btAmarelo_2.setMinimumSize(new Dimension(40, 40));
        this.btAmarelo_2.setPreferredSize(new Dimension(40, 40));
        this.btAmarelo_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAmarelo_2ActionPerformed(evt);
            }
        });
        this.btAzulClaro_14.setBackground(new Color(102, 204, 255));
        this.btAzulClaro_14.setMaximumSize(new Dimension(40, 40));
        this.btAzulClaro_14.setMinimumSize(new Dimension(40, 40));
        this.btAzulClaro_14.setPreferredSize(new Dimension(40, 40));
        this.btAzulClaro_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btAzulClaro_14ActionPerformed(evt);
            }
        });
        this.btLaranja_26.setBackground(new Color(255, 153, 51));
        this.btLaranja_26.setMaximumSize(new Dimension(40, 40));
        this.btLaranja_26.setMinimumSize(new Dimension(40, 40));
        this.btLaranja_26.setPreferredSize(new Dimension(40, 40));
        this.btLaranja_26.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btLaranja_26ActionPerformed(evt);
            }
        });
        this.btVermelho_31.setBackground(new Color(255, 0, 0));
        this.btVermelho_31.setMaximumSize(new Dimension(40, 40));
        this.btVermelho_31.setMinimumSize(new Dimension(40, 40));
        this.btVermelho_31.setPreferredSize(new Dimension(40, 40));
        this.btVermelho_31.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TelaJogador.this.btVermelho_31ActionPerformed(evt);
            }
        });
        GroupLayout painelBotoesLayout = new GroupLayout(this.painelBotoes);
        this.painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addGroup(painelBotoesLayout.createSequentialGroup().addContainerGap().addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_36, -2, -1, -2).addComponent(this.btVermelho_37, -2, -1, -2).addComponent(this.btVermelho_38, -2, -1, -2).addComponent(this.btVermelho_39, -2, -1, -2).addComponent(this.btVermelho_40, -2, -1, -2).addComponent(this.btVermelho_41, -2, -1, -2).addComponent(this.btVermelho_42, -2, -1, -2).addComponent(this.btVermelho_43, -2, -1, -2).addComponent(this.btVermelho_44, -2, -1, -2).addComponent(this.btVermelho_45, -2, -1, -2).addComponent(this.btVermelho_46, -2, -1, -2).addComponent(this.btVermelho_47, -2, -1, -2).addComponent(this.btVermelho_0, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_35, -2, -1, -2).addComponent(this.btLaranja_30, -2, -1, -2).addComponent(this.btLaranja_31, -2, -1, -2).addComponent(this.btLaranja_32, -2, -1, -2).addComponent(this.btLaranja_33, -2, -1, -2).addComponent(this.btLaranja_34, -2, -1, -2).addComponent(this.btLaranja_35, -2, -1, -2).addComponent(this.btLaranja_36, -2, -1, -2).addComponent(this.btLaranja_37, -2, -1, -2).addComponent(this.btLaranja_38, -2, -1, -2).addComponent(this.btLaranja_39, -2, -1, -2).addComponent(this.btLaranja_0, -2, -1, -2).addComponent(this.btVermelho_1, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_34, -2, -1, -2).addComponent(this.btLaranja_29, -2, -1, -2).addComponent(this.btAmarelo_24, -2, -1, -2).addComponent(this.btAmarelo_25, -2, -1, -2).addComponent(this.btAmarelo_26, -2, -1, -2).addComponent(this.btAmarelo_27, -2, -1, -2).addComponent(this.btAmarelo_28, -2, -1, -2).addComponent(this.btAmarelo_29, -2, -1, -2).addComponent(this.btAmarelo_30, -2, -1, -2).addComponent(this.btAmarelo_31, -2, -1, -2).addComponent(this.btAmarelo_0, -2, -1, -2).addComponent(this.btLaranja_1, -2, -1, -2).addComponent(this.btVermelho_2, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_33, -2, -1, -2).addComponent(this.btLaranja_28, -2, -1, -2).addComponent(this.btAmarelo_23, -2, -1, -2).addComponent(this.btVerde_18, -2, -1, -2).addComponent(this.btVerde_19, -2, -1, -2).addComponent(this.btVerde_20, -2, -1, -2).addComponent(this.btVerde_21, -2, -1, -2).addComponent(this.btVerde_22, -2, -1, -2).addComponent(this.btVerde_23, -2, -1, -2).addComponent(this.btVerde_0, -2, -1, -2).addComponent(this.btAmarelo_1, -2, -1, -2).addComponent(this.btLaranja_2, -2, -1, -2).addComponent(this.btVermelho_3, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_32, -2, -1, -2).addComponent(this.btLaranja_27, -2, -1, -2).addComponent(this.btAmarelo_22, -2, -1, -2).addComponent(this.btVerde_17, -2, -1, -2).addComponent(this.btAzulClaro_12, -2, -1, -2).addComponent(this.btAzulClaro_13, -2, -1, -2).addComponent(this.btAzulClaro_14, -2, -1, -2).addComponent(this.btAzulClaro_15, -2, -1, -2).addComponent(this.btAzulClaro_0, -2, -1, -2).addComponent(this.btVerde_1, -2, -1, -2).addComponent(this.btAmarelo_2, -2, -1, -2).addComponent(this.btLaranja_3, -2, -1, -2).addComponent(this.btVermelho_4, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_31, -2, -1, -2).addComponent(this.btLaranja_26, -2, -1, -2).addComponent(this.btAmarelo_21, -2, -1, -2).addComponent(this.btVerde_16, -2, -1, -2).addComponent(this.btAzulClaro_11, -2, -1, -2).addComponent(this.btAzulEscuro_6, -2, -1, -2).addComponent(this.btAzulEscuro_7, -2, -1, -2).addComponent(this.btAzulEscuro_0, -2, -1, -2).addComponent(this.btAzulClaro_1, -2, -1, -2).addComponent(this.btVerde_2, -2, -1, -2).addComponent(this.btAmarelo_3, -2, -1, -2).addComponent(this.btLaranja_4, -2, -1, -2).addComponent(this.btVermelho_5, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_30, -2, -1, -2).addComponent(this.btLaranja_25, -2, -1, -2).addComponent(this.btAmarelo_20, -2, -1, -2).addComponent(this.btVerde_15, -2, -1, -2).addComponent(this.btAzulClaro_10, -2, -1, -2).addComponent(this.btAzulEscuro_5, -2, -1, -2).addComponent(this.btRoxo_0, -2, -1, -2).addComponent(this.btAzulEscuro_1, -2, -1, -2).addComponent(this.btAzulClaro_2, -2, -1, -2).addComponent(this.btVerde_3, -2, -1, -2).addComponent(this.btAmarelo_4, -2, -1, -2).addComponent(this.btLaranja_5, -2, -1, -2).addComponent(this.btVermelho_6, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_29, -2, -1, -2).addComponent(this.btLaranja_24, -2, -1, -2).addComponent(this.btAmarelo_19, -2, -1, -2).addComponent(this.btVerde_14, -2, -1, -2).addComponent(this.btAzulClaro_9, -2, -1, -2).addComponent(this.btAzulEscuro_4, -2, -1, -2).addComponent(this.btAzulEscuro_3, -2, -1, -2).addComponent(this.btAzulEscuro_2, -2, -1, -2).addComponent(this.btAzulClaro_3, -2, -1, -2).addComponent(this.btVerde_4, -2, -1, -2).addComponent(this.btAmarelo_5, -2, -1, -2).addComponent(this.btLaranja_6, -2, -1, -2).addComponent(this.btVermelho_7, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_28, -2, -1, -2).addComponent(this.btLaranja_23, -2, -1, -2).addComponent(this.btAmarelo_18, -2, -1, -2).addComponent(this.btVerde_13, -2, -1, -2).addComponent(this.btAzulClaro_8, -2, -1, -2).addComponent(this.btAzulClaro_7, -2, -1, -2).addComponent(this.btAzulClaro_6, -2, -1, -2).addComponent(this.btAzulClaro_5, -2, -1, -2).addComponent(this.btAzulClaro_4, -2, -1, -2).addComponent(this.btVerde_5, -2, -1, -2).addComponent(this.btAmarelo_6, -2, -1, -2).addComponent(this.btLaranja_7, -2, -1, -2).addComponent(this.btVermelho_8, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_27, -2, -1, -2).addComponent(this.btLaranja_22, -2, -1, -2).addComponent(this.btAmarelo_17, -2, -1, -2).addComponent(this.btVerde_12, -2, -1, -2).addComponent(this.btVerde_11, -2, -1, -2).addComponent(this.btVerde_10, -2, -1, -2).addComponent(this.btVerde_9, -2, -1, -2).addComponent(this.btVerde_8, -2, -1, -2).addComponent(this.btVerde_7, -2, -1, -2).addComponent(this.btVerde_6, -2, -1, -2).addComponent(this.btAmarelo_7, -2, -1, -2).addComponent(this.btLaranja_8, -2, -1, -2).addComponent(this.btVermelho_9, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_26, -2, -1, -2).addComponent(this.btLaranja_21, -2, -1, -2).addComponent(this.btAmarelo_16, -2, -1, -2).addComponent(this.btAmarelo_15, -2, -1, -2).addComponent(this.btAmarelo_14, -2, -1, -2).addComponent(this.btAmarelo_13, -2, -1, -2).addComponent(this.btAmarelo_12, -2, -1, -2).addComponent(this.btAmarelo_11, -2, -1, -2).addComponent(this.btAmarelo_10, -2, -1, -2).addComponent(this.btAmarelo_9, -2, -1, -2).addComponent(this.btAmarelo_8, -2, -1, -2).addComponent(this.btLaranja_9, -2, -1, -2).addComponent(this.btVermelho_10, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_25, -2, -1, -2).addComponent(this.btLaranja_20, -2, -1, -2).addComponent(this.btLaranja_19, -2, -1, -2).addComponent(this.btLaranja_18, -2, -1, -2).addComponent(this.btLaranja_17, -2, -1, -2).addComponent(this.btLaranja_16, -2, -1, -2).addComponent(this.btLaranja_15, -2, -1, -2).addComponent(this.btLaranja_14, -2, -1, -2).addComponent(this.btLaranja_13, -2, -1, -2).addComponent(this.btLaranja_12, -2, -1, -2).addComponent(this.btLaranja_11, -2, -1, -2).addComponent(this.btLaranja_10, -2, -1, -2).addComponent(this.btVermelho_11, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addComponent(this.btVermelho_24, -2, -1, -2).addComponent(this.btVermelho_23, -2, -1, -2).addComponent(this.btVermelho_22, -2, -1, -2).addComponent(this.btVermelho_21, -2, -1, -2).addComponent(this.btVermelho_20, -2, -1, -2).addComponent(this.btVermelho_19, -2, -1, -2).addComponent(this.btVermelho_18, -2, -1, -2).addComponent(this.btVermelho_17, -2, -1, -2).addComponent(this.btVermelho_16, -2, -1, -2).addComponent(this.btVermelho_15, -2, -1, -2).addComponent(this.btVermelho_14, -2, -1, -2).addComponent(this.btVermelho_13, -2, -1, -2).addComponent(this.btVermelho_12, -2, -1, -2)).addContainerGap(-1, 32767)));
        painelBotoesLayout.setVerticalGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, painelBotoesLayout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(painelBotoesLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, painelBotoesLayout.createParallelGroup(Alignment.LEADING).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_11, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_10, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_11, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_12, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_13, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_14, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_15, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_16, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_17, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_18, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_19, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_20, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_25, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_10, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_9, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_9, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_10, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_11, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_12, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_13, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_14, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_15, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_16, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_21, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_26, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_9, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_9, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_10, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_11, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_12, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_17, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_22, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_27, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_13, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_18, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_23, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_28, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_9, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_14, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_19, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_24, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_29, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btRoxo_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_10, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_15, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_20, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_25, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_30, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulEscuro_6, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_11, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_16, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_21, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_26, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_31, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_4, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_15, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_14, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_13, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAzulClaro_12, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_17, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_22, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_27, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_32, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_3, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_23, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_22, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_21, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_20, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_19, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVerde_18, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_23, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_28, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_33, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_31, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_30, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_29, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_28, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_27, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_26, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_25, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btAmarelo_24, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_29, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_34, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_39, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_38, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_37, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_36, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_35, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_34, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_33, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_32, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_31, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btLaranja_30, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_35, -2, -1, -2)).addGroup(painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_0, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_47, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_46, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_45, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_44, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_43, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_42, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_41, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_40, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_39, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_38, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_37, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_36, -2, -1, -2))).addGroup(Alignment.TRAILING, painelBotoesLayout.createSequentialGroup().addComponent(this.btVermelho_12, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_13, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_14, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_15, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_16, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_17, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_18, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_19, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_20, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_21, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_22, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_23, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btVermelho_24, -2, -1, -2))).addContainerGap()));
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 592, -2).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.painelBotoes, -2, -1, -2)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jScrollPane1, -2, 86, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.painelBotoes, -2, -1, -2).addContainerGap()));
        this.mnConectar.setText("Conectar");
        this.mnConectar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnConectarMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnConectar);
        this.mnIniciarPartida.setText("Iniciar partida");
        this.mnIniciarPartida.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnIniciarPartidaMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnIniciarPartida);
        this.mnAbandonarPartida.setText("Abandonar partida");
        this.mnAbandonarPartida.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnAbandonarPartidaMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnAbandonarPartida);
        this.mnRealizarAcordo.setText("Realizar acordo");
        this.mnRealizarAcordo.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnRealizarAcordoMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnRealizarAcordo);
        this.mnDesconectar.setText("Desconectar");
        this.mnDesconectar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnDesconectarMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnDesconectar);
        this.mnAjuda.setText("Ajuda");
        this.mnAjuda.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                TelaJogador.this.mnAjudaMousePressed(evt);
            }
        });
        this.jMenuBar2.add(this.mnAjuda);
        this.setJMenuBar(this.jMenuBar2);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
        this.pack();
    }

    private void mnConectarMousePressed(MouseEvent evt) {
        this.conectar();
    }

    private void mnDesconectarMousePressed(MouseEvent evt) {
        this.desconectar();
    }

    private void mnAjudaMousePressed(MouseEvent evt) {
        this.ajuda();
    }

    private void mnIniciarPartidaMousePressed(MouseEvent evt) {
        this.iniciarPartida();
    }

    private void mnAbandonarPartidaMousePressed(MouseEvent evt) {
        this.abandonarPartida();
    }

    private void mnRealizarAcordoMousePressed(MouseEvent evt) {
        this.realizarAcordo();
    }

    private void btVermelho_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[0]);
    }

    private void btVermelho_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[1]);
    }

    private void btVermelho_12ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[12]);
    }

    private void btVermelho_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[2]);
    }

    private void btVermelho_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[3]);
    }

    private void btVermelho_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[4]);
    }

    private void btVermelho_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[5]);
    }

    private void btVermelho_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[6]);
    }

    private void btVermelho_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[7]);
    }

    private void btVermelho_8ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[8]);
    }

    private void btVermelho_9ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[9]);
    }

    private void btVermelho_10ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[10]);
    }

    private void btVermelho_11ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[11]);
    }

    private void btVermelho_47ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[47]);
    }

    private void btLaranja_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[0]);
    }

    private void btLaranja_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[1]);
    }

    private void btLaranja_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[2]);
    }

    private void btLaranja_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[3]);
    }

    private void btLaranja_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[4]);
    }

    private void btLaranja_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[5]);
    }

    private void btLaranja_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[6]);
    }

    private void btLaranja_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[7]);
    }

    private void btLaranja_8ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[8]);
    }

    private void btLaranja_9ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[9]);
    }

    private void btLaranja_10ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[10]);
    }

    private void btVermelho_13ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[13]);
    }

    private void btVermelho_14ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[14]);
    }

    private void btLaranja_11ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[11]);
    }

    private void btAmarelo_8ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[8]);
    }

    private void btAmarelo_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[7]);
    }

    private void btAmarelo_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[6]);
    }

    private void btAmarelo_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[5]);
    }

    private void btAmarelo_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[4]);
    }

    private void btAmarelo_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[3]);
    }

    private void btAmarelo_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[2]);
    }

    private void btAmarelo_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[1]);
    }

    private void btAmarelo_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[0]);
    }

    private void btLaranja_39ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[39]);
    }

    private void btVermelho_46ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[46]);
    }

    private void btVermelho_45ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[45]);
    }

    private void btLaranja_38ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[38]);
    }

    private void btAmarelo_31ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[31]);
    }

    private void btVerde_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[0]);
    }

    private void btVerde_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[1]);
    }

    private void btVerde_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[2]);
    }

    private void btVerde_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[3]);
    }

    private void btVerde_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[4]);
    }

    private void btVerde_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[5]);
    }

    private void btVerde_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[6]);
    }

    private void btAmarelo_9ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[9]);
    }

    private void btLaranja_12ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[12]);
    }

    private void btVermelho_15ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[15]);
    }

    private void btVermelho_16ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[16]);
    }

    private void btLaranja_13ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[13]);
    }

    private void btAmarelo_10ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[10]);
    }

    private void btVerde_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[7]);
    }

    private void btAzulClaro_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[4]);
    }

    private void btAzulClaro_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[3]);
    }

    private void btAzulClaro_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[2]);
    }

    private void btAzulClaro_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[1]);
    }

    private void btAzulClaro_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[0]);
    }

    private void btVerde_23ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[23]);
    }

    private void btAmarelo_30ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[30]);
    }

    private void btLaranja_37ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[37]);
    }

    private void btVermelho_44ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[44]);
    }

    private void btVermelho_43ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[43]);
    }

    private void btLaranja_36ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[36]);
    }

    private void btAmarelo_29ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[29]);
    }

    private void btVerde_22ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[22]);
    }

    private void btAzulClaro_15ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[15]);
    }

    private void btAzulEscuro_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[0]);
    }

    private void btAzulEscuro_1ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[1]);
    }

    private void btAzulEscuro_2ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[2]);
    }

    private void btAzulClaro_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[5]);
    }

    private void btVerde_8ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[8]);
    }

    private void btAmarelo_11ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[11]);
    }

    private void btLaranja_14ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[14]);
    }

    private void btVermelho_17ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[17]);
    }

    private void btVermelho_18ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[18]);
    }

    private void btLaranja_15ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[15]);
    }

    private void btAmarelo_12ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[12]);
    }

    private void btVerde_9ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[9]);
    }

    private void btAzulClaro_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[6]);
    }

    private void btAzulEscuro_3ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[3]);
    }

    private void btRoxo_0ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesRoxas[0]);
    }

    private void btAzulEscuro_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[7]);
    }

    private void btAzulClaro_14ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[14]);
    }

    private void btVerde_21ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[21]);
    }

    private void btAmarelo_28ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[28]);
    }

    private void btLaranja_35ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[35]);
    }

    private void btVermelho_42ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[42]);
    }

    private void btVermelho_41ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[41]);
    }

    private void btLaranja_34ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[34]);
    }

    private void btAmarelo_27ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[27]);
    }

    private void btVerde_20ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[20]);
    }

    private void btAzulClaro_13ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[13]);
    }

    private void btAzulEscuro_6ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[6]);
    }

    private void btAzulEscuro_5ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[5]);
    }

    private void btAzulEscuro_4ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[4]);
    }

    private void btAzulClaro_7ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulEscuro[7]);
    }

    private void btVerde_10ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[10]);
    }

    private void btAmarelo_13ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[13]);
    }

    private void btLaranja_16ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[16]);
    }

    private void btVermelho_19ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[19]);
    }

    private void btVermelho_20ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[20]);
    }

    private void btLaranja_17ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[17]);
    }

    private void btAmarelo_14ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[14]);
    }

    private void btVerde_11ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[11]);
    }

    private void btAzulClaro_8ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[8]);
    }

    private void btAzulClaro_9ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[9]);
    }

    private void btAzulClaro_10ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[10]);
    }

    private void btAzulClaro_11ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[11]);
    }

    private void btAzulClaro_12ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAzulClaro[12]);
    }

    private void btVerde_19ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[19]);
    }

    private void btAmarelo_26ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[26]);
    }

    private void btLaranja_33ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[33]);
    }

    private void btVermelho_40ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[40]);
    }

    private void btVermelho_39ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[39]);
    }

    private void btLaranja_32ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[32]);
    }

    private void btAmarelo_25ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[25]);
    }

    private void btVerde_18ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[18]);
    }

    private void btVerde_17ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[17]);
    }

    private void btVerde_16ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[16]);
    }

    private void btVerde_15ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[15]);
    }

    private void btVerde_14ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[14]);
    }

    private void btVerde_13ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[13]);
    }

    private void btVerde_12ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVerdes[12]);
    }

    private void btAmarelo_15ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[15]);
    }

    private void btLaranja_18ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[18]);
    }

    private void btVermelho_21ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[21]);
    }

    private void btVermelho_22ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[22]);
    }

    private void btLaranja_19ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[19]);
    }

    private void btAmarelo_16ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[16]);
    }

    private void btAmarelo_17ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[17]);
    }

    private void btAmarelo_18ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[18]);
    }

    private void btAmarelo_19ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[19]);
    }

    private void btAmarelo_20ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[20]);
    }

    private void btAmarelo_21ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[21]);
    }

    private void btAmarelo_22ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[22]);
    }

    private void btAmarelo_23ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[23]);
    }

    private void btAmarelo_24ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesAmarelas[24]);
    }

    private void btLaranja_31ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[31]);
    }

    private void btVermelho_38ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[38]);
    }

    private void btVermelho_37ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[37]);
    }

    private void btLaranja_30ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[30]);
    }

    private void btLaranja_29ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[29]);
    }

    private void btLaranja_28ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[28]);
    }

    private void btLaranja_27ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[27]);
    }

    private void btLaranja_26ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[26]);
    }

    private void btLaranja_25ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[25]);
    }

    private void btLaranja_24ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[24]);
    }

    private void btLaranja_23ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[23]);
    }

    private void btLaranja_22ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[22]);
    }

    private void btLaranja_21ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[21]);
    }

    private void btLaranja_20ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesLaranja[20]);
    }

    private void btVermelho_23ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[23]);
    }

    private void btVermelho_24ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[24]);
    }

    private void btVermelho_25ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[25]);
    }

    private void btVermelho_26ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[26]);
    }

    private void btVermelho_27ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[27]);
    }

    private void btVermelho_28ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[28]);
    }

    private void btVermelho_29ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[29]);
    }

    private void btVermelho_30ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[30]);
    }

    private void btVermelho_31ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[31]);
    }

    private void btVermelho_32ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[32]);
    }

    private void btVermelho_33ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[33]);
    }

    private void btVermelho_34ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[34]);
    }

    private void btVermelho_35ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[35]);
    }

    private void btVermelho_36ActionPerformed(ActionEvent evt) {
        this.processa(this.posicoesVermelhas[36]);
    }

    public void defineFaixas() {
        this.botoesVermelhos[0] = this.btVermelho_0;
        this.botoesVermelhos[1] = this.btVermelho_1;
        this.botoesVermelhos[2] = this.btVermelho_2;
        this.botoesVermelhos[3] = this.btVermelho_3;
        this.botoesVermelhos[4] = this.btVermelho_4;
        this.botoesVermelhos[5] = this.btVermelho_5;
        this.botoesVermelhos[6] = this.btVermelho_6;
        this.botoesVermelhos[7] = this.btVermelho_7;
        this.botoesVermelhos[8] = this.btVermelho_8;
        this.botoesVermelhos[9] = this.btVermelho_9;
        this.botoesVermelhos[10] = this.btVermelho_10;
        this.botoesVermelhos[11] = this.btVermelho_11;
        this.botoesVermelhos[12] = this.btVermelho_12;
        this.botoesVermelhos[13] = this.btVermelho_13;
        this.botoesVermelhos[14] = this.btVermelho_14;
        this.botoesVermelhos[15] = this.btVermelho_15;
        this.botoesVermelhos[16] = this.btVermelho_16;
        this.botoesVermelhos[17] = this.btVermelho_17;
        this.botoesVermelhos[18] = this.btVermelho_18;
        this.botoesVermelhos[19] = this.btVermelho_19;
        this.botoesVermelhos[20] = this.btVermelho_20;
        this.botoesVermelhos[21] = this.btVermelho_21;
        this.botoesVermelhos[22] = this.btVermelho_22;
        this.botoesVermelhos[23] = this.btVermelho_23;
        this.botoesVermelhos[24] = this.btVermelho_24;
        this.botoesVermelhos[25] = this.btVermelho_25;
        this.botoesVermelhos[26] = this.btVermelho_26;
        this.botoesVermelhos[27] = this.btVermelho_27;
        this.botoesVermelhos[28] = this.btVermelho_28;
        this.botoesVermelhos[29] = this.btVermelho_29;
        this.botoesVermelhos[30] = this.btVermelho_30;
        this.botoesVermelhos[31] = this.btVermelho_31;
        this.botoesVermelhos[32] = this.btVermelho_32;
        this.botoesVermelhos[33] = this.btVermelho_33;
        this.botoesVermelhos[34] = this.btVermelho_34;
        this.botoesVermelhos[35] = this.btVermelho_35;
        this.botoesVermelhos[36] = this.btVermelho_36;
        this.botoesVermelhos[37] = this.btVermelho_37;
        this.botoesVermelhos[38] = this.btVermelho_38;
        this.botoesVermelhos[39] = this.btVermelho_39;
        this.botoesVermelhos[40] = this.btVermelho_40;
        this.botoesVermelhos[41] = this.btVermelho_41;
        this.botoesVermelhos[42] = this.btVermelho_42;
        this.botoesVermelhos[43] = this.btVermelho_43;
        this.botoesVermelhos[44] = this.btVermelho_44;
        this.botoesVermelhos[45] = this.btVermelho_45;
        this.botoesVermelhos[46] = this.btVermelho_46;
        this.botoesVermelhos[47] = this.btVermelho_47;
        this.botoesLaranja[0] = this.btLaranja_0;
        this.botoesLaranja[1] = this.btLaranja_1;
        this.botoesLaranja[2] = this.btLaranja_2;
        this.botoesLaranja[3] = this.btLaranja_3;
        this.botoesLaranja[4] = this.btLaranja_4;
        this.botoesLaranja[5] = this.btLaranja_5;
        this.botoesLaranja[6] = this.btLaranja_6;
        this.botoesLaranja[7] = this.btLaranja_7;
        this.botoesLaranja[8] = this.btLaranja_8;
        this.botoesLaranja[9] = this.btLaranja_9;
        this.botoesLaranja[10] = this.btLaranja_10;
        this.botoesLaranja[11] = this.btLaranja_11;
        this.botoesLaranja[12] = this.btLaranja_12;
        this.botoesLaranja[13] = this.btLaranja_13;
        this.botoesLaranja[14] = this.btLaranja_14;
        this.botoesLaranja[15] = this.btLaranja_15;
        this.botoesLaranja[16] = this.btLaranja_16;
        this.botoesLaranja[17] = this.btLaranja_17;
        this.botoesLaranja[18] = this.btLaranja_18;
        this.botoesLaranja[19] = this.btLaranja_19;
        this.botoesLaranja[20] = this.btLaranja_20;
        this.botoesLaranja[21] = this.btLaranja_21;
        this.botoesLaranja[22] = this.btLaranja_22;
        this.botoesLaranja[23] = this.btLaranja_23;
        this.botoesLaranja[24] = this.btLaranja_24;
        this.botoesLaranja[25] = this.btLaranja_25;
        this.botoesLaranja[26] = this.btLaranja_26;
        this.botoesLaranja[27] = this.btLaranja_27;
        this.botoesLaranja[28] = this.btLaranja_28;
        this.botoesLaranja[29] = this.btLaranja_29;
        this.botoesLaranja[30] = this.btLaranja_30;
        this.botoesLaranja[31] = this.btLaranja_31;
        this.botoesLaranja[32] = this.btLaranja_32;
        this.botoesLaranja[33] = this.btLaranja_33;
        this.botoesLaranja[34] = this.btLaranja_34;
        this.botoesLaranja[35] = this.btLaranja_35;
        this.botoesLaranja[36] = this.btLaranja_36;
        this.botoesLaranja[37] = this.btLaranja_37;
        this.botoesLaranja[38] = this.btLaranja_38;
        this.botoesLaranja[39] = this.btLaranja_39;
        this.botoesAmarelos[0] = this.btAmarelo_0;
        this.botoesAmarelos[1] = this.btAmarelo_1;
        this.botoesAmarelos[2] = this.btAmarelo_2;
        this.botoesAmarelos[3] = this.btAmarelo_3;
        this.botoesAmarelos[4] = this.btAmarelo_4;
        this.botoesAmarelos[5] = this.btAmarelo_5;
        this.botoesAmarelos[6] = this.btAmarelo_6;
        this.botoesAmarelos[7] = this.btAmarelo_7;
        this.botoesAmarelos[8] = this.btAmarelo_8;
        this.botoesAmarelos[9] = this.btAmarelo_9;
        this.botoesAmarelos[10] = this.btAmarelo_10;
        this.botoesAmarelos[11] = this.btAmarelo_11;
        this.botoesAmarelos[12] = this.btAmarelo_12;
        this.botoesAmarelos[13] = this.btAmarelo_13;
        this.botoesAmarelos[14] = this.btAmarelo_14;
        this.botoesAmarelos[15] = this.btAmarelo_15;
        this.botoesAmarelos[16] = this.btAmarelo_16;
        this.botoesAmarelos[17] = this.btAmarelo_17;
        this.botoesAmarelos[18] = this.btAmarelo_18;
        this.botoesAmarelos[19] = this.btAmarelo_19;
        this.botoesAmarelos[20] = this.btAmarelo_20;
        this.botoesAmarelos[21] = this.btAmarelo_21;
        this.botoesAmarelos[22] = this.btAmarelo_22;
        this.botoesAmarelos[23] = this.btAmarelo_23;
        this.botoesAmarelos[24] = this.btAmarelo_24;
        this.botoesAmarelos[25] = this.btAmarelo_25;
        this.botoesAmarelos[26] = this.btAmarelo_26;
        this.botoesAmarelos[27] = this.btAmarelo_27;
        this.botoesAmarelos[28] = this.btAmarelo_28;
        this.botoesAmarelos[29] = this.btAmarelo_29;
        this.botoesAmarelos[30] = this.btAmarelo_30;
        this.botoesAmarelos[31] = this.btAmarelo_31;
        this.botoesVerdes[0] = this.btVerde_0;
        this.botoesVerdes[1] = this.btVerde_1;
        this.botoesVerdes[2] = this.btVerde_2;
        this.botoesVerdes[3] = this.btVerde_3;
        this.botoesVerdes[4] = this.btVerde_4;
        this.botoesVerdes[5] = this.btVerde_5;
        this.botoesVerdes[6] = this.btVerde_6;
        this.botoesVerdes[7] = this.btVerde_7;
        this.botoesVerdes[8] = this.btVerde_8;
        this.botoesVerdes[9] = this.btVerde_9;
        this.botoesVerdes[10] = this.btVerde_10;
        this.botoesVerdes[11] = this.btVerde_11;
        this.botoesVerdes[12] = this.btVerde_12;
        this.botoesVerdes[13] = this.btVerde_13;
        this.botoesVerdes[14] = this.btVerde_14;
        this.botoesVerdes[15] = this.btVerde_15;
        this.botoesVerdes[16] = this.btVerde_16;
        this.botoesVerdes[17] = this.btVerde_17;
        this.botoesVerdes[18] = this.btVerde_18;
        this.botoesVerdes[19] = this.btVerde_19;
        this.botoesVerdes[20] = this.btVerde_20;
        this.botoesVerdes[21] = this.btVerde_21;
        this.botoesVerdes[22] = this.btVerde_22;
        this.botoesVerdes[23] = this.btVerde_23;
        this.botoesAzulClaro[0] = this.btAzulClaro_0;
        this.botoesAzulClaro[1] = this.btAzulClaro_1;
        this.botoesAzulClaro[2] = this.btAzulClaro_2;
        this.botoesAzulClaro[3] = this.btAzulClaro_3;
        this.botoesAzulClaro[4] = this.btAzulClaro_4;
        this.botoesAzulClaro[5] = this.btAzulClaro_5;
        this.botoesAzulClaro[6] = this.btAzulClaro_6;
        this.botoesAzulClaro[7] = this.btAzulClaro_7;
        this.botoesAzulClaro[8] = this.btAzulClaro_8;
        this.botoesAzulClaro[9] = this.btAzulClaro_9;
        this.botoesAzulClaro[10] = this.btAzulClaro_10;
        this.botoesAzulClaro[11] = this.btAzulClaro_11;
        this.botoesAzulClaro[12] = this.btAzulClaro_12;
        this.botoesAzulClaro[13] = this.btAzulClaro_13;
        this.botoesAzulClaro[14] = this.btAzulClaro_14;
        this.botoesAzulClaro[15] = this.btAzulClaro_15;
        this.botoesAzulEscuro[0] = this.btAzulEscuro_0;
        this.botoesAzulEscuro[1] = this.btAzulEscuro_1;
        this.botoesAzulEscuro[2] = this.btAzulEscuro_2;
        this.botoesAzulEscuro[3] = this.btAzulEscuro_3;
        this.botoesAzulEscuro[4] = this.btAzulEscuro_4;
        this.botoesAzulEscuro[5] = this.btAzulEscuro_5;
        this.botoesAzulEscuro[6] = this.btAzulEscuro_6;
        this.botoesAzulEscuro[7] = this.btAzulEscuro_7;
        this.botaoRoxo[0] = this.btRoxo_0;
    }

    public void inserePreta(JButton botao) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/imagens/peca_preta.png"));
        Image image = icon.getImage();
        image = image.getScaledInstance(image.getWidth(null) / 2, image.getHeight(null) / 2, 4);
        icon.setImage(image);
        botao.setIcon(icon);
    }

    public void insereBranca(JButton botao) {
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/imagens/peca_branca.png"));
        Image image = icon.getImage();
        image = image.getScaledInstance(image.getWidth(null) / 2, image.getHeight(null) / 2, 4);
        icon.setImage(image);
        botao.setIcon(icon);
    }

    public void atualizaTabuleiro(Faixa[] faixas) {
        Faixa faixaRoxa = faixas[0];
        Faixa faixaAzulEscuro = faixas[1];
        Faixa faixaAzulClaro = faixas[2];
        Faixa faixaVerde = faixas[3];
        Faixa faixaAmarela = faixas[4];
        Faixa faixaLaranja = faixas[5];
        Faixa faixaVermelha = faixas[6];
        Posicao[] posicoes = faixaVermelha.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesVermelhos[i]);
                } else {
                    this.insereBranca(this.botoesVermelhos[i]);
                }
            } else {
                this.botoesVermelhos[i].setIcon(null);
            }

            this.posicoesVermelhas[i] = posicoes[i];
        }

        posicoes = faixaLaranja.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesLaranja[i]);
                } else {
                    this.insereBranca(this.botoesLaranja[i]);
                }
            } else {
                this.botoesLaranja[i].setIcon(null);
            }

            this.posicoesLaranja[i] = posicoes[i];
        }

        posicoes = faixaAmarela.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesAmarelos[i]);
                } else {
                    this.insereBranca(this.botoesAmarelos[i]);
                }
            } else {
                this.botoesAmarelos[i].setIcon(null);
            }

            this.posicoesAmarelas[i] = posicoes[i];
        }

        posicoes = faixaVerde.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesVerdes[i]);
                } else {
                    this.insereBranca(this.botoesVerdes[i]);
                }
            } else {
                this.botoesVerdes[i].setIcon(null);
            }

            this.posicoesVerdes[i] = posicoes[i];
        }

        posicoes = faixaAzulClaro.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesAzulClaro[i]);
                } else {
                    this.insereBranca(this.botoesAzulClaro[i]);
                }
            } else {
                this.botoesAzulClaro[i].setIcon(null);
            }

            this.posicoesAzulClaro[i] = posicoes[i];
        }

        posicoes = faixaAzulEscuro.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botoesAzulEscuro[i]);
                } else {
                    this.insereBranca(this.botoesAzulEscuro[i]);
                }
            } else {
                this.botoesAzulEscuro[i].setIcon(null);
            }

            this.posicoesAzulEscuro[i] = posicoes[i];
        }

        posicoes = faixaRoxa.getPosicoes();

        for(int i = 0; i < posicoes.length; ++i) {
            if (posicoes[i].isOcupada()) {
                if (posicoes[i].getCor()) {
                    this.inserePreta(this.botaoRoxo[i]);
                } else {
                    this.insereBranca(this.botaoRoxo[i]);
                }
            } else {
                this.botaoRoxo[i].setIcon(null);
            }

            this.posicoesRoxas[i] = posicoes[i];
        }

    }

    private void processa(Posicao posicao) {
        if (posicao != this.posicaoOrigem) {
            if (!this.origemSelecionada) {
                this.posicaoOrigem = posicao;
                this.origemSelecionada = true;
            } else {
                this.posicaoDestino = posicao;
                this.jogo.movimentarPeca(this.posicaoOrigem, this.posicaoDestino);
                this.origemSelecionada = false;
            }
        }

    }

    public static void enableEditar(Container parent_des_e) {
        Component[] c = parent_des_e.getComponents();

        for(int j = 0; j < c.length; ++j) {
            if (c[j] instanceof JButton cmp) cmp.setEnabled(false);
        }

    }

    public void conectar() {
        this.jogo.conectar();
    }

    public void desconectar() {
        this.jogo.desconectar();
    }

    public void iniciarPartida() {
        this.jogo.iniciarPartida();
    }

    public void ajuda() {
        this.setPainel(this.jogo.ajuda());
    }

    public void abandonarPartida() {
        this.jogo.abandonarPartida();
    }

    public void realizarAcordo() {
        this.jogo.enviarJogada(TipoJogada.REALIZARACORDO);
    }

    public void setPainel(String mensagem) {
        this.painel.setText(mensagem);
    }
}

