/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Recives;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import msi_official_store.Invoice_Physical.FXML_InvoiceController;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_RecivesController implements Initializable {

    //Curency Formatter
    Locale USA = new Locale("en", "US");
    NumberFormat formater = NumberFormat.getCurrencyInstance(USA);

    @FXML
    private ScrollPane Recive_maker;
    @FXML
    private TextField txt_customername;
    @FXML
    private TextArea txt_customer_address;
    @FXML
    private TextField txtlaptopmodel;
    @FXML
    private TextField txtlaptop_cpu;
    @FXML
    private TextField txt_laptop_gpu;
    @FXML
    private TextField txt_laptop_price;
    @FXML
    private CheckBox Member_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void Print_Invoice(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Physchical_Invoice/FXML_Invoice.fxml"));
            Parent root = (Parent) loader.load();
            Scene scene = new Scene(root);
            Stage stg = new Stage();
            FXML_InvoiceController Invoice = loader.getController();
            Invoice.showdata(txt_customername.getText(), txt_customer_address.getText(), txtlaptopmodel.getText(), Double.parseDouble(txt_laptop_price.getText()));
            stg.setTitle("Invoice");
            stg.initModality(Modality.APPLICATION_MODAL);
            stg.setResizable(false);
            stg.setIconified(false);
            stg.setScene(scene);
            stg.show();
            Recive_maker.getScene().getWindow().hide();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


public void showInfomodel(String model, String cpu, String gpu) {
        txtlaptopmodel.setText(model);
        txtlaptop_cpu.setText(cpu);
        txt_laptop_gpu.setText(gpu);
    }

    public void showinfoprice(double price) {
        txt_laptop_price.setText(String.valueOf(price));

    }
}
