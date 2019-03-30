/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;

/**
 *
 * @author jd_cm
 */
public class GestorCliente {
    
    private  DAO_Imp_Clientes elDAO;

    public GestorCliente() {
        this.elDAO = new DAO_Imp_Clientes();
    }
    
    public boolean crearCliente (Cliente cliente ){
        return elDAO.registrar(cliente);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }    
    
}
