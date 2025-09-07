package br.ufsc.inf.leobr.file;


import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class CifraUtil {
    public static PrivateKey getPrivateKeyFromFile(InputStream is, String alias, String password) throws Exception {
        KeyStore ks = KeyStore.getInstance("JKS");
        char[] pwd = password.toCharArray();
        ks.load(is, pwd);
        is.close();
        Key key = ks.getKey(alias, pwd);
        return key instanceof PrivateKey ? (PrivateKey)key : null;
    }

    public static byte[] cifrarDados(PrivateKey key, String texto) {
        try {
            Cipher c = Cipher.getInstance("RSA/ECB/NoPadding");
            c.init(1, key);
            byte[] txtCifrado = c.doFinal(texto.getBytes());
            return txtCifrado;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
