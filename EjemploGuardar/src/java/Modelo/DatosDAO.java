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
import Modelo.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class DatosDAO {
    Conexion cn=new Conexion();
    Connection con;
    Statement st = null;  // variable de instruccion SQL
    ResultSet rs = null; // variable de registros o filas
    DatosVO vo = new DatosVO();
    
    public List<DatosVO> consulta(){
        
        List<DatosVO>lista=new ArrayList<DatosVO>();
        
        try {
            con = cn.getConexion();
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sql = "Select * from PROVINCIAS";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                DatosVO vo = new DatosVO();
                vo.setId(rs.getInt("ID_PROVINCIA"));
                vo.setNombre(rs.getString("NOMBRE"));
               
                lista.add(vo);
            }
            
      
        }catch (SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    
    public boolean Insertar(DatosVO d){
        boolean resultado = false;
        try {
            
            String sql = "INSERT INTO PROVINCIAS(NOMBRE) VALUES (?);";
            
            con = cn.getConexion();
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, d.getNombre());
            
            if(ps.executeUpdate()==1){
                resultado = true;
                ps.close();
                con.close();
            }
      
        }catch (SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        return resultado;
    }
}
