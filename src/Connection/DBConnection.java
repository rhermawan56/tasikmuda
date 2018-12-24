/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RizkyHermawan
 */
public class DBConnection {

    public static Connection DB() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "";
            String user = "";
            String pass = "";
            Connection koneksi = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Database Terhubung");
            return koneksi;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Connection Lose");
            return null;
        }
    }
}
