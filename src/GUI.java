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

public class GUI extends Application {

    private String text;
    private int delay;
    private int amount;
    private boolean running = false;

    public void start(Stage stage){
        BorderPane borderPane = new BorderPane();
        stage.setTitle("SpamBot");
        Button startButton = new Button("Start Spamming");
        Button stopButton = new Button("Stop Spamming");
        HBox hbox = new HBox();
        HBox spacing = new HBox();
        HBox buttons = new HBox();
        VBox delay = new VBox();
        VBox text = new VBox();
        VBox amount = new VBox();
        Image image = new Image("file:trollface.jpg");
        ImageView imageView = new ImageView(image);
        TextField delayTextField = new TextField();
        TextField textTextField = new TextField();
        TextField amountTextField = new TextField();
        hbox.setSpacing(190);
        hbox.getChildren().addAll(new Label("Text"),new Label("Amount"),new Label("Delay"));
        spacing.getChildren().addAll(text, amount, delay);
        spacing.setSpacing(25);
        buttons.getChildren().add(startButton);
        imageView.setFitHeight(500);
        imageView.setFitWidth(500);
        delay.getChildren().addAll(delayTextField, startButton);
        text.getChildren().addAll(textTextField, stopButton);
        amount.getChildren().add(amountTextField);
        borderPane.setCenter(hbox);
        borderPane.setBottom(spacing);
        borderPane.setTop(imageView);

        Scene scene = new Scene(borderPane);
        stage.setScene(scene);
        stage.show();

        startButton.setOnAction(event -> {
            this.text = textTextField.getText();
            this.amount = Integer.parseInt(amountTextField.getText());
            this.delay = Integer.parseInt(delayTextField.getText());
            running = true;
            System.out.println("startbutton");
        });
        stopButton.setOnAction(event -> { running = false;
            System.out.println("stopbutton"); });
    }

    public void startGui() {
        launch(GUI.class);
    }
    public String getText() {
        return text;
    }

    public int getDelay() {
        return delay;
    }

    public int getAmount() {
        return amount;
    }

    public boolean getRunnig(){
        return running;
    }

}
