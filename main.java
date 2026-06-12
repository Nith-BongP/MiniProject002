import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override   
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("QCM Exam");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("Logo-GTRSC-png.png")));
        stage.show();
    }
}