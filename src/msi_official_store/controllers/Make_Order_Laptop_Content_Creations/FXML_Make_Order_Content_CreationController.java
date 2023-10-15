/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Make_Order_Laptop_Content_Creations;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import msi_official_store.models.Laptop.Content_Creation.Laptop_Content_Creation_Model;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_Make_Order_Content_CreationController implements Initializable {

    //Content Creation Models
    Laptop_Content_Creation_Model LCCM = new Laptop_Content_Creation_Model();

    @FXML
    private SplitPane Menu_Order;
    @FXML
    private ToggleGroup Models;
    @FXML
    private AnchorPane Content_Creator;
    @FXML
    private ToggleButton MSICreatorZ16HXStudioB13VETO;
    @FXML
    private ToggleGroup Name_Models_Conent_Creator;
    @FXML
    private ToggleButton MSICreatorZ17HXStudioA13V;
    @FXML
    private ToggleButton MSICreatorM16B13VE;
    @FXML
    private ToggleButton MSICreatorZ16HXStudioB13VGTO;
    @FXML
    private ToggleButton Gaming_Btn;
    @FXML
    private ToggleButton Content_Creations;
    @FXML
    private ToggleButton Bussiness_Productivity;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Models(ActionEvent event) {
        //Gaming Section
        if (event.getSource() == Gaming_Btn) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Make_Order/Laptop/Gaming/FXML_Make_Order_Laptop_Gaming.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Make Order");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                Gaming_Btn.setSelected(true);
                Content_Creations.setSelected(false);
                Bussiness_Productivity.setSelected(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Content Creations Section
        if (event.getSource() == Content_Creations) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Make_Order/Laptop/Content_Creation/FXML_Make_Order_Content_Creation.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Make Order");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                Gaming_Btn.setSelected(false);
                Content_Creations.setSelected(true);
                Bussiness_Productivity.setSelected(false);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //Bussiness Productivity Sections
        if (event.getSource() == Bussiness_Productivity) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Make_Order/Laptop/Bussiness_Producivity/FXML_Make_Order_Bussiness_Productivity.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Make Order");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                Gaming_Btn.setSelected(false);
                Content_Creations.setSelected(false);
                Bussiness_Productivity.setSelected(true);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void Laptop_Creator_Creation(ActionEvent event) {
        //MSI Creator Z16 HX Studio B13 VETO
        if (event.getSource() == MSICreatorZ16HXStudioB13VETO) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ16HXStudioB13VETO.setSelected(true);
                LCCM.setName(MSICreatorZ16HXStudioB13VETO.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Creator Z17 HX Studio A13V
        if (event.getSource() == MSICreatorZ17HXStudioA13V) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ17HXStudioA13V.setSelected(true);
                LCCM.setName(MSICreatorZ17HXStudioA13V.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Creator M16 B13VE
        if (event.getSource() == MSICreatorM16B13VE) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorM16B13VE.setSelected(true);
                LCCM.setName(MSICreatorM16B13VE.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Creator Z16HX Studio B13VGTO
        if (event.getSource() == MSICreatorZ16HXStudioB13VGTO) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ16HXStudioB13VGTO.setSelected(true);
                LCCM.setName(MSICreatorZ16HXStudioB13VGTO.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
