package com.example.autuservice;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class PageSignInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnSignIn;

    @FXML
    private TextField loginText;

    @FXML
    private TextField passwordText;

    @FXML
    void initialize() {
        BtnSignIn.setOnMouseReleased(mouseEvent -> {
            String login = loginText.getText();
            String password = passwordText.getText();

            User user = DataStorage.getInstance().getUsers()
                    .stream()
                    .filter(listedUser -> Objects.equals(listedUser.getLogin(), login))
                    .findAny()
                    .orElseThrow(() -> {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText("User with Login: " + login + " doesn't exist");
                        alert.show();

                        throw new RuntimeException();
                    });

            if (!Objects.equals(user.getPassword(), password)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Wrong password");
                alert.show();

                throw new RuntimeException();
            }

            BtnSignIn.getScene().getWindow().hide();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageLoginAsCustomer.fxml"));
                Parent root1 = fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Вхід");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.out.println("Error");
            }
        });
    }
}
