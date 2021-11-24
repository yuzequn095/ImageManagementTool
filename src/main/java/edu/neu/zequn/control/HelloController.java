package edu.neu.zequn.control;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/*
 * Created by intelliJ
 * Not used in this program actually
 */
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

}