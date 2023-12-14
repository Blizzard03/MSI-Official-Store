/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Recives;

import Models.Customer.Customer;
import Models.Laptop.Laptop;
import Models.Laptop.Update.Price_Update;
import java.io.File;
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
import javafx.scene.control.ButtonType;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import msi_official_store.Invoice_Physical.FXML_InvoiceController;
import msi_official_store.controllers.Make_Order_Laptop_Business_Productivity.FXML_Make_Order_Business_Productivity_Controller;
import msi_official_store.controllers.Make_Order_Laptop_Content_Creations.FXML_Make_Order_Content_CreationController;
import msi_official_store.controllers.Make_Order_Laptop_Gaming.FXML_Make_OrderController_Laptop_Gaming;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_RecivesController implements Initializable {

    Customer crm = new Customer();
    Laptop ltp = new Laptop();

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
        if (txt_customername.getText().isEmpty()) {
            Alert art = new Alert(Alert.AlertType.WARNING, "The field is currently empty. Please ensure to input the required name to proceed!!", ButtonType.OK);
            art.showAndWait();
        } else if (txt_customer_address.getText().isEmpty()) {
            Alert art = new Alert(Alert.AlertType.WARNING, "The field is currently empty. Please ensure to input the required address to proceed!!", ButtonType.OK);
            art.showAndWait();
        } else {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Physchical_Invoice/FXML_Invoice.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXML_InvoiceController Invoice = loader.getController();
                ltp.setModels(txtlaptopmodel.getText());
                ltp.setCPU(txtlaptop_cpu.getText());
                ltp.setGPU(txt_laptop_gpu.getText());
                crm.setName(txt_customername.getText());
                crm.setAddress(txt_customer_address.getText());
                Invoice.showdata(crm.getName(), crm.getAddress(), ltp.getModels(), ltp.getCPU(), ltp.getGPU(), Double.parseDouble(txt_laptop_price.getText()));
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
    }

    public void showInfo(Laptop ltp) {
        String Model = null, CPU = null, GPU = null;
        double Price = 0;
        switch (ltp.getModels()) {
            case "MSI Summit E14 Flip Evo - A13M": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Business_Productivity_Controller.pudt.getMSISummitE14FlipEvoA13MPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
            case "MSI Modern 14 C7M": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIModern14C7MPrice();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case "MSI Prestige 14 H B13UCX": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIPrestige14HB13UCXPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
            case "MSI Modern 15 B13M": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIModern15B13MPrice();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case "MSI Creator Z16 HX Studio - B13VETO": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ16HXStudioB13VETOPrice();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case "MSI Creator Z17 HX Studio - A13V": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ17HXStudioA13VPrice();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case " MSI Creator M16 B13VE": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Content_CreationController.pudt.getMSICreatorM16B13VEPrice();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case "MSI Creator Z16HX Studio B13VGTO": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ16HXStudioB13VGTOPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
            case "MSI Pulse 15 B13V": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIPulse15B13VPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
            case "MSI BRAVO 15 C7V": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIBRAVO15C7VPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
            case "MSI Titan GT77 HX 13V": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_OrderController_Laptop_Gaming.pudt.getMSITitanGT77HX13V();
                txt_laptop_price.setText(String.valueOf(Price));

                break;
            }
            case "MSI Katana 17 B13VFK": {
                Model = ltp.getModels();
                txtlaptopmodel.setText(Model);
                CPU = ltp.getCPU();
                txtlaptop_cpu.setText(CPU);
                GPU = ltp.getGPU();
                txt_laptop_gpu.setText(GPU);
                Price = FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIModern14C7MPrice();
                txt_laptop_price.setText(String.valueOf(Price));
                break;
            }
        }
    }

}
