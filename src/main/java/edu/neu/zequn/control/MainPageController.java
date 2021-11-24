package edu.neu.zequn.control;

import java.io.IOException;

import edu.neu.zequn.factory.ImagePropertyFactory;
import edu.neu.zequn.factory.ProFileImageFactory;
import edu.neu.zequn.model.Image;
import edu.neu.zequn.model.ProfileImage;
import edu.neu.zequn.view.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

import edu.neu.zequn.factory.SingletonFilePathFactory;
import edu.neu.zequn.factory.SingletonUpdateImageFactory;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.input.NullInputStream;
import org.controlsfx.control.action.Action;
// import org.w3c.dom.Text;
import javafx.scene.text.Text;
import javafx.scene.control.MenuItem;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MainPageController {


    private FileChooser file_chooser;
    private File file_path;

    @FXML
    private ImageView image_view;

    @FXML
    private Text name_text;

    @FXML
    private Text height_text;

    @FXML
    private Pane main_page;

    @FXML
    private Text width_text;

    @FXML
    private Text path_text;

    @FXML
    private Text type_text;


    @FXML
    private javafx.embed.swing.SwingFXUtils SwingFXUtils;

    @FXML
    private MenuButton convert_btn;

    @FXML
    private MenuItem jpg_btn;

    @FXML
    private MenuItem png_btn;


    /*
     * Function invoke when upload button is clicked
     */
    @FXML
    protected void onUploadButtonClick(ActionEvent event){

        // call singleton factory of FilePath to get instance
        FilePathController fpc = SingletonFilePathFactory.getInstance();
        // call openFilePath function to open the file path system
        file_path = fpc.openFilePath(event, file_chooser, file_path);

        // use try-catch to avoid null input
        // which means user doesn't select image from file path
        // so that the file_path variable would be null

        // Upload Image
        try {
            // call singleton factory of UpdateImage to get instance
            UpdateImageController uic = SingletonUpdateImageFactory.getInstance();
            // call UpdateImage function to update image view in panel
            uic.UpdateImage(file_path, image_view);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Get Image View Object
        ProfileImage image = null;
        try {
            // call factory to get profile image instance
            ProFileImageFactory pfif = new ProFileImageFactory();
            image = pfif.getObject(image_view);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Parse Image Property
        ImagePropertyController ipc = null;
        try {
            // call factory to get the image property instance
            ImagePropertyFactory ipf = new ImagePropertyFactory();
            ipc = ipf.getObject(image, file_path);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // Update Property in panel
        try {
            // display the image property
            // use ImagePropertyController
            name_text.setText(ipc.getName()); // get image file name
            height_text.setText(ipc.getHeight()); // get image file height
            width_text.setText(ipc.getWidth()); // get image file width
            type_text.setText(ipc.getType()); // get image file type
            path_text.setText(ipc.getPath());
            ; // get image file path
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    /*
     * Function invoke when conversion jpg clicked
     */
    @FXML
    protected void onJpgConversionClick() {
        // call function to convert image
        // includes try-catch
        ConvertJpgController.convertJpg(file_path);
    }

    /*
     * Function invoke when conversion png clicked
     */
    @FXML
    protected void onPngConversionClick(){
        // call function to convert image
        // includes try-catch
        ConvertPngController.convertPng(file_path);
    }

    /*
     * Function invoke when reset button clicked
     */
    @FXML
    protected void onResetButtonClick(){
        // call function to reset default profile
        // includes try-catch
        ResetController.resetProfile(image_view);
    }

    /*
     * Function invoke when back button clicked
     */
    @FXML
    protected void onBackButtonClick(ActionEvent event){
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
