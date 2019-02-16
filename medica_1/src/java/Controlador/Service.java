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
     List<UsuariosVO> lista=new ArrayList<UsuariosVO>();

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
    
    public String insertar(){
        ArrayList<String> params = new ArrayList<String>();
        params.add(0,vo.getNombre());
        params.add(1,vo.getApellidos());
        params.add(2,Integer.toString(vo.getEdad()));
        params.add(3,vo.getCorreo());
        params.add(4,vo.getDireccion());
        params.add(5,vo.getN_user());
        params.add(6,vo.getPass()); 
        DatabaseContext data = new DatabaseContext();
        
        data.SQLProcedure(params, "CRUD_Usuario");
        return SUCCESS;
    }
    
    
}
