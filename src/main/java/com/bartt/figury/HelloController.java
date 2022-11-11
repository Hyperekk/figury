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
            c = Double.parseDouble(txt2.getText());
            b = Double.parseDouble(txt3.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double prostokat = c*b;
        Double prostokat1 = 2*c+2*b;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik");
        alert.setHeaderText("Pole to:"+prostokat + "\nObwód to:"+prostokat1);
        alert.showAndWait();
    }

    public void countRob(ActionEvent actionEvent)
    {
        Double d;
        Double e;
        try {
            d = Double.parseDouble(txt4.getText());
            e = Double.parseDouble(txt5.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double romb = e*d;
        Double romb1 = 4*d;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik");
        alert.setHeaderText("Pole to:"+romb + "\nObwód to:"+romb1);
        alert.showAndWait();
    }

    public void countRo(ActionEvent actionEvent)
    {
        Double f;
        Double g;
        try {
            f = Double.parseDouble(txt9.getText());
            g = Double.parseDouble(txt10.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double rownolegloboku = f*g;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik");
        alert.setHeaderText("Pole to:"+rownolegloboku);
        alert.showAndWait();
    }

    public void countTr(ActionEvent actionEvent)
    {
        Double h;
        Double i;
        Double j;
        try {
            h = Double.parseDouble(txt6.getText());
            i = Double.parseDouble(txt7.getText());
            j = Double.parseDouble(txt8.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Wpisz poprawne liczby");
            alert.showAndWait();
            return;
        }
        Double trapez = ((h+i)*j)/2;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik");
        alert.setHeaderText("Pole to:"+trapez );
        alert.showAndWait();
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
        Double kwadrat1 = 4*a;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Wynik");
        alert.setHeaderText("Pole to:"+kwadrat + "\nObwód to:"+kwadrat1);
        alert.showAndWait();
    }
}