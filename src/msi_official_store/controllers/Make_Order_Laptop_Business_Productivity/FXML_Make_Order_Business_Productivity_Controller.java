/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Make_Order_Laptop_Business_Productivity;

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
import msi_official_store.models.Laptop.Bussiness_Productivity.Laptop_Bussiness_Productivity_Model;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_Make_Order_Business_Productivity_Controller implements Initializable {

    //Laptop Bussiness & Productivity Model
    Laptop_Bussiness_Productivity_Model LBPM = new Laptop_Bussiness_Productivity_Model();
    
    @FXML
    private SplitPane Menu_Order;
    @FXML
    private ToggleGroup Models;
    @FXML
    private AnchorPane Content_Creator;
    @FXML
    private ToggleButton MSISummitE14FlipEvoA13M;
    @FXML
    private ToggleGroup Name_Models_Conent_Creator;
    @FXML
    private ToggleButton MSIModern14C7M;
    @FXML
    private ToggleButton MSIPrestige14HB13UCX;
    @FXML
    private ToggleButton MSIModern15B13M;
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
    private void Laptop_Business_Productivity(ActionEvent event) {
        //MSI Summit E14 Flip Evo - A13M
        if (event.getSource() == MSISummitE14FlipEvoA13M) {
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
                MSISummitE14FlipEvoA13M.setSelected(true);
                LBPM.setName(MSISummitE14FlipEvoA13M.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Modern 14 C7M
        if (event.getSource() == MSIModern14C7M) {
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
                MSIModern14C7M.setSelected(true);
                LBPM.setName(MSIModern14C7M.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Prestige 14 H B13UCX
        if (event.getSource() == MSIPrestige14HB13UCX) {
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
                MSIPrestige14HB13UCX.setSelected(true);
                LBPM.setName(MSIPrestige14HB13UCX.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Modern 15 B13M
        if (event.getSource() == MSIModern15B13M) {
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
                MSIModern15B13M.setSelected(true);
                LBPM.setName(MSIModern15B13M.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}


