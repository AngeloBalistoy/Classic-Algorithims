import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
//#TODO MOVE SceneBuilder.changeScene() here!!!
public class GUI extends Application{
    private static Stage stage;
    /**
     * Starts the app
     * @param primaryStage The primary stage
     */
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        stage = primaryStage;
        SceneBuilder build = new SceneBuilder(root,stage);
        Scene currentScene = build.openingScene();
        stage.setTitle("Collatz Conjecture");
        stage.setScene(currentScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        stage = stage;
    }
}
