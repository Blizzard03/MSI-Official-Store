/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package msi_official_store.controllers.Make_Order_Laptop_Business_Productivity;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class FXML_Make_Order_Business_Productivity_Controller implements Initializable {

    public static Price_Update pudt = new Price_Update();
    Laptop ltp = new Laptop();

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
    @FXML
    private ToggleButton Summitedit;
    @FXML
    private ToggleButton Modern14Edit;
    @FXML
    private ToggleButton Modern15Edit;
    @FXML
    private ToggleButton PresitageEdit;
    @FXML
    private ToggleGroup Edits;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //MSI Summit E14 Flip Evo A13M
        pudt.setMSISummitE14FlipEvoA13MPrice(1657.63);
        //MSI Modern 14 C7M
        pudt.setMSIModern14C7MPrice(573.98);
        //MSI Prestige 14 HB13UCX
        pudt.setMSIPrestige14HB13UCXPrice(1211.73);
        //MSI Modern 15 B13M
        pudt.setMSIModern15B13MPrice(701.53);

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
    private void Laptop_Business_Productivity(ActionEvent event) {
        //MSI Summit E14 Flip Evo - A13M
        if (event.getSource() == MSISummitE14FlipEvoA13M) {
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
                ltp.setModels(MSISummitE14FlipEvoA13M.getText());
                ltp.setCPU("Intel i7 - 13600P");
                ltp.setGPU("Iris Xe Graphic");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSISummitE14FlipEvoA13M.setSelected(true);

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
                ltp.setModels((MSIModern14C7M.getText()));
                ltp.setCPU("AMD RYZEN 5 7530U");
                ltp.setGPU("AMD Radeon™ Graphics");
                Receive.showInfo(ltp);
                stg.setTitle("Receipt");
                stg.initModality(Modality.APPLICATION_MODAL);
                stg.setResizable(false);
                stg.setIconified(false);
                stg.setScene(scene);
                stg.show();
                Menu_Order.getScene().getWindow().hide();
                MSIModern14C7M.setSelected(true);

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
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSIPrestige14HB13UCX.getText());
                ltp.setCPU("Intel i7 - 13620H");
                ltp.setGPU("RTX 2050 LAPTOP GPU, 4GB GDD6");
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
                MSIPrestige14HB13UCX.setSelected(true);

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
                FXML_RecivesController Receive = loader.getController();
                ltp.setModels(MSIModern15B13M.getText());
                ltp.setCPU("Intel i5 - 1335U");
                ltp.setGPU("Intel Iris Xe Graphics");
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
                MSIModern15B13M.setSelected(true);

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
            //MSI Summit E14 Flip Evo A13M
            if (event.getSource() == Summitedit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSISummitE14FlipEvoA13M.getText());
                    ltp.setCPU("Intel i7 - 13600P");
                    ltp.setGPU("Iris Xe Graphic");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    Summitedit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else ////MSI Modern 14 C7M
            if (event.getSource() == Modern14Edit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels((MSIModern14C7M.getText()));
                    ltp.setCPU("AMD RYZEN 5 7530U");
                    ltp.setGPU("AMD Radeon™ Graphics");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    Modern14Edit.setSelected(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else //MSI Modern 15 B13M
            if (event.getSource() == Modern15Edit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSIModern15B13M.getText());
                    ltp.setCPU("Intel i5 - 1335U");
                    ltp.setGPU("Intel Iris Xe Graphics");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    Modern15Edit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else //MSI Prestige 14 H B13UCX
            if (event.getSource() == PresitageEdit) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/msi_official_store/FXML/Update/FXMLUpdatePrice.fxml"));
                    Parent root = (Parent) loader.load();
                    Scene scene = new Scene(root);
                    Stage stg = new Stage();
                    FXMLUpdatePriceController price_updater = loader.getController();
                    ltp.setModels(MSIPrestige14HB13UCX.getText());
                    ltp.setCPU("Intel i7 - 13620H");
                    ltp.setGPU("RTX 2050 LAPTOP GPU, 4GB GDD6");
                    price_updater.getdata(ltp);
                    stg.setTitle("Price Update");
                    stg.setResizable(false);
                    stg.setIconified(false);
                    stg.setScene(scene);
                    stg.show();

                    PresitageEdit.setSelected(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
