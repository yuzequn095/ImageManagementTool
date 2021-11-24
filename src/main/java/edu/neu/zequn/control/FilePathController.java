package edu.neu.zequn.control;

import javafx.scene.Node;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

// import java.awt.event.ActionEvent;
import javafx.event.ActionEvent;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Class to control the action of image files choose
 */
public class FilePathController {

    // default constructor
    public FilePathController() {}

    /*
     * Function to allow users open file path to search image
     */
    public File openFilePath(ActionEvent event, FileChooser file_chooser, File file_path){

        // set the stage object for JavaFX
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        // Set FileChooser object
        file_chooser = new FileChooser();
        file_chooser.setTitle("Open Image");

        // Get the current directory as default path
        Path currentRelativePath = Paths.get("");
        String default_path = currentRelativePath.toAbsolutePath().toString();
        // System.out.println("Current absolute path is: " + s);

        // Set the default file path
        String userDirectoryString = default_path;
        File userDirectory = new File(userDirectoryString);

        // if default path is invalid, use home
        if(!userDirectory.canRead()){
            userDirectory = new File("user.home");
        }

        // Open file choose in new dialog
        file_chooser.setInitialDirectory(userDirectory);
        file_path = file_chooser.showOpenDialog(stage);

        return file_path;
    }

}
