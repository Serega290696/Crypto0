/**
 * Created by Serega on 04.06.2015.
 */
public interface ICryptographer {

    public String encrypt(String text, String key);
    public String decrypt(String text, String key);

}
