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
import java.sql.PreparedStatement;

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
                vo.setDireccion(rs.getString("_Dirreccion"));
               
                lista.add(vo);
            }
            
      
        }catch (SQLException e)
      
        {
        System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    public boolean InsertarUsuario(UsuariosVO d){
        boolean resultado = false;
        try {
            
            String sql = "INSERT INTO Usuario(_nombre,_Apellidos,_Edad,_Dirreccion) VALUES (?,?,?,?);";
            
            con = cn.getConexion();
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getApellidos());
            ps.setInt(3, d.getEdad());
            ps.setString(4, d.getDireccion());
                      
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
    
    public boolean InsertarCredencial(UsuariosVO d){
        boolean resultado = false;
        try {
            
            String sql = "INSERT INTO credenciales(IDUsuario,_Usuario,_password,_tipo) VALUES (?,?,?,?);";
            
            con = cn.getConexion();
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, d.getId());
            ps.setString(1, d.getN_user());
            ps.setString(1, d.getPass());
            ps.setString(1, "1");
            
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
