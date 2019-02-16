/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.*;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;



public class Service extends ActionSupport{

    UsuariosVO vo=new UsuariosVO();
    ServiciosVO vo_servicio = new ServiciosVO();
    
     List<UsuariosVO> lista=new ArrayList<UsuariosVO>();

    public ServiciosVO getVo_servicio() {
        return vo_servicio;
    }

    public void setVo_servicio(ServiciosVO vo_servicio) {
        this.vo_servicio = vo_servicio;
    }

    public List<ServiciosVO> getLista_servicio() {
        return lista_servicio;
    }

    public void setLista_servicio(List<ServiciosVO> lista_servicio) {
        this.lista_servicio = lista_servicio;
    }
     List<ServiciosVO> lista_servicio=new ArrayList<ServiciosVO>();

    public List<UsuariosVO> getLista() {
        return lista;
    }

    public void setLista(List<UsuariosVO> lista) {
        this.lista = lista;
    }

    public UsuariosVO getVo() {
        return vo;
    }

    public void setVo(UsuariosVO vo) {
        this.vo = vo;
    }
    
    @Override
    //consulta
    public String execute() throws Exception {
        
        UsuariosDAO dao = new UsuariosDAO();
        
        lista = dao.consulta();
        
        return SUCCESS;
    }
    
    public String consultar_servicio(){
        ServiciosDAO dao = new ServiciosDAO();
        
        lista_servicio=dao.consulta();
        
        return SUCCESS;
    }
    
    public String insertar(){
        
        UsuariosDAO dao = new UsuariosDAO();
        
        dao.InsertarUsuario(vo);
        dao.InsertarCredencial(vo);
             
        return SUCCESS;
    }
    
    
}
