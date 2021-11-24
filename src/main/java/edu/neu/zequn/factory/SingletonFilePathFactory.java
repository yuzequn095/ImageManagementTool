package edu.neu.zequn.factory;

import edu.neu.zequn.control.FilePathController;

/*
 * Singleton Factory for File Path
 */
public class SingletonFilePathFactory {

    // get the singleton instance of FilePathController
    private static final FilePathController fpc = new FilePathController();

    /*
     * Function to return the instance created
     */
    public static FilePathController getInstance(){
        return fpc;
    }
}
