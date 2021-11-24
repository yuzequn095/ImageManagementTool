package edu.neu.zequn.control;

import edu.neu.zequn.view.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ReadmePageController {

    @FXML
    private Button back_btn;

    @FXML
    void onBackButtonClick(ActionEvent event) {
        try {
            // load fxml page
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-page.fxml"));
            // fxmlLoader.setLocation(getClass().getResource("checklist-page.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Welcome!");
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
