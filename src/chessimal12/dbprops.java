/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessimal12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Hashi
 */
public class dbprops extends Properties {

     File file = null;

    public dbprops() {
        try {
            file = new File("C:/Windows/Chess/chessprop.properties");
            
            FileInputStream fi = new FileInputStream(file);
           
            load(fi);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
}
