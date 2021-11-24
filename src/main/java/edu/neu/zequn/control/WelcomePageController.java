package edu.neu.zequn.control;

import edu.neu.zequn.view.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomePageController {

    @FXML
    private Button readme_btn;

    @FXML
    private Button launch_btn;

    /*
     * Function invoke when read me button clicked
     */
    @FXML
    void onReadmeButtonClick(ActionEvent event) {
        try {
            // load fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("checklist-page.fxml"));
            // fxmlLoader.setLocation(getClass().getResource("checklist-page.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("README");
            stage.setScene(scene);
            stage.show();

            // hide current page
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Function invoke when launch button click
     * Will launch the main application
     */
    @FXML
    void onLaunchButtonClick(ActionEvent event){
        try {
            // load fxml page
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-page.fxml"));
            // fxmlLoader.setLocation(getClass().getResource("checklist-page.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 441, 374);
            Stage stage = new Stage();
            stage.setTitle("Image Management Tool");
            stage.setScene(scene);
            stage.show();

            // hide current page
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
