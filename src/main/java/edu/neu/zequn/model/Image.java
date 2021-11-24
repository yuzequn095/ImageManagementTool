package edu.neu.zequn.model;


import javafx.scene.image.ImageView;

/*
 * Abstract class for Image Object
 */
abstract public class Image {

    // private fields
    private ImageView image;

    // default constructor
    public Image(ImageView image){
        setImage(image);
    }

    // getters and setters
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    abstract public String printInfo();
}
