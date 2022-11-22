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

public class PageSignInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnSignIn;

    @FXML
    void SignInButton(ActionEvent event) {
        BtnSignIn.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageLoginAsCustomer.fxml"));
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
