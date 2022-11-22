package com.example.autuservice;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PageRightChoiseController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnNo;

    @FXML
    private Button BtnYes;

    @FXML
    void ButtonYes(ActionEvent event) {
        BtnYes.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageThanks.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void ButtonNo(ActionEvent event) {
        BtnNo.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageChooseService.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void initialize() {

    }
}
