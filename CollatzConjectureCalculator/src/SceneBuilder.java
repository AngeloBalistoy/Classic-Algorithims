import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * The SceneConstructor constructs a scene for a given stage. It takes in a root pane in order create a scene.
 *
 */
public class SceneBuilder {
    /**
     * The window height.
     */
    private static final int WINDOW_WIDTH = 800;
    /**
     * The window width.
     */
    private static final int WINDOW_HEIGHT = 600;
    /**
     * The root to be edited.
     */
    private Pane root;

    private Stage stage;

    /**
     * Constructs a SceneConstructor
     * @param root The starting root/parent node.
     */
    public SceneBuilder(Pane root, Stage stage) {
        this.root = root;
        this.stage = stage;
    }



    /**
     * Builds the opening scene allowing the user to travel to other scenes.
     * @return The opening scene
     */
    public Scene openingScene() {
        GUIPanes panes = new GUIPanes();
        BorderPane openingPane = panes.getOpeningPane();
        Scene openingScene = new Scene(openingPane, WINDOW_WIDTH,WINDOW_HEIGHT);
        return openingScene;
    }



    public BorderPane getExplanationPane() {
        BorderPane explanationPane = new BorderPane();
        return explanationPane;
    }

    public static void changeScene(int number) {
        GUIPanes panes = new GUIPanes();
        if (number == 0) {
            GUI.getStage().setScene(new Scene(panes.getOpeningPane(),WINDOW_WIDTH,WINDOW_HEIGHT));
        }
        else if (number == 1) {
            GUI.getStage().setScene(new Scene(panes.getExplanationPane(),WINDOW_WIDTH,WINDOW_HEIGHT));
        }
        GUI.getStage().show();
    }

    public static int getWindowWidth() {
        return WINDOW_WIDTH;
    }

    public static int getWindowHeight() {
        return WINDOW_HEIGHT;
    }
}
