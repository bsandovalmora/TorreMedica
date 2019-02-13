/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    
    public static Connection cn = null; // variable de conexion
    public static Statement st = null;  // variable de instruccion SQL
    public static ResultSet rs = null; // variable de registros o filas
    
 public List<ProductosVO> consulta(){
        
        List<ProductosVO>lista=new ArrayList<ProductosVO>();
        
        try {
         String connectionUrl = "jdbc:sqlserver://LAPTOP-LEUPO3EJ\\SQL_BRANDON:1433;" +
            "databaseName=ADAPEX; user=sa; password=1234;"; 
         //String connectionUrl = "jdbc:sqlserver://LAPTOP-LEUPO3EJ\\SQL_BRANDON:1433;databasename=prueba_1;integratedSecurity=true";
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           //return(DriverManager.getConnection(connectionUrl));          
           
            cn = DriverManager.getConnection(connectionUrl);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sql = "Select * from productos";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                ProductosVO vo = new ProductosVO();
                vo.setId(rs.getInt("id"));
                vo.setNombre(rs.getString("nombre"));
                vo.setImg(rs.getString("img").trim());
                vo.setValor(rs.getInt("valor"));
                vo.setPeso(rs.getInt("peso"));
                vo.setDescp(rs.getString("descp"));
                lista.add(vo);
            }
            
      
        }catch (ClassNotFoundException | SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    
    
}