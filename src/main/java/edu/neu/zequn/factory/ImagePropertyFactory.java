package edu.neu.zequn.factory;

import edu.neu.zequn.control.ImagePropertyController;
import edu.neu.zequn.model.ProfileImage;

import java.io.File;

/*
 * Factory to return the ImagePropertyFactory object
 */
public class ImagePropertyFactory {

    // passed in with ProfileImage object and File object
    public ImagePropertyController getObject(ProfileImage image, File file_path){
        return new ImagePropertyController(image, file_path);
    }
}
