/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.Invoice_Physical;

import Models.Customer.Customer;
import Models.Laptop.Laptop;
import Models.Laptop.Update.Price_Update;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import msi_official_store.controllers.Make_Order_Laptop_Business_Productivity.FXML_Make_Order_Business_Productivity_Controller;
import msi_official_store.controllers.Make_Order_Laptop_Content_Creations.FXML_Make_Order_Content_CreationController;
import msi_official_store.controllers.Make_Order_Laptop_Gaming.FXML_Make_OrderController_Laptop_Gaming;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_InvoiceController implements Initializable {

    Customer crm = new Customer();

    Laptop ltp = new Laptop();
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
    @FXML
    private Button printfinvoice;
    @FXML
    private Button main_menu;
    @FXML
    private TextField CPU_TXT;
    @FXML
    private TextField GPU_TXT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    public void showdata(String Name, String Address, String Model, String CPU, String GPU, double Price) {
        Customer_txt.setText(Name);
        Address_txt.setText(Address);
        Model_txt.setText(Model);
        CPU_TXT.setText(CPU);
        GPU_TXT.setText(GPU);
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

    @FXML
    private void printfinvoiceclick(ActionEvent event) {
        try {
            BufferedWriter Invoice = new BufferedWriter(new FileWriter("src\\Invoice\\Invoice.txt"));
            Invoice.write("=========================================================================" + "\n");
            Invoice.write("MSI OFFICIAL STORE" + "\n");
            Invoice.write("=========================================================================" + "\n");
            Invoice.write("Costumer Name" + "\n");
            Invoice.write(Customer_txt.getText() + "\n");
            Invoice.write("Address" + "\n");
            Invoice.write(Address_txt.getText() + "\n");
            Invoice.write("=========================================================================" + "\n");
            Invoice.write("Model" + "\n");
            Invoice.write(Model_txt.getText() + "\n");
            Invoice.write("CPU" + "\n");
            Invoice.write(CPU_TXT.getText() + "\n");
            Invoice.write("GPU" + "\n");
            Invoice.write(GPU_TXT.getText() + "\n");
            Invoice.write("=========================================================================" + "\n");
            Invoice.write("Price" + "\n");
            Invoice.write("$"+Price_txt.getText() + "\n");
            Invoice.write("Tax" + "\n");
            Invoice.write(Tax_txt.getText() + "\n");
            Invoice.write("Shipping" + "\n");
            Invoice.write(shipping_txt.getText() + "\n");
            Invoice.write("Discount" + "\n");
            Invoice.write(Discount_txt.getText() + "\n");
            Invoice.write("Total" + "\n");
            Invoice.write(Total_txt.getText() + "\n");
            Invoice.write("=========================================================================" + "\n");
            Invoice.close();
            Alert art = new Alert(Alert.AlertType.INFORMATION, "The process of saving the data has been executed flawlessly and concluded successfully", ButtonType.OK);
            art.showAndWait();
            if (art.getResult() == ButtonType.OK) {
                printfinvoice.setVisible(false);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void backtomain_menu(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.WARNING, "The data is scheduled for deletion. Would you like to print a copy of the data you have requested before we proceed with the deletion?", ButtonType.YES, ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/main_menu/FXML_MainMenu.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setOnCloseRequest(new EventHandler<WindowEvent>() {
                    public void handle(final WindowEvent windowEvent) {
                        Alert al = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure Want Quit The Program?", ButtonType.OK, ButtonType.CANCEL);
                        al.showAndWait();
                        if (al.getResult() == ButtonType.CANCEL) {
                            windowEvent.consume();
                        }
                    }
                }
                );
                stg.setTitle("Main_Menu");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                main_menu.getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
