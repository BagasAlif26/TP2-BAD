/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalbad2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Personalbad2 { 
private static Connection MYSQLConfig;
    
    public static Connection ConfigDB() throws SQLException{
        
        try{
            
            String url  = "jdbc:mysql://localhost:3306/badtp2";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig = DriverManager.getConnection(url,user,pass);
            
           
            
        }catch(SQLException e){
            
            System.out.println("Koneksi Database Gagal !!!" + e.getMessage());
            
        }
        
        return MYSQLConfig;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}