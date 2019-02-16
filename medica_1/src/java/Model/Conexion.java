/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private String url = "jdbc:sqlserver://LAPTOP-LEUPO3EJ\\SQL_BRANDON:1433;" +
            "databaseName=medica; user=sa; password=1234;"; 
    private String classname = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private Connection cn;
    
    public Conexion(){
        try{
            Class.forName(classname);
            cn = DriverManager.getConnection(url);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return cn;
    }
    
}
  
