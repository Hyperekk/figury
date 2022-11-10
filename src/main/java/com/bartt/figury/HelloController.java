package com.bartt.figury;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField txt2;
    public TextField txt3;
    public Button btn2;
    public Button btn3;
    public TextField txt4;
    public TextField txt5;
    public Button btn5;
    public Button btn4;
    public TextField txt6;
    public TextField txt7;
    public TextField txt8;
    public TextField txt9;
    public TextField txt10;
    public TextField txt1;
    public Button btn1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void countPr(ActionEvent actionEvent)
    {
        Double c;
        Double b;
        try {
            c = Double.parseDouble(txt1.getText());
            b = Double.parseDouble(txt1.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double kwadrat = c*b;
    }

    public void countRob(ActionEvent actionEvent)
    {

    }

    public void countRo(ActionEvent actionEvent)
    {

    }

    public void countTr(ActionEvent actionEvent)
    {

    }

    public void countKt(ActionEvent actionEvent)
    {
        Double a;
        try {
            a = Double.parseDouble(txt1.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double kwadrat = a*a;

    }
}