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
    public void initialize() {

        Choicebox1.getItems().addAll("class", "static", "public");
        Choicebox2.getItems().addAll("String[]", "int[]", "double[]");
        Choicebox3.getItems().addAll("System", "Scanner", "Main");

        Choicebox1.setValue("class");
        Choicebox2.setValue("String[]");
        Choicebox3.setValue("System");
    }

    @FXML
    private void submitAnswer() {

        boolean correct =
                Choicebox1.getValue().equals("class") &&
                Choicebox2.getValue().equals("String[]") &&
                Choicebox3.getValue().equals("System");

        if (correct) {
            result.setText("Correct!");
        } else {
            result.setText("Wrong Answer!");
        }
    }
}