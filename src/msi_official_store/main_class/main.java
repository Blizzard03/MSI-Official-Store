/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package msi_official_store.main_class;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author mariq
 */
public class main extends Application {

    @Override
    public void start(Stage stg) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/msi_official_store/FXML/splash_screen/splashscreen.fxml"));

        Scene scene = new Scene(root);
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
