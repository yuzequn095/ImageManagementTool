package edu.neu.zequn.factory;

import edu.neu.zequn.model.Image;
import edu.neu.zequn.model.ImageInfoAPI;
import edu.neu.zequn.model.ProfileImage;
import javafx.scene.image.ImageView;

/*
 * Factory to get the object of ProfileImage
 */
public class ProFileImageFactory {

    // passed in with ImageView object
    public ProfileImage getObject(ImageView image_view){
        return new ProfileImage(image_view);
    }

}
