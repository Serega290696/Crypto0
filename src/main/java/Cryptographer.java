/**
 * Created by Serega on 04.06.2015.
 */
public class Cryptographer implements ICryptographer {



    public String encrypt(String text, String key) {
        StringBuilder encryptText = new StringBuilder();
        encryptText = new StringBuilder(text).append("_AAA!"+key);
        System.out.println("\t\ttext to encrypt: " + text);
        System.out.println("\t\tkey: " + key);
        System.out.println("\t\tencrypted text: " + encryptText);


        return encryptText.toString();
    }



    public String decrypt(String text, String key) {
        StringBuilder decryptText = new StringBuilder();



        return decryptText.toString();
    }



}
