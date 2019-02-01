import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


/**
 * @author : Rik van Laerhoven
 * site keycodes:  https://stackoverflow.com/questions/15313469/java-keyboard-keycodes-list
 */

public class Spam {
    private int amount;
    private String text;
    private ArrayList<Character> word = new ArrayList<>();
    private Robot r;

    public Spam(int amount, String text) {
        this.amount = amount;
        this.text = text;
    }

    public void Spam() {
        try {
            r = new Robot();
            StringToCharacterlist(text);
            System.out.println(word);

            for (int k = 0; k < amount; k++) {
                for (int i = 0; i < word.size(); i++) {
                    char character = word.get(i);

                    switch (character) {
                        case 'a':
                            r.keyPress(KeyEvent.VK_A);
                            break;
                        case 'b':
                            r.keyPress(KeyEvent.VK_B);
                            break;
                        case 'c':
                            r.keyPress(KeyEvent.VK_C);
                            break;
                        case 'd':
                            r.keyPress(KeyEvent.VK_D);
                            break;
                        case 'e':
                            r.keyPress(KeyEvent.VK_E);
                            break;
                        case 'f':
                            r.keyPress(KeyEvent.VK_F);
                            break;
                        case 'g':
                            r.keyPress(KeyEvent.VK_G);
                            break;
                        case 'h':
                            r.keyPress(KeyEvent.VK_H);
                            break;
                        case 'i':
                            r.keyPress(KeyEvent.VK_I);
                            break;
                        case 'j':
                            r.keyPress(KeyEvent.VK_J);
                            break;
                        case 'k':
                            r.keyPress(KeyEvent.VK_K);
                            break;
                        case 'l':
                            r.keyPress(KeyEvent.VK_L);
                            break;
                        case 'm':
                            r.keyPress(KeyEvent.VK_M);
                            break;
                        case 'n':
                            r.keyPress(KeyEvent.VK_N);
                            break;
                        case 'o':
                            r.keyPress(KeyEvent.VK_O);
                            break;
                        case 'p':
                            r.keyPress(KeyEvent.VK_P);
                            break;
                        case 'q':
                            r.keyPress(KeyEvent.VK_Q);
                            break;
                        case 'r':
                            r.keyPress(KeyEvent.VK_R);
                            break;
                        case 's':
                            r.keyPress(KeyEvent.VK_S);
                            break;
                        case 't':
                            r.keyPress(KeyEvent.VK_T);
                            break;
                        case 'u':
                            r.keyPress(KeyEvent.VK_U);
                            break;
                        case 'v':
                            r.keyPress(KeyEvent.VK_V);
                            break;
                        case 'w':
                            r.keyPress(KeyEvent.VK_W);
                            break;
                        case 'x':
                            r.keyPress(KeyEvent.VK_X);
                            break;
                        case 'y':
                            r.keyPress(KeyEvent.VK_Y);
                            break;
                        case 'z':
                            r.keyPress(KeyEvent.VK_Z);
                            break;
                        case ' ':
                            r.keyPress(KeyEvent.VK_SPACE);
                            break;
                    }
                }
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }



    public void OldLoopSpam() {
        try {
            r = new Robot();
            for (int i = 0; i < 100; i++) {
                System.out.println(1);
                r.keyPress(KeyEvent.VK_S);
                r.keyPress(KeyEvent.VK_P);
                r.keyPress(KeyEvent.VK_A);
                r.keyPress(KeyEvent.VK_M);
                r.keyPress(KeyEvent.VK_SPACE);
                r.keyPress(KeyEvent.VK_T);
                r.keyPress(KeyEvent.VK_E);
                r.keyPress(KeyEvent.VK_S);
                r.keyPress(KeyEvent.VK_T);
                r.keyPress(KeyEvent.VK_SPACE);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void StringToCharacterlist(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char character = input.charAt(i);
            word.add(character);
        }

    }
}
