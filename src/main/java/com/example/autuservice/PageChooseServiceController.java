package com.example.autuservice;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PageChooseServiceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnInteriorTrim;

    @FXML
    private Button BtnPunpUpWheels;

    @FXML
    private Button BtnCheckingAuto;

    @FXML
    private Button BtnPaintOrPast;

    @FXML
    private Button BtnSoundSystem;

    @FXML
    void initialize() {
        BtnInteriorTrim.setOnMouseReleased(mouseEvent -> goToPickTime(Service.Type.INTERIOR_TRIM));
        BtnPunpUpWheels.setOnMouseReleased(mouseEvent -> goToPickTime(Service.Type.PUMP_WHEELS));
        BtnCheckingAuto.setOnMouseReleased(mouseEvent -> goToPickTime(Service.Type.CHECK_CAR));
        BtnPaintOrPast.setOnMouseReleased(mouseEvent -> goToPickTime(Service.Type.PAINTING));
        BtnSoundSystem.setOnMouseReleased(mouseEvent -> goToPickTime(Service.Type.AUDIO_SYSTEM));
    }

    private void goToPickTime(Service.Type type) {
        PageRightChoiseController.TYPE = type;

        BtnPaintOrPast.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageRightChoise.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Вхід");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
