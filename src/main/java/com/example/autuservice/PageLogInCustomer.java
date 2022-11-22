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

public class PageLogInCustomer {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonYes;

    @FXML
    private Button ButtonNo;

    @FXML
    void BtnYes(ActionEvent event) {
        ButtonYes.getScene().getWindow().hide();
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
    void BtnNo(ActionEvent event) {
        ButtonNo.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageTableMasterOffice.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root2));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void initialize() {

    }
}
