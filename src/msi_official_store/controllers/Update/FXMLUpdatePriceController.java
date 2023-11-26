/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Update;

import Models.Laptop.Laptop;
import Models.Laptop.Update.Price_Update;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import msi_official_store.controllers.Make_Order_Laptop_Business_Productivity.FXML_Make_Order_Business_Productivity_Controller;
import msi_official_store.controllers.Make_Order_Laptop_Content_Creations.FXML_Make_Order_Content_CreationController;
import msi_official_store.controllers.Make_Order_Laptop_Gaming.FXML_Make_OrderController_Laptop_Gaming;

/**
 * FXML Controller class
 *
 * @author Blizzard
 */
public class FXMLUpdatePriceController implements Initializable {

    Price_Update pudt = new Price_Update();

    @FXML
    private ImageView ModelImage;
    @FXML
    private TextField modeltxt;
    @FXML
    private TextField CPUtxt;
    @FXML
    private TextField GPU_txt;
    @FXML
    private TextField Pricetxt;
    @FXML
    private Button Update_Btn;
    @FXML
    private Button Reset_Btn;
    @FXML
    private Button CancelClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void UpdateClick(ActionEvent event) {

        Alert art = new Alert(Alert.AlertType.INFORMATION, "The update to the data has been successfully implemented in a seamless manner!!", ButtonType.OK);
        art.showAndWait();
        if (art.getResult() == ButtonType.OK) {
            /*
        * Gaming
             */
            //MSI Pulse 15 B13V
            FXML_Make_OrderController_Laptop_Gaming.pudt.setMSIPulse15B13VPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI BRAVO 15 C7V
            FXML_Make_OrderController_Laptop_Gaming.pudt.setMSIBRAVO15C7VPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Titan GT77 HX13V
            FXML_Make_OrderController_Laptop_Gaming.pudt.setMSITitanGT77HX13V(Double.parseDouble(Pricetxt.getText()));

            //MSI Katana 17 B13VFK
            FXML_Make_OrderController_Laptop_Gaming.pudt.setMSIKatana17B13VFK(Double.parseDouble(Pricetxt.getText()));
            /*
        * Business Productivity
             */
            //MSI Summit E14 Flip Evo - A13M
            FXML_Make_Order_Business_Productivity_Controller.pudt.setMSISummitE14FlipEvoA13MPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Modern 14 C7M
            FXML_Make_Order_Business_Productivity_Controller.pudt.setMSIModern14C7MPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Prestige 14 H B13UCX
            FXML_Make_Order_Business_Productivity_Controller.pudt.setMSIPrestige14HB13UCXPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Modern 15 B13M
            FXML_Make_Order_Business_Productivity_Controller.pudt.setMSIModern15B13MPrice(Double.parseDouble(Pricetxt.getText()));

            /*
        * Content Creator
             */
            //MSI Creator Z16 HX Studio B13 VETO
            FXML_Make_Order_Content_CreationController.pudt.setMSICreatorZ16HXStudioB13VETOPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Creator Z17 HX Studio A13V
            FXML_Make_Order_Content_CreationController.pudt.setMSICreatorZ17HXStudioA13VPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Creator M16 B13VE
            FXML_Make_Order_Content_CreationController.pudt.setMSICreatorM16B13VEPrice(Double.parseDouble(Pricetxt.getText()));

            //MSI Creator Z16HX Studio B13VGTO
            FXML_Make_Order_Content_CreationController.pudt.setMSICreatorZ16HXStudioB13VGTOPrice(Double.parseDouble(Pricetxt.getText()));
            Update_Btn.getScene().getWindow().hide();
        }
    }

