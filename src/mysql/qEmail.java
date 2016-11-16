/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chinmay
 */
public class qEmail {
    static ResultSet rs;
    static MyDBConnection a= new MyDBConnection();
    static ArrayList<String[]> AL,AL2;
    static String sql;
    static java.sql.Statement stmt;
    
    public static void main() throws SQLException{
       
        try {
            if(!a.status)
                a.init();
             stmt = a.myConnection.createStatement();
            
            sql = "SELECT sid from el where cnt>=3";
            qEmail.rs = stmt.executeQuery(sql);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(qEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        AL=new ArrayList<String[]>();  
        AL2=new ArrayList<String[]>(); 
      try{
        while(rs.next()){
      
              String[] row={
                rs.getString("sid"),rs.getString("cnt")
          
            };
            
            AL.add(row);
      
         }   
      }
      catch(Exception e){
          System.out.println("Exception in ArrayList");
            }
        
        sql = "SELECT sid from el where cnt>=3";
            qEmail.rs = stmt.executeQuery(sql);
        
        //Old code
        System.out.println("Entry");
            GmailClient g = new GmailClient();
            g.sendGmail(g.senderUserName,"chinmayn96@yahoo.co.in","test","ABCDEFGH");
            System.out.println("Done");
    }
    
}
