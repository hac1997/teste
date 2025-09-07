package br.ufsc.inf.leobr.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;

public class Gerador {
    int MIN = 500;
    int MAX = 999999999;
    private File arquivo;
    private FileWriter fw;
    private InputStream certificado;
    private String alias = "jogos";
    private String pwd = "jogomp";
    private static final String NOME_ARQUIVO = "jogoMultiPlayer.properties";

    public static void main(String[] args) {
        br.ufsc.inf.leobr.file.Gerador gerador = new br.ufsc.inf.leobr.file.Gerador();
        gerador.gera();
    }

    public void gera() {
        int idJogo = this.random();
        this.carregarCertificado();
        String jogo = "idJogo=" + idJogo;
        this.arquivo = new File("jogoMultiPlayer.properties");
        this.arquivo.exists();

        try {
            this.arquivo.createNewFile();
            PrivateKey privateKey = br.ufsc.inf.leobr.file.CifraUtil.getPrivateKeyFromFile(this.certificado, this.alias, this.pwd);
            byte[] textoCifrado = CifraUtil.cifrarDados(privateKey, jogo);
            writeContentsFromBytes(this.arquivo, textoCifrado, true);
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    public static void writeContentsFromBytes(File f, byte[] contents, boolean overwrite) throws IOException {
        if (!f.exists() || f.exists() && overwrite) {
            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(contents);
            bos.close();
            fos.close();
        }

    }

    private void carregarCertificado() {
        this.certificado = this.getClass().getClassLoader().getResourceAsStream("cert.jks");
    }

    private int random() {
        return this.MIN + (int)(Math.random() * (double)(this.MAX - this.MIN + 1));
    }
}
