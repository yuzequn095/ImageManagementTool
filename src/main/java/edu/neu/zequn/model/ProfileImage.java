package edu.neu.zequn.model;


import javafx.scene.image.ImageView;

/*
 * Profile Image object
 * Extends from Image as a child class
 */
public class ProfileImage extends Image{

    // private field
    private ImageView profile_image;
    private int image_height;
    private int image_width;

    // default constructor
    public ProfileImage(ImageView image){
        super(image);
        setProfile_image(image);
    }

    // getters and setters
    public ImageView getProfileImage() {
        return profile_image;
    }

    public void setProfile_image(ImageView profile_image) {
        this.profile_image = profile_image;
    }

    /*
     * Function to get image height
     */
    public double getImageHeight(){
        ImageView image = getProfileImage();
        return image.getFitHeight();
    }

    /*
     * Function to get image Width
     */
    public double getImageWidth(){
        ImageView image = getProfileImage();
        return image.getFitWidth();
    }

    // print image view information
    @Override
    public String printInfo() {
        return profile_image.toString();
    }
}
