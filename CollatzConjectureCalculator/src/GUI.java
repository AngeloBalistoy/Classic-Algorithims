import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class GUI extends Application{
    /**
     * Starts the app
     * @param primaryStage The primary stage
     */
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        SceneBuilder build = new SceneBuilder(root);
        Stage window = primaryStage;

        window.setTitle("Collatz Conjecture");
        window.setScene(build.openingScene());
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
