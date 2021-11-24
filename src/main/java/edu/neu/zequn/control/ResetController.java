package edu.neu.zequn.control;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ResetController {

    // path to default profile image
    private static String default_profile_path = "src/main/resources/edu/neu/zequn/view/default-image.jpeg";

    public static void resetProfile(ImageView image_view){
        // try catch to avoid exception
        try{
            // get the default profile
            InputStream stream = new FileInputStream(default_profile_path);
            Image image = new Image(stream);

            // when uploaded, show image(s) thumbnail(s) (100x100) to users on GUI
            image_view.setFitHeight(100);
            image_view.setFitWidth(100);
            // update image
            image_view.setImage(image);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
