/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bulibrary;
import java.sql.*;

public class DBConnect {
     private Connection conn;
     private Statement st;
     private String url = "jdbc:mysql://localhost:3306/bulibrarydatabeses";
     private String user = "root";
     private String password = "";
     
     public ResultSet getResult(String query)  {
         ResultSet rs;
         try{
             conn = DriverManager.getConnection(url,user,password);
             st = conn.createStatement();
             rs = st.executeQuery(query);
         }catch(Exception ex){
             rs = null;
         }
        return rs;
    }
     
     public boolean execute(String query){
         boolean rs;
         try{
             conn = DriverManager.getConnection(url,user,password);
             st = conn.createStatement();
             st.execute(query);
             rs = true;
         }catch(Exception ex){
             rs = false;
         }
         return rs;
     }
     
     public void close(){
         try{
             conn.close();
         }catch(Exception ex){
             System.out.print("Can't close");
         }
     }
}
