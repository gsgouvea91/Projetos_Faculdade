/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.io.File;
import java.io.FilenameFilter;

public class FindCertainExtension {

    public File[] finder(String dirName){
        File dir = new File(dirName);
        
        return dir.listFiles(new FilenameFilter() { 
                 public boolean accept(File dir, String filename)
                      { return filename.endsWith(".txt"); }
        } );

    }

}
