/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author noniko
 */
public class mysql {
   
  public static void main(String[] argv) throws Exception {
//     String driver = "com.mysql.jdbc.Driver";
//        String connection = "jdbc:mysql://localhost:3306/hostel";
//        String user = "root";
//        String password = "alpha7*";
//        Connection conn=null;
//            Class.forName(driver);
//        try {
//             conn = DriverManager.getConnection(connection, user, password);
//        } catch (SQLException e) {
//            System.out.println("ERROR: Unable to Connect to Database.");
//        }
//        
//        
//        Statement stmt = conn.createStatement();
//      String sql;
//      sql = "SELECT * from absent";
//      ResultSet rs = stmt.executeQuery(sql);
//    if (!conn.isClosed()) {
//            conn.close();
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loon().setVisible(true);
            }
        });
        
    }
}
