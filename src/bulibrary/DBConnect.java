/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bulibrary;
import java.sql.*;

public class DBConnect {
    private Connection conn;
    private PreparedStatement ps;
    private String url = "jdbc:mysql://localhost:3306/bulibrarydatabeses";
    private String user = "root";
    private String password = "";

    public ResultSet getResult(String query, String... params) {
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            ps = conn.prepareStatement(query);
            
            // Set parameters for PreparedStatement
            for (int i = 0; i < params.length; i++) {
                ps.setString(i + 1, params[i]);
            }
            
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public boolean execute(String query, String... params) {
        boolean success = false;
        try {
            conn = DriverManager.getConnection(url, user, password);
            ps = conn.prepareStatement(query);
            
            // Set parameters for PreparedStatement
            for (int i = 0; i < params.length; i++) {
                ps.setString(i + 1, params[i]);
            }
            
            success = ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return success;
    }

    public void close() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public PreparedStatement prepareStatement(String query) {
        PreparedStatement pstmt = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return pstmt;
    }

}