    @FXML
    private void Reset_Click(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.WARNING, "The data will be permanently deleted and it will be impossible to restore it. There will be no available actions to reverse this process!!", ButtonType.YES,
                ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            File filefirst = new File(
                    "/src/assets/images/Logo/Logo_Laptop.png");
            Image imagesfirst = new Image(filefirst.toURI().toString());
            ModelImage.setImage(imagesfirst);
            modeltxt.setText(null);
            CPUtxt.setText(null);
            GPU_txt.setText(null);
            Pricetxt.setText(null);
        }
    }

    @FXML
    private void CancelClick(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.CONFIRMATION, "Are You Sure Want Cancel This Update Now?", ButtonType.YES,
                ButtonType.NO);
        art.showAndWait();
        if (art.getResult() == ButtonType.YES) {
            CancelClick.getScene().getWindow().hide();
        }
    }

    public void getdata(Laptop ltp) {
        String Model = null, CPU = null, GPU = null;
        switch (ltp.getModels()) {
            case "MSI Summit E14 Flip Evo - A13M": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Business_Productivity_Controller.pudt.getMSISummitE14FlipEvoA13MPrice()));
                File filesummit = new File(
                        "src/assets/images/Bussiness&Producivity/MSI Summit E14 Flip Evo - A13M.png");
                Image imagesummit = new Image(filesummit.toURI().toString());
                ModelImage.setImage(imagesummit);
                break;
            }
            case "MSI Modern 14 C7M": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIModern14C7MPrice()));
                File fileModern14 = new File("src/assets/images/Bussiness&Producivity/MSI Modern 14 C7M.png");
                Image imageModern14 = new Image(fileModern14.toURI().toString());
                ModelImage.setImage(imageModern14);
                break;
            }
            case "MSI Prestige 14 H B13UCX": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIPrestige14HB13UCXPrice()));
                File filePrestige14 = new File("src/assets/images/Bussiness&Producivity/MSI Prestige 14 H B13UCX.png");
                Image imagePresitage14 = new Image(filePrestige14.toURI().toString());
                ModelImage.setImage(imagePresitage14);
                break;
            }
            case "MSI Modern 15 B13M": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Business_Productivity_Controller.pudt.getMSIModern15B13MPrice()));
                File fileModern15 = new File("src/assets/images/Bussiness&Producivity/Modern 15 B13M.png");
                Image imageModern15 = new Image(fileModern15.toURI().toString());
                ModelImage.setImage(imageModern15);
                break;
            }
            case "MSI Creator Z16 HX Studio - B13VETO": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ16HXStudioB13VETOPrice()));
                File fileCreatorZ16VETO = new File(
                        "src/assets/images/Content_Creations/MSI Creator Z16 HX Studio - B13V.png");
                Image imageCreatorZ16VETO = new Image(fileCreatorZ16VETO.toURI().toString());
                ModelImage.setImage(imageCreatorZ16VETO);
                break;
            }
            case "MSI Creator Z17 HX Studio - A13V": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ17HXStudioA13VPrice()));
                File fileCreatorZ17 = new File("src/assets/images/Content_Creations/Creator Z17 HX Studio - A13V.png");
                Image imageCreatorZ17 = new Image(fileCreatorZ17.toURI().toString());
                ModelImage.setImage(imageCreatorZ17);
                break;
            }
            case " MSI Creator M16 B13VE": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Content_CreationController.pudt.getMSICreatorM16B13VEPrice()));
                File fileCreatorM16 = new File("src/assets/images/Content_Creations/MSI Creator M16 B13VE.png");
                Image imageCreatorM16 = new Image(fileCreatorM16.toURI().toString());
                ModelImage.setImage(imageCreatorM16);
                break;
            }
            case "MSI Creator Z16HX Studio B13VGTO": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_Order_Content_CreationController.pudt.getMSICreatorZ16HXStudioB13VGTOPrice()));
                File fileCreatorZ16VGTO = new File(
                        "src/assets/images/Content_Creations/MSI Creator Z16 HX Studio - B13VGTO.png");
                Image imageCreatorZ16VGTO = new Image(fileCreatorZ16VGTO.toURI().toString());
                ModelImage.setImage(imageCreatorZ16VGTO);
                break;
            }
            case "MSI Pulse 15 B13V": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIPulse15B13VPrice()));
                File filePulse = new File("src/assets/images/Gaming/MSI Pulse 15 B13VGK.png");
                Image imagePulse = new Image(filePulse.toURI().toString());
                ModelImage.setImage(imagePulse);
                break;
            }
            case "MSI BRAVO 15 C7V": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIBRAVO15C7VPrice()));
                File fileBravo15 = new File("src/assets/images/Gaming/Bravo 15 C7VE.png");
                Image imageBravo15 = new Image(fileBravo15.toURI().toString());
                ModelImage.setImage(imageBravo15);
                break;
            }
            case "MSI Titan GT77 HX 13V": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_OrderController_Laptop_Gaming.pudt.getMSITitanGT77HX13V()));
                File fileTitan = new File("src/assets/images/Gaming/MSI Titan GT77 HX 13V.png");
                Image imageTitan = new Image(fileTitan.toURI().toString());
                ModelImage.setImage(imageTitan);
                break;
            }
            case "MSI Katana 17 B13VFK": {
                Model = ltp.getModels();
                modeltxt.setText(Model);
                CPU = ltp.getCPU();
                CPUtxt.setText(CPU);
                GPU = ltp.getGPU();
                GPU_txt.setText(GPU);
                Pricetxt.setText(String.valueOf(FXML_Make_OrderController_Laptop_Gaming.pudt.getMSIModern14C7MPrice()));
                File fileKatana = new File("src/assets/images/Gaming/MSI Katana 17 B13VFK.png");
                Image imageKatana = new Image(fileKatana.toURI().toString());
                ModelImage.setImage(imageKatana);
                break;
            }

        }

    }

}
