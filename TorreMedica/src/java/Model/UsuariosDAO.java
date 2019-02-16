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
import Model.*;

/**
 *
 * @author Usuario
 */
public class UsuariosDAO {
    Conexion cn=new Conexion();
    Connection con;
    Statement st = null;  // variable de instruccion SQL
    ResultSet rs = null; // variable de registros o filas
    UsuariosVO vo = new UsuariosVO();
    
    public List<UsuariosVO> consulta(){
        
        List<UsuariosVO>lista=new ArrayList<UsuariosVO>();
        
        try {
            con = cn.getConexion();
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            
            String sql = "SELECT * FROM Usuario";
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                UsuariosVO vo = new UsuariosVO();
                vo.setId(rs.getInt("IDUsuario"));
                vo.setNombre(rs.getString("_nombre"));
                vo.setApellidos(rs.getString("_Apellidos"));
                vo.setEdad(rs.getInt("_Edad"));
                vo.setDireccion(rs.getString("_Direccion"));
               
                lista.add(vo);
            }
            
      
        }catch (SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
}
