import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
    @author : Rik van Laerhoven
 */
public class GUI extends Application {

    private String textToPrint;
    private int delayToPrint;
    private int amountToPrint;
    private boolean running = false;
    private Spam spam;

    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();
        stage.setTitle("SpamBot");
        Button startButton = new Button("Start Spamming");
        Button stopButton = new Button("Stop Program");
        Button tableFlipButton = new Button("Tableflip");
        Button serieSpam = new Button("Spam + 1");
        Button quotes = new Button("Quotes");
        HBox hbox = new HBox();
        HBox spacing = new HBox();
        HBox buttons = new HBox();
        VBox delay = new VBox();
        VBox text = new VBox();
        VBox amount = new VBox();
        Image imageTrollface = new Image("file:trollface.jpg");
        Image imageUglyFace = new Image("file:WhatsApp Image 2019-02-02 at 02.15.26.jpeg");
        ImageView imageView = new ImageView(imageTrollface); //hier kan de foto veranderd worden.
        TextField delayTextField = new TextField("1500");
        TextField textTextField = new TextField();
        TextField amountTextField = new TextField("100");
        hbox.setSpacing(190);
        hbox.getChildren().addAll(new Label("Text"),new Label("Amount"),new Label("Delay"));
        spacing.getChildren().addAll(text, amount, delay);
        spacing.setSpacing(25);
        buttons.getChildren().add(startButton);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        delay.getChildren().addAll(delayTextField, tableFlipButton, startButton);
        text.getChildren().addAll(textTextField, stopButton);
        amount.getChildren().addAll(amountTextField, serieSpam, quotes);
        borderPane.setCenter(hbox);
        borderPane.setBottom(spacing);
        borderPane.setTop(imageView);

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();

        startButton.setOnAction(event -> {
            running = true;
            //while (running) {
                this.textToPrint = textTextField.getText();
                this.amountToPrint = Integer.parseInt(amountTextField.getText());
                this.delayToPrint = Integer.parseInt(delayTextField.getText());
                spam = new Spam();
                spam.newestSpam(amountToPrint, delayToPrint, textToPrint);
                System.out.println("startbutton");
           // }
        });

        stopButton.setOnAction(event -> { running = false;
            System.out.println("stopbutton");
        });

        tableFlipButton.setOnAction(event -> {
            running = true;
            this.amountToPrint = Integer.parseInt(amountTextField.getText());
            this.delayToPrint = Integer.parseInt(delayTextField.getText());
            spam = new Spam();
            spam.tableflip(amountToPrint,delayToPrint);
        });
        serieSpam.setOnAction(event -> {
            running = true;
            //while (running) {
            this.amountToPrint = Integer.parseInt(amountTextField.getText());
            this.delayToPrint = Integer.parseInt(delayTextField.getText());
            spam = new Spam();
//            spam.singleSend("even mijn spambot in de betatest");
            spam.spamCounter(amountToPrint,delayToPrint);

            System.out.println("startbutton");
            // }
        });
        quotes.setOnAction(event -> {
            this.delayToPrint = Integer.parseInt(delayTextField.getText());
            spam = new Spam();
            spam.masterQuotes(delayToPrint);
        });
    }

    public void startGui() {
        launch(GUI.class);
    }

    public String getText() {
        return textToPrint;
    }

    public int getDelay() {
        return delayToPrint;
    }

    public int getAmount() {
        return amountToPrint;
    }

    public boolean getRunnig(){
        return running;
    }

}
