/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Service extends ActionSupport{
    List<DatosVO> lista=new ArrayList<DatosVO>();
    DatosVO vo= new DatosVO();

    public List<DatosVO> getLista() {
        return lista;
    }

    public void setLista(List<DatosVO> lista) {
        this.lista = lista;
    }

    public DatosVO getVo() {
        return vo;
    }

    public void setVo(DatosVO vo) {
        this.vo = vo;
    }
    
   
    
    @Override
    public String execute() throws Exception {
        DatosDAO dao = new DatosDAO();
        
        lista = dao.consulta();
        return "success";
    }
    
    public String insertar(){
        DatosDAO dao = new DatosDAO();
        dao.Insertar(vo);
        
        return "success";
    }
}
