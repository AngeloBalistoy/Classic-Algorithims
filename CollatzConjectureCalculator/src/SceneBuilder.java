import javafx.scene.Scene;
import javafx.scene.layout.*;

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

    /**
     * Constructs a SceneConstructor
     * @param root The starting root/parent node.
     */
    public SceneBuilder(Pane root) {
        this.root = root;
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



    private BorderPane getExplanationPane() {
        BorderPane explanationPane = new BorderPane();
        return explanationPane;
    }
}
