module com.example.probeprojekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.probeprojekt to javafx.fxml;
    exports com.example.probeprojekt;
}