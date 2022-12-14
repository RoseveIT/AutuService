package com.example.autuservice;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView logo;

    @FXML
    private Button loginSignInButton;

    @FXML
    private Button loginSighUpButton;

    @FXML
    void BtnSignIn(ActionEvent event) {
        loginSignInButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageSignIn.fxml"));
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
    void BtnSignUp(ActionEvent event) {
        loginSighUpButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageSignUp.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Рейстрація");
            stage.setScene(new Scene(root2));
            stage.show();
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @FXML
    void initialize() {
        assert logo != null : "fx:id=\"logo\" was not injected: check your FXML file 'hello-view.fxml'.";
    }
}
