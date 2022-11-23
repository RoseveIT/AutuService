package com.example.autuservice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class PageSignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpLastname;

    @FXML
    private TextField signUpName;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private TextField signUpPassword;

    @FXML
    private TextField signUpLogin;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField SignUpEmail;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    void BtnSignUp(ActionEvent event) {
        signUpButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageSignIn.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @FXML
    void initialize() {
        signUpButton.setOnMouseReleased(mouseEvent -> {
            String login = signUpLogin.getText();
            String firstName = signUpName.getText();
            String lastName = signUpLastname.getText();
            String email = SignUpEmail.getText();
            String password = signUpPassword.getText();
            User.Gender gender = Objects.equals(signUpCheckBoxMale.isSelected(), Boolean.TRUE) ? User.Gender.MALE : User.Gender.FEMALE;

            User user = new User(login, firstName, lastName, email, password, gender);

            DataStorage.getInstance().getUsers().add(user);
        });
    }
}
