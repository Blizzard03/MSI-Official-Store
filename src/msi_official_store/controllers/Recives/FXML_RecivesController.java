/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Recives;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import msi_official_store.models.Laptop.Gaming.Laptop_Gaming_Model;
import msi_official_store.models.Laptop.Content_Creation.Laptop_Content_Creation_Model;
import msi_official_store.models.Laptop.Bussiness_Productivity.Laptop_Bussiness_Productivity_Model;
import msi_official_store.models.customer.Customer;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_RecivesController implements Initializable {

    //Laptop Gaming
    Laptop_Gaming_Model lgm = new Laptop_Gaming_Model();

    //Laptop Creator Creation
    Laptop_Content_Creation_Model lccm = new Laptop_Content_Creation_Model();

    //Laptop Bussiness & Producticity
    Laptop_Bussiness_Productivity_Model lbpm = new Laptop_Bussiness_Productivity_Model();

    //Customer
    Customer cms = new Customer();
    
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        

    }

    @FXML
    private void Print_Invoice(ActionEvent event) {
    }
    
    private void laptopgaming_msibravo(){
        
    }
    
    public void showInfomodel(String model,String cpu, String gpu){
        txtlaptopmodel.setText(model);
        txtlaptop_cpu.setText(cpu);
        txt_laptop_gpu.setText(gpu);
    }
    
    public void showinfoprice(double price){
        txt_laptop_price.setText(formater.format(price));
    }

}
