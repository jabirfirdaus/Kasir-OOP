/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasir;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class dbconnect {
    private static java.sql.Connection dbconnect;
    
    public static java.sql.Connection getdbconnect(){
        if (dbconnect == null ) {
            try{
                String url = "jdbc:mysql://localhost/kasir";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                dbconnect = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Terhubung");
            }catch (Exception e){
                System.out.println("Gagal Terhubung");
            }
            }
            return dbconnect;
        } 
        public static void main (String args[]){
            getdbconnect();
    }
}
