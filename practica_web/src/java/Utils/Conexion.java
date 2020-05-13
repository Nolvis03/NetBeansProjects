/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PROHECO-UPE
 */
public class Conexion {
    
     public static Connection getConexion(){
    
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/practica2","root","MYSQL");
            System.out.print("Conexion Satisfactoria");
            
        } catch (Exception e) {System.out.println("Error de Conexion: "+e );}
        return cn;
        
        
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.getConexion();
    }
    
    public void desconectar() throws SQLException {
        if (!Conexion.getConexion().isClosed()) {
            Conexion.getConexion().close();
        }
    }
    
 
    
}
