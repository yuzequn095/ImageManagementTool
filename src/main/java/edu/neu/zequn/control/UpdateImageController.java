package edu.neu.zequn.control;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * class to control the action of upload image
 */
public class UpdateImageController {

    // default constructor
    public UpdateImageController() {}

    /*
     * Function to allow users upload image in given file path
     *  and update the image in panel
     */
    public void UpdateImage(File file_path, ImageView image_view){

        // if no image be chosen
        if(file_path == null){
            return;
        }

        // try catch to avoid exception
        try{
            // use buffer to get image choose
            BufferedImage bufferedImage = ImageIO.read(file_path);
            WritableImage writable = SwingFXUtils.toFXImage(bufferedImage, null);
            // when uploaded, show image(s) thumbnail(s) (100x100) to users on GUI
            image_view.setFitHeight(100);
            image_view.setFitWidth(100);
            // update image
            image_view.setImage(writable);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
