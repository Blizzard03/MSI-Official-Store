/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package msi_official_store.main_class;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

   /*
    * READ ME
    *
    * FREATURES 
    *  1. Verification During : 
    *     a. Null Field
    *     b. Close Windows
    *     c. Reset Data
    *     d. Save Data
    *     e. Not Complete Task
    *  2. Print Invoice to TXT file format
    *  3. Update Price
    *  4. Modaless Update Price Form
    *  5. Add Models Class :
    *     a. Custumers
    *     b. Laptop
    *     c. Update Price
    *  6. One Print Invoice per created
    *  7. One Time Update Price
    */
/**
 *
 * @author mariq
 */
public class main extends Application {

    @Override
    public void start(Stage stg) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/msi_official_store/FXML/splash_screen/splashscreen.fxml"));

        Scene scene = new Scene(root);
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
        stg.setResizable(false);
        stg.setIconified(false);
        stg.setScene(scene);
        stg.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
