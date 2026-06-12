import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ChoiceBox<String> Choicebox1;

    @FXML
    private ChoiceBox<String> Choicebox2;

    @FXML
    private ChoiceBox<String> Choicebox3;

    @FXML
    private Button button_submit;

    @FXML
    private Label minip;

    @FXML
    private Label result;

    @FXML
    private Label timmer;

    @FXML
     void initialize() {
        Choicebox1.setValue("Select");
        Choicebox2.setValue("Select");
        Choicebox3.setValue("Select");

        Choicebox1.getItems().addAll("class", "static", "public");
        Choicebox2.getItems().addAll("String[]", "int[]", "double[]");
        Choicebox3.getItems().addAll("System", "Scanner", "Main");

    }

    @FXML
     void submitAnswer(ActionEvent event) {

    String answer_1 = Choicebox1.getValue();
    String answer_2 = Choicebox2.getValue();
    String answer_3 = Choicebox3.getValue();

    Integer score = 0;

    if (answer_1 == "class") {
        score += 1;
    }

    if (answer_2 == "String[]") {
        score += 1;
    }

    if (answer_3 == "System") {
        score += 1;
    }

    result.setText("Your score is " + score.toString());

}
}