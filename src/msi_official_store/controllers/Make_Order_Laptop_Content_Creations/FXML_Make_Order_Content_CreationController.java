/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Make_Order_Laptop_Content_Creations;

import Models.Laptop.Laptop;
import Models.Laptop.Update.Price_Update;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import msi_official_store.controllers.Recives.FXML_RecivesController;
import msi_official_store.controllers.Update.FXMLUpdatePriceController;

/**
 * FXML Controller class
 *
 * @author mariq
 */
public class FXML_Make_Order_Content_CreationController implements Initializable {

    Laptop ltp = new Laptop();
    public static Price_Update pudt = new Price_Update();

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
    @FXML
    private ToggleButton CreatorZ16VETO;
    @FXML
    private ToggleButton CreatorZ17Edit;
    @FXML
    private ToggleButton CreatorM16;
    @FXML
    private ToggleButton CreatorZ16vgtoEdit;
    @FXML
    private ToggleGroup Edits;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        //MSI Creator Z16 HX Studio B13VETO
        pudt.setMSICreatorZ16HXStudioB13VETOPrice(3060.25);
        //MSI Creator Z17 HX Studio A13V
        pudt.setMSICreatorZ17HXStudioA13VPrice(3571.43);
        //MSI Creator M16 B13VE
        pudt.setMSICreatorM16B13VEPrice(1594.39);
        //MSI Creator Z16HX Studio B13VGTO
        pudt.setMSICreatorM16B13VEPrice(1594.39);
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
    private void Laptop_Creator_Creation(ActionEvent event) {
        //MSI Creator Z16 HX Studio B13 VETO
        if (event.getSource() == MSICreatorZ16HXStudioB13VETO) {

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
                ltp.setModels(MSICreatorZ16HXStudioB13VETO.getText());
                ltp.setCPU("Intel i7 - 13700HX");
                ltp.setGPU("RTX 4060 LAPTOP GPU, 8GB GDD6");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ16HXStudioB13VETO.setSelected(true);
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
                ltp.setModels(MSICreatorZ17HXStudioA13V.getText());
                ltp.setCPU("Intel i9 - 13950HX");
                ltp.setGPU("RTX 4070 LAPTOP GPU, 8GB GDD6");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ17HXStudioA13V.setSelected(true);

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
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSICreatorM16B13VE.getText());
                ltp.setCPU("Intel i7 - 13700H");
                ltp.setGPU("RTX 4050 LAPTOP GPU, 6GB GDD6");
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
                MSICreatorM16B13VE.setSelected(true);
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
                ltp.setModels(MSICreatorZ16HXStudioB13VGTO.getText());
                ltp.setCPU("Intel i7 - 13700HX");
                ltp.setGPU("RTX 4060 LAPTOP GPU, 8GB GDD6");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSICreatorZ16HXStudioB13VGTO.setSelected(true);

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

            //MSI Creator Z16 HX Studio B13 VETO
            if (event.getSource() == CreatorZ16VETO) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSICreatorZ16HXStudioB13VETO.getText());
                    ltp.setCPU("Intel i7 - 13700HX");
                    ltp.setGPU("RTX 4060 LAPTOP GPU, 8GB GDD6");
                    price_updater.getdata(ltp);
                    System.out.println(pudt.getMSICreatorZ16HXStudioB13VETOPrice());
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    CreatorZ16VETO.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else //MSI Creator Z17 HX Studio A13V
            if (event.getSource() == CreatorZ17Edit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSICreatorZ17HXStudioA13V.getText());
                    ltp.setCPU("Intel i9 - 13950HX");
                    ltp.setGPU("RTX 4070 LAPTOP GPU, 8GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    CreatorZ17Edit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else //MSI Creator M16 B13VE
            if (event.getSource() == CreatorM16) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSICreatorM16B13VE.getText());
                    ltp.setCPU("Intel i7 - 13700H");
                    ltp.setGPU("RTX 4050 LAPTOP GPU, 6GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    CreatorZ17Edit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else //MSI Creator Z16HX Studio B13VGTO
            if (event.getSource() == CreatorZ16vgtoEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSICreatorZ16HXStudioB13VGTO.getText());
                    ltp.setCPU("Intel i7 - 13700HX");
                    ltp.setGPU("RTX 4060 LAPTOP GPU, 8GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();
                    CreatorZ17Edit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
