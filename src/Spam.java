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
    private int delay;
    private GUI gui = new GUI();
    private boolean running = true;

    public Spam(){
    }

    public void start() {
        gui.startGui();
        while (true) {
            this.running = gui.getRunnig();
            if (running) {
                amount = gui.getAmount();
                text = gui.getText();
                delay = gui.getDelay();
                running = gui.getRunnig();
                //spam();
            }
        }
    }

    public void newestSpam(int givenAmount, int givenDelay, String givenText) {
        try {
            r = new Robot();
            stringToCharacterlist(givenText);
            System.out.println(word);

            for (int k = 0; k < givenAmount + 1; k++) {
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
                        case '/':
                            r.keyPress(KeyEvent.VK_SLASH);
                            break;
                        case '@':
                            r.keyPress(KeyEvent.VK_AT);
                            break;
                        case '_':
                            r.keyPress(KeyEvent.VK_UNDERSCORE);
                            break;
                        case '(':
                            r.keyPress(KeyEvent.VK_OPEN_BRACKET);
                            break;
                        case ')':
                            r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                            break;
                        case '+':
                            r.keyPress(KeyEvent.VK_EQUALS);
                            break;
                        case '#':
                            r.keyPress(KeyEvent.VK_NUMBER_SIGN);
                            break;

                    }
                }
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(givenDelay);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void SingleSend(String singleText, int givendelay) {
        try {
            r = new Robot();
            stringToCharacterlist(singleText);
            System.out.println(word);

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
                    case '/':
                        r.keyPress(KeyEvent.VK_SLASH);
                        break;
                    case '@':
                        r.keyPress(KeyEvent.VK_AT);
                        break;
                    case '_':
                        r.keyPress(KeyEvent.VK_UNDERSCORE);
                        break;
                    case '(':
                        r.keyPress(KeyEvent.VK_OPEN_BRACKET);
                        break;
                    case ')':
                        r.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                        break;
                    case '+':
                        r.keyPress(KeyEvent.VK_EQUALS);
                        break;
                    case '#':
                        r.keyPress(KeyEvent.VK_NUMBER_SIGN);
                        break;
                }
            }
            r.keyPress(KeyEvent.VK_ENTER);
            r.delay(givendelay);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void stringToCharacterlist(String input) {
        word.clear();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char character = input.charAt(i);
            word.add(character);
        }

    }

    public void tableflip(int givenAmount, int givenDelay) {
        try {
            r = new Robot();
            for (int i = 0; i < givenAmount + 1; i++) {
                SingleSend("/tableflip", givenDelay);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                SingleSend("/unflip", givenDelay);
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}