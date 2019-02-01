import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.awt.event.KeyEvent;
/**
 * @author : Rik van Laerhoven
 */
public class Main {

    public static void main(String[] args) {
        // amount is het aantal keer dat de text gestuurd wordt, text is de text die gestuurd moet worden.
        Spam spam = new Spam(100,1000,"fun");
        spam.start();
    }
}
