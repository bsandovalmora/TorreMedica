/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ServiciosDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    Statement st = null;  // variable de instruccion SQL
    ResultSet rs = null; // variable de registros o filas

    ServiciosVO vo = new ServiciosVO();
    
    
    public List<ServiciosVO> consulta(){
        
        List<ServiciosVO>lista=new ArrayList<ServiciosVO>();
        
        try {
            con = cn.getConexion();
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sql = "SELECT * FROM servicios";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                ServiciosVO vo = new ServiciosVO();
                vo.setId(rs.getInt("IDServicios"));
                vo.setTipo(rs.getString("_Tipo"));
                vo.setDescrip(rs.getString("_descrip"));
                vo.setCosto(rs.getInt("_delete"));
               
                lista.add(vo);
            }
            
      
        }catch (SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    
    
}
