/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chessimal12;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class DB {

    private static Connection con;

    public static Connection getMyConnection() throws Exception {
        dbprops db = new dbprops();

        String usrname = db.getProperty("SqlUserName");
        String password = db.getProperty("SqlPassword");
        String port = db.getProperty("SqlPort");
        String host = db.getProperty("Host");


        if (con != null) {

            return con;
        } else {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/chessimalDB", usrname, password);

            return con;
        }
    }

    public static void ChangeJframeImage(JFrame a) {
        try {
            BufferedImage image = ImageIO.read(a.getClass().getResource("/Images/chess.png"));
            a.setIconImage(image);
            a.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
