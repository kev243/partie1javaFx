package com.example.partie1javafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class choix implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void enregistrerButtonClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("enregistrer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage =new Stage();
        stage.setTitle("Vroum!Vroum!");
        stage.setScene(scene);
        ////Le code suivant montre comment utiliser Java Modality.NONE
        stage.initModality(Modality.NONE);//default
        stage.show();
    }
}
