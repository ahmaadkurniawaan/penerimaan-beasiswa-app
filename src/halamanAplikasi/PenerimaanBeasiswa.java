/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halamanAplikasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ahmad Kurniawan
 */


public class PenerimaanBeasiswa {
    
    
//    public static void main (String[] args){
//
//    new MainView().setVisible(true);
//    
//}
    
    
    
    private static Connection MYSQLConfig;
        
        
    public static Connection ConfigDB() throws SQLException{
        
        try{
            String url = "jdbc:mysql://localhost:3306/SI-PenerimaanBeasiswa";
            String user = "root";
            String password = "";

            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url,user,password);
            
        }catch(SQLException e){
        
            System.out.println("Koneksi Database Gagal !!! " + e.getMessage());
        
    }
        
        return MYSQLConfig;
        
    }   

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}

