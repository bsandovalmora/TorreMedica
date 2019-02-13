/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ProductosDAO;
import Modelo.ProductosVO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class Service extends ActionSupport{
    ProductosVO vo = new ProductosVO();

    public ProductosVO getVo() {
        return vo;
    }

    public void setVo(ProductosVO vo) {
        this.vo = vo;
    }

    public List<ProductosVO> getLista() {
        return lista;
    }

    public void setLista(List<ProductosVO> lista) {
        this.lista = lista;
    }
    List<ProductosVO> lista=new ArrayList<ProductosVO>();

    @Override
    public String execute() throws Exception {
        ProductosDAO dao = new ProductosDAO();
        
        lista = dao.consulta();
        return SUCCESS;
    }
    
    
}
