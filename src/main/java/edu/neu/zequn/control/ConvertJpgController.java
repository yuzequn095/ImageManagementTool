package edu.neu.zequn.control;

import java.io.File;

/*
 * Class to convert chosen image to .jpg, rename it and save it
 */
public class ConvertJpgController {

    // set the reference path to help save converted image
    private static String ref_path = "src/main/resources/edu/neu/zequn/view/";
    // set id to rename images, allow save multiple times
    private static int id = 0;

    public static void convertJpg(File file_path){
        int i = 0;
        // try-catch to avoid case no image chosen
        try {
            // user javaxt io to get the current image
            javaxt.io.Image image = new javaxt.io.Image(file_path.toString());
            // convert to .ipg and rename it
            image.saveAs(ref_path + "conversion" + (id++) + ".jpg");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
