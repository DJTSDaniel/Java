module com.racionales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.racionales to javafx.fxml;
    exports com.racionales;
}
