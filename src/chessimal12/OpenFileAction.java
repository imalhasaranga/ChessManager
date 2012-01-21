/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chessimal12;

import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */


    public class OpenFileAction extends AbstractAction {
    JFrame frame;
    JFileChooser chooser;

    OpenFileAction(JFrame frame, JFileChooser chooser) {
        super("Open...");
        this.chooser = chooser;
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent evt) {
        // Show dialog; this method does not return until dialog is closed
        chooser.showOpenDialog(frame);

        // Get the selected file
        File file = chooser.getSelectedFile();
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    
};

