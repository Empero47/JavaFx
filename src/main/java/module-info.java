module com.example.undo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.undo to javafx.fxml;
    exports com.example.undo;
}