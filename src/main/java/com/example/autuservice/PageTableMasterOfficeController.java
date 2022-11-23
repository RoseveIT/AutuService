package com.example.autuservice;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class PageTableMasterOfficeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Service> listOfServices;

    @FXML
    void initialize() {
        TableColumn<Service, String> dateColumn = new TableColumn<>("Дата");
        dateColumn.setPrefWidth(100);
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        TableColumn<Service, String> timeColumn = new TableColumn<>("Час");
        timeColumn.setPrefWidth(300);
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));

        TableColumn<Service, String> typeColumn = new TableColumn<>("Вид послуги");
        typeColumn.setPrefWidth(100);
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));

        listOfServices.getColumns().addAll(dateColumn, timeColumn, typeColumn);

        listOfServices.getItems().clear();
        listOfServices.getItems().addAll(DataStorage.getInstance().getServices());
    }
}
