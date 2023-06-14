module com.example.sokoban {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sokoban to javafx.fxml;
    exports com.example.sokoban;
}