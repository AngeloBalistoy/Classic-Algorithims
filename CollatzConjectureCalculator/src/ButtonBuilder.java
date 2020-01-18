import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * Due to how complicated the button making process is for this project, this class contains all things related to
 * Buttons in any scene.
 */
public class ButtonBuilder {
    public ButtonBuilder() {

    }

    /**
     * Formats the buttons
     * @param button The buttons to be formatted
     */
    //Subject to change
    private static void format(Button button) {
        button.setMinHeight(50.0);
        button.setMinWidth(500.0);
    }
    public Button[] getOpeningButtons() {

        Button btn1 = new Button();
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                SceneBuilder.changeScene(1);
            }
        });
        Button btn3 = new Button();
        Button btn2 = new Button();
        btn1.setText("What is the Collatz Conjecture?");
        btn2.setText("Calculate the number of steps for a certain number?");
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                SceneBuilder.changeScene(2);
            }
        });
        btn3.setText("What is the worst number for Collatz Conjecture in a given range?");
        Button[] openingButtons = {
                btn1,
                btn2,
                btn3
        };
        for(Button x : openingButtons) {
            ButtonBuilder.format(x);
        }
        return openingButtons;
    }

    public Button[] getExplanationButtons() {
        Button btn1 = new Button();
        Button btn3 = new Button();
        Button btn2 = new Button();
        btn1.setText("Return to the main menu");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                SceneBuilder.changeScene(0);
            }
        });
        btn2.setText("Calculate the number of steps for a certain number?");
        btn3.setText("What is the worst number for Collatz Conjecture in a given range?");
        Button[] explanationButtons = {
                btn1,
                btn2,
                btn3
        };
        for(Button x : explanationButtons) {
            ButtonBuilder.format(x);
        }
        return explanationButtons;
    }
}
