import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override   
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("View.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("QCM Exam");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("Logo-GTRSC-png.png")));
        stage.show();
    }

    
}
