package br.ufsc.inf.leobr.cliente.util;

import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class CifraUtil {

    public static PublicKey getPublicKeyFromFile(InputStream is) throws Exception {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate cert = (X509Certificate) cf.generateCertificate(is);
        return cert.getPublicKey();
    }

    public static byte[] decifrarDados(PublicKey key, byte[] txt) {
        try {
            Cipher c = Cipher.getInstance("RSA/ECB/NoPadding");
            c.init(Cipher.DECRYPT_MODE, key);
            return c.doFinal(txt);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException |
                 InvalidKeyException | IllegalBlockSizeException |
                 BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
