/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Recives;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_RecivesController implements Initializable {

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
