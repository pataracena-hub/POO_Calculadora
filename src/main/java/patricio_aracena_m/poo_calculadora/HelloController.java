package patricio_aracena_m.poo_calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    //atributos de la clase
    @FXML
    private TextField firstNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private Label resultText;

    //setters y getters
    public TextField getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(TextField firstNumber) {
        this.firstNumber = firstNumber;
    }

    public TextField getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(TextField secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Label getResultText() {
        return resultText;
    }

    public void setResultText(Label resultText) {
        this.resultText = resultText;
    }

    //Metodos de la Calculadora



}