/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.Invoice_Physical;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_InvoiceController implements Initializable {

    //Curency Formatter
    Locale USA = new Locale("en", "US");
    NumberFormat formater = NumberFormat.getCurrencyInstance(USA);

    @FXML
    private TextArea Address_txt;
    @FXML
    private TextField Customer_txt;
    @FXML
    private TextField Model_txt;
    @FXML
    private TextField Price_txt;
    @FXML
    private TextField Tax_txt;
    @FXML
    private TextField shipping_txt;
    @FXML
    private TextField Discount_txt;
    @FXML
    private TextField Total_txt;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void showdata(String Customer, String Address, String Model, double Price) {
        Customer_txt.setText(Customer);
        Address_txt.setText(Address);
        Model_txt.setText(Model);
        Price_txt.setText(String.valueOf(Price));
        if (Price > 1000.00) {
            double harga = Double.parseDouble(Price_txt.getText());
            double tax = harga * 0.0028;
            double discount = harga * 004;
            double shipping = 250.00;
            double totalharga = harga + tax + shipping;
            double hargasetelahdiskondiskon = discount - totalharga;
            Tax_txt.setText(formater.format(tax));
            shipping_txt.setText(formater.format(shipping));
            Discount_txt.setText(formater.format(discount));
            Total_txt.setText(formater.format(hargasetelahdiskondiskon));
            

        } else {
            double harga = Double.parseDouble(Price_txt.getText());
            double tax = harga * 0.0028;
            double shipping = 250.00;
            double totalharga = harga + tax + shipping;
            Tax_txt.setText(formater.format(tax));
            shipping_txt.setText(formater.format(shipping));
            Discount_txt.setText(formater.format(0));
            Total_txt.setText(formater.format(totalharga));
           
        }

    }

}
