/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Make_Order_Laptop_Gaming;

import Models.Laptop.Laptop;
import Models.Laptop.Update.Price_Update;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.EOFException;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.stage.WindowEvent;

import msi_official_store.controllers.Recives.FXML_RecivesController;
import msi_official_store.controllers.Update.FXMLUpdatePriceController;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_Make_OrderController_Laptop_Gaming implements Initializable {

    Laptop ltp = new Laptop();
    public static Price_Update pudt = new Price_Update();

    @FXML
    private SplitPane Menu_Order;
    @FXML
    private ToggleButton Gaming_Btn;
    @FXML
    private ToggleGroup Models;
    @FXML
    private ToggleButton Content_Creations;
    @FXML
    private ToggleButton Bussiness_Productivity;
    @FXML
    private ToggleButton MSIPulse15B13V;
    @FXML
    private ToggleGroup Name_Models_Gaming;
    @FXML
    private ToggleButton MSIBRAVO15C7V;
    @FXML
    private ToggleButton MSITitanGT77HX13V;
    @FXML
    private ToggleButton MSIKatana17B13VFK;
    @FXML
    private ToggleButton PulseEdit;
    @FXML
    private ToggleButton BravoEdit;
    @FXML
    private ToggleButton TitanEdit;
    @FXML
    private ToggleButton KatanaEdit;
    @FXML
    private ToggleGroup Edits;
    @FXML
    private ImageView Pulse;
    @FXML
    private ImageView Bravo;
    @FXML
    private ImageView Titan;
    @FXML
    private ImageView Katana;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        //MSI Pulse 15 B13V
        pudt.setMSIPulse15B13VPrice(1849.49);

        //MSI BRAVO 15 C7V
        pudt.setMSIBRAVO15C7VPrice(1020.08);

        //MSI Titan GT77 HX13V
        pudt.setMSITitanGT77HX13V(5739.80);

        //MSI Katana 17 B13VFK
        pudt.setMSIKatana17B13VFK(2869.90);
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
    private void Laptop_Gaming(ActionEvent event) throws IOException {

        //MSI Pulse 15B13V
        if (event.getSource() == MSIPulse15B13V) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
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
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSIPulse15B13V.getText());
                ltp.setCPU("Intel i9 - 13900H");
                ltp.setGPU("RTX 4070 LAPTOP GPU 8GB GDD6");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSIPulse15B13V.setSelected(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI BRAVO 15 C7V
        if (event.getSource() == MSIBRAVO15C7V) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSIBRAVO15C7V.getText());
                ltp.setCPU("AMD RYZEN 7 7735HS");
                ltp.setGPU("RTX 4050 LAPTOP GPU 6GB GDD6");
                Receive.showInfo(ltp);
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
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSIBRAVO15C7V.setSelected(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Titan GT77 HX13V
        if (event.getSource() == MSITitanGT77HX13V) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSITitanGT77HX13V.getText());
                ltp.setCPU("Intel i9 - 13980HX");
                ltp.setGPU("RTX 4090 LAPTOP GPU 16GB GDD6");
                Receive.showInfo(ltp);
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
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSITitanGT77HX13V.setSelected(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //MSI Katana 17 B13VFK
        if (event.getSource() == MSIKatana17B13VFK) {

            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Receives/FXML_Recives.fxml"));
                Parent root = (Parent) loader.load();
                Scene scene = new Scene(root);
                Stage stg = new Stage();
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSIKatana17B13VFK.getText());
                ltp.setCPU("Intel i9 - 13900H");
                ltp.setGPU("RTX 4060 LAPTOP GPU 8GB GDD6");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
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
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSIKatana17B13VFK.setSelected(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @FXML
    private void Edit_Price_Click(ActionEvent event) {
        Alert art = new Alert(Alert.AlertType.WARNING, "UPDATE PRICE ONLY!!!!", ButtonType.OK);
        art.showAndWait();
        if (art.getResult() == ButtonType.OK) {
            //MSI Pulse 15B13V
            if (event.getSource() == PulseEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSIPulse15B13V.getText());
                    ltp.setCPU("Intel i9 - 13900H");
                    ltp.setGPU("RTX 4070 LAPTOP GPU 8GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();
                    PulseEdit.setSelected(true);
                    PulseEdit.setVisible(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else //MSI BRAVO 15 C7V
            if (event.getSource() == BravoEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSIBRAVO15C7V.getText());
                    ltp.setCPU("AMD RYZEN 7 7735HS");
                    ltp.setGPU("RTX 4050 LAPTOP GPU 6GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();
                    BravoEdit.setSelected(true);
                    BravoEdit.setVisible(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else //MSI Titan GT77 HX13V
            if (event.getSource() == TitanEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSITitanGT77HX13V.getText());
                    ltp.setCPU("Intel i9 - 13980HX");
                    ltp.setGPU("RTX 4090 LAPTOP GPU 16GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();
                    TitanEdit.setSelected(true);
                    TitanEdit.setVisible(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else //MSI Katana 17 B13VFK
            if (event.getSource() == KatanaEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSIKatana17B13VFK.getText());
                    ltp.setCPU("Intel i9 - 13900H");
                    ltp.setGPU("RTX 4060 LAPTOP GPU 8GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();
                    KatanaEdit.setSelected(true);
                    KatanaEdit.setVisible(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
