import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXFrame extends Application {
	public static void main(String[] args) {
		launch(args);
	}
@Override
public void start(Stage primaryStage) throws Exception {
	Button btn = new Button("Click Me!");
	StackPane root = new StackPane();
	root.setAlignment(Pos.TOP_CENTER);
	root.getChildren().add(btn);
	Scene scene = new Scene(root,300,300);
	primaryStage.setTitle("JavaFX Frame");
	primaryStage.setScene(scene);
	primaryStage.show();
}

}
