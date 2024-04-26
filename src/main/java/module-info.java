module com.example.lab_18 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.lab_18 to javafx.fxml;
    exports com.example.lab_18;
}