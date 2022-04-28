package com.example.partie1javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Enregistrer implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    protected void onHome(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage =new Stage();
        stage.setTitle("Vroom!Vroom!");
        stage.setScene(scene);
        ////Le code suivant montre comment utiliser Java Modality.NONE
        stage.initModality(Modality.NONE);//default
        stage.show();
        stage.setResizable(false);


    }

}
