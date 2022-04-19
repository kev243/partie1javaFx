package com.example.partie1javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu {

    @FXML
    protected void onConnexion(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("choix.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage =new Stage();
        stage.setTitle("Vroum!Vroum!");
        stage.setScene(scene);
        ////Le code suivant montre comment utiliser Java Modality.NONE
        stage.initModality(Modality.NONE);//default
        stage.show();


    }

    @FXML

    //l'ouverture de la fenetre Evaluer

    protected void onEvaluer(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("evaluer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage =new Stage();
        stage.setTitle("Vroum!Vroum!");
        stage.setScene(scene);
        ////Le code suivant montre comment utiliser Java Modality.NONE
        stage.initModality(Modality.NONE);//default
        stage.show();


    }

    //l'ouverture de la fenetre achat
    @FXML
    protected void onAchat (ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("achat.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        Stage stage =new Stage();
        stage.setTitle("Vroum!Vroum!");
        stage.setScene(scene);
        ////Le code suivant montre comment utiliser Java Modality.NONE
        stage.initModality(Modality.NONE);//default
        stage.show();


    }
}
