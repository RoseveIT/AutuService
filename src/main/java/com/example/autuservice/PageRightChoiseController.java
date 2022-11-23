package com.example.autuservice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

public class PageRightChoiseController {
    public static Service.Type TYPE = Service.Type.PAINTING;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnNo;

    @FXML
    private Button BtnYes;

    @FXML
    private DatePicker date;

    @FXML
    private Spinner<Integer> HHH;

    @FXML
    private Spinner<Integer> minutes;

    @FXML
    void ButtonYes(ActionEvent event) {
        LocalDate localDate = date.getValue();
        Integer hour = HHH.getValue();
        Integer minute = minutes.getValue();

        DataStorage.getInstance().getServices().add(new Service(localDate, LocalTime.of(hour, minute), TYPE));

        BtnYes.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageThanks.fxml"));
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
    void ButtonNo(ActionEvent event) {
        BtnNo.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PageChooseService.fxml"));
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
        minutes.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59));
        HHH.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23));
    }
}
