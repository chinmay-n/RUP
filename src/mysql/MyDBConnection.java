/*
 * MyDBConnection.java
 *
 * Created on 2005/01/16, 10:50
 */

package mysql;

import java.sql.*;

/**
 *
 * @author noniko
 */
public class MyDBConnection {
   
    public Connection myConnection;
    public boolean status=false;
    
    /** Creates a new instance of MyDBConnection */
    public MyDBConnection() {
       
    }

    public void init(){
    
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection(
                "jdbc:mysql://ec2-54-244-217-141.us-west-2.compute.amazonaws.com:3306/hostel","root", "000000"
                );
        System.out.println("Connected!");
        status=true;
       }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
               status=false;
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
               System.out.println("Closed!");      
         }
            catch(Exception e){}
        
        
    }
  }
//    public static void main(String args[]){
//        MyDBConnection a=new MyDBConnection();
//        a.init();
//        a.destroy();
//    }
}
