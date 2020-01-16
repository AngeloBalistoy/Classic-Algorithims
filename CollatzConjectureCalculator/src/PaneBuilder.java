import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * This class builds panes for for the scene we are using.
 */
public class PaneBuilder {
    /**
     * Gets the explanation of the Collatz Conjecture.
     * @return The explanation of the Collatz Conjecture.
     */
    private Text getExplanation() {
        Text explanation = new Text("Collatz Conjecture: Start with a number n > 1. Find the number of steps it takes" +
                " to reach one using the following process: If n is even, divide it by 2.\nIf n is odd, multiply it " +
                "by 3 and add 1.");
        Font font = new Font(25);
        explanation.setFont(font);
        explanation.setTextAlignment(TextAlignment.CENTER);
        explanation.setFill(Color.BLACK);
        return explanation;
    }
    /**
     * Gets the greeting. Used for the opening Scene.
     * @return A greeting that has been formatted.
     */
    private Text getGreeting() {
        Text greeting = new Text("Hello!\nThis script is related to all things Collatz Conjecture I am bothered to " +
                "think about. Please select an option below.");
        Font font = new Font(25);
        greeting.setFont(font);
        greeting.setTextAlignment(TextAlignment.CENTER);
        greeting.setFill(Color.BLACK);
        return greeting;
    }

    /**
     * Builds and returns the opening pane.
     * @return The Opening Pane.
     */
    public BorderPane getOpeningPane() {
        //Setup all objects needed
        Text greeting = getGreeting();
        BorderPane openingPane = new BorderPane();
        ButtonBuilder btnBuilder = new ButtonBuilder();
        //Add and format the top hbox
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(greeting);
        openingPane.setTop(hbox);
        //Set up center
        VBox vbox = new VBox();
        Button[] buttons = btnBuilder.getOpeningButtons();
        for (Button x : buttons) {
            vbox.getChildren().add(x);
        }
        vbox.setAlignment(Pos.CENTER);
        openingPane.setCenter(vbox);
        greeting.wrappingWidthProperty().bind(openingPane.widthProperty().subtract(10));
        return openingPane;
    }

    public BorderPane getExplanationPane() {
        //Setup all objects needed
        Text explanation = getExplanation();
        BorderPane explanationPane = new BorderPane();
        ButtonBuilder btnBuilder = new ButtonBuilder();
        //Add and format the top hbox
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(explanation);
        explanationPane.setTop(hbox);
        //Set up center
        VBox vbox = new VBox();
        Button[] buttons = btnBuilder.getExplanationButtons();
        for (Button x : buttons) {
            vbox.getChildren().add(x);
        }
        vbox.setAlignment(Pos.CENTER);
        explanationPane.setCenter(vbox);
        explanation.wrappingWidthProperty().bind(explanationPane.widthProperty().subtract(10));
        return explanationPane;
    }
}
