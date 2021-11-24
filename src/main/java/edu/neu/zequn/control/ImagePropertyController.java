package edu.neu.zequn.control;

import edu.neu.zequn.model.Image;
import edu.neu.zequn.model.ImageInfoAPI;
import edu.neu.zequn.model.ProfileImage;
import org.apache.commons.io.FilenameUtils;
import java.io.File;

// Controller to parse the property of image
public class ImagePropertyController implements ImageInfoAPI {

    // private field
    private ProfileImage image;
    private File file_path;
    private double width;
    private double height;
    private String name;
    private String path;
    private String type;

    // default constructor
    public ImagePropertyController(ProfileImage image, File file_path){
        setImage(image);
        setFile_path(file_path);
        setHeight();
        setWidth();
        setName();
        setPath();
        setType();
    }

    // getters and setteres
    public File getFile_path() {
        return file_path;
    }

    public void setFile_path(File file_path) {
        this.file_path = file_path;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(ProfileImage image) {
        this.image = image;
    }

    @Override
    public void setWidth() {
        this.width = image.getImageWidth();
    }

    @Override
    public String getWidth() {
        return "Width: " + this.width;
    }

    @Override
    public void setHeight() {
        this.height = image.getImageHeight();
    }

    @Override
    public String getHeight() {
        return "Height: " + this.height;
    }

    @Override
    public void setName() {
        this.name = FilenameUtils.getBaseName(file_path.getName());
    }

    @Override
    public String getName() {
        return "Name: " + this.name;
    }

    @Override
    public void setPath() {
        this.path = file_path.toString();
    }

    @Override
    public String getPath() {
        return "Path: " + this.path;
    }

    @Override
    public void setType() {
        this.type = FilenameUtils.getExtension(file_path.getName());
    }

    @Override
    public String getType() {
        return "Type: " + this.type;
    }

}
