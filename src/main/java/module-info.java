module com.example.partie1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.partie1javafx to javafx.fxml;
    exports com.example.partie1javafx;
}