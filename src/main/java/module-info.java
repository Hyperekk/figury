module com.bartt.figury {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bartt.figury to javafx.fxml;
    exports com.bartt.figury;
}