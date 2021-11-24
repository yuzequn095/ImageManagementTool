package edu.neu.zequn.factory;

import edu.neu.zequn.control.FilePathController;
import edu.neu.zequn.control.UpdateImageController;

/*
 * Singleton Factory for File Path
 */
public class SingletonUpdateImageFactory {

    // get the singleton instance of UpdateImageController
    private static final UpdateImageController uic = new UpdateImageController();

    /*
     * Function to return the instance created
     */
    public static UpdateImageController getInstance(){
        return uic;
    }

}
