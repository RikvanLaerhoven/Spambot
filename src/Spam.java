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

    public Spam() {
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
                            r.keyPress(0x0201);//WERKT NIET, AAAAAAAAAAAAAAAAHHH
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
                        case '1':
                            r.keyPress(KeyEvent.VK_1);
                            break;
                        case '2':
                            r.keyPress(KeyEvent.VK_2);
                            break;
                        case '3':
                            r.keyPress(KeyEvent.VK_3);
                            break;
                        case '4':
                            r.keyPress(KeyEvent.VK_4);
                            break;
                        case '5':
                            r.keyPress(KeyEvent.VK_5);
                            break;
                        case '6':
                            r.keyPress(KeyEvent.VK_6);
                            break;
                        case '7':
                            r.keyPress(KeyEvent.VK_7);
                            break;
                        case '8':
                            r.keyPress(KeyEvent.VK_8);
                            break;
                        case '9':
                            r.keyPress(KeyEvent.VK_9);
                            break;
                        case '0':
                            r.keyPress(KeyEvent.VK_0);
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

    public void singleSend(String singleText) {
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
                    case '-':
                        r.keyPress(KeyEvent.VK_MINUS);
                        break;
                    case '#':
                        r.keyPress(KeyEvent.VK_NUMBER_SIGN);
                        break;
                    case ',':
                        r.keyPress(KeyEvent.VK_COMMA);
                        break;
                    case '1':
                        r.keyPress(KeyEvent.VK_1);
                        break;
                    case '2':
                        r.keyPress(KeyEvent.VK_2);
                        break;
                    case '3':
                        r.keyPress(KeyEvent.VK_3);
                        break;
                    case '4':
                        r.keyPress(KeyEvent.VK_4);
                        break;
                    case '5':
                        r.keyPress(KeyEvent.VK_5);
                        break;
                    case '6':
                        r.keyPress(KeyEvent.VK_6);
                        break;
                    case '7':
                        r.keyPress(KeyEvent.VK_7);
                        break;
                    case '8':
                        r.keyPress(KeyEvent.VK_8);
                        break;
                    case '9':
                        r.keyPress(KeyEvent.VK_9);
                        break;
                    case '0':
                        r.keyPress(KeyEvent.VK_0);
                        break;
                }
            }
            r.keyPress(KeyEvent.VK_ENTER);
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
                singleSend("/tableflip");
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(givenDelay);
                singleSend("/unflip");
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(givenDelay);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public void masterQuotes(int givendelay){

        try {
            r = new Robot();
            for (int i = 0; i < 25; i++){
                switch (i){
                    case 1:
                        singleSend("dus jasper heeft et ook hardop aanstaan in dora de xplora - locosam");
                        break;
                    case 2:
                        singleSend("er klopt professioneel geen kut meer van - rocketmannnnnnn");
                        break;
                    case 3:
                        singleSend("the squad needs you soldier - the senate");
                    case 4:
                        singleSend("sommige hebben een wasmachine en een magnetron in een, andere een tv en een router - rocketmannnnnnn");
                        break;
                    case 6:
                        singleSend("als je panja van de ranja bent -wessel");
                        break;
                    case 7:
                        singleSend("werkt een for niet gebruik een while, werkt een for wel gebruik dan nogsteeds een while. -java 101 met tech support ties");
                        break;
                    case 8:
                        singleSend("arie is een goeie naam voor een array - jeroen en jasper");
                        break;
                    case 9:
                        singleSend("if the problem can't be solved, delete it! -daphne");
                        break;
                    case 10:
                        singleSend("ik heb de grootste - jasper");
                        break;
                    case 11:
                        singleSend("klinkt interessant, gaan we niet doen -the rikkert");
                        break;
                    case 12:
                        singleSend("alles ge-automatiseerd, zelfs mn relatie - jasper");
                        break;
                    case 13:
                        singleSend("volgens mij heeft mijn lichaam nog steeds niet 100% door dat als ik wat drink het gat naar mijn longen dicht moet - luc");
                        break;
                    case 14:
                        singleSend("no stress bierfles - smartie");
                        break;
                    case 15:
                        singleSend("weet je hoeveel moeite ik nu moet gaan doen om iemand te verkrachten - rocketmannnnnnn");
                        break;
                    case 16:
                        singleSend("hier een oogbal daar een voetje, hé is dat nou je buurvrouws hoedje? - onkel adolf");
                        break;
                    case 17:
                        singleSend("priempie?! - the senate  de autiest");
                        break;
                    case 18:
                        singleSend("forget a relationship i cant even hold a conversation - cinque");
                        break;
                    case 19:
                        singleSend("schoonheid zit aan de binnekant, vooral bij lelijke mensen - mart-jan & onkel adolf");
                        break;
                    case 20:
                        singleSend("p&oshit - Jeroen");
                        break;
                    case 21:
                        singleSend("als ge ut niet meer wit, pur of kit - beunhaas");
                        break;
                    case 22:
                        singleSend("ze hebben pas door dat je een alcoholist bent als je nuchter thuis komt - cinque");
                        break;
                    case 23:
                        singleSend("dat is allemaal heel blij - pieter kop jansen");
                        break;
                    case 24:
                        singleSend("isoleren,programmeren,autistiseren - stalin for president");
                        break;
                    case 25:
                        singleSend("nee stop met donaten - daphne");
                        break;
                    case 26:
                        singleSend("life is like a box of chocolats - forest gump");
                        break;
                    case 27:
                        singleSend("");
                        break;
                    case 28:
                        singleSend("");
                        break;
                    case 29:
                        singleSend("");
                        break;
                    case 30:
                        singleSend("");
                        break;
                }
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(givendelay);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void spamCounter(int amountToPrint, int delay) {
        try {
            r = new Robot();
            for (int i = 0; i < amountToPrint; i++) {
                int character =  i;

                switch (character) {
                    case 0:
                        r.keyPress(KeyEvent.VK_0);
                        break;
                    case 1:
                        r.keyPress(KeyEvent.VK_1);
                        break;
                    case 2:
                        r.keyPress(KeyEvent.VK_2);
                        break;
                    case 3:
                        r.keyPress(KeyEvent.VK_3);
                        break;
                    case 4:
                        r.keyPress(KeyEvent.VK_4);
                        break;
                    case 5:
                        r.keyPress(KeyEvent.VK_5);
                        break;
                    case 6:
                        r.keyPress(KeyEvent.VK_6);
                        break;
                    case 7:
                        r.keyPress(KeyEvent.VK_7);
                        break;
                    case 8:
                        r.keyPress(KeyEvent.VK_8);
                        break;
                    case 9:
                        r.keyPress(KeyEvent.VK_9);
                        break;
                    case 10:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_0);
                        break;
                    case 11:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_1);
                        break;
                    case 12:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_2);
                        break;
                    case 13:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_3);
                        break;
                    case 14:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_4);
                        break;
                    case 15:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_5);
                        break;
                    case 16:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_6);
                        break;
                    case 17:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_7);
                        break;
                    case 18:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_8);
                        break;
                    case 19:
                        r.keyPress(KeyEvent.VK_1);
                        r.keyPress(KeyEvent.VK_9);
                        break;
                    case 20:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_0);
                        break;
                    case 21:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_1);
                        break;
                    case 22:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_2);
                        break;
                    case 23:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_3);
                        break;
                    case 24:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_4);
                        break;
                    case 25:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_5);
                        break;
                    case 26:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_6);
                        break;
                    case 27:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_7);
                        break;
                    case 28:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_8);
                        break;
                    case 29:
                        r.keyPress(KeyEvent.VK_2);
                        r.keyPress(KeyEvent.VK_9);
                        break;
                    case 30:
                        r.keyPress(KeyEvent.VK_3);
                        r.keyPress(KeyEvent.VK_0);
                        break;
                    case 31:
                        r.keyPress(KeyEvent.VK_3);
                        r.keyPress(KeyEvent.VK_1);
                        break;
                    case 32:
                        r.keyPress(KeyEvent.VK_3);
                        r.keyPress(KeyEvent.VK_2);
                        break;
                    case 33:
                        r.keyPress(KeyEvent.VK_3);
                        r.keyPress(KeyEvent.VK_3);
                        i = 0;
                        break;

                }
                r.keyPress(KeyEvent.VK_ENTER);
                r.keyPress(KeyEvent.VK_ENTER);
                r.delay(delay);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}