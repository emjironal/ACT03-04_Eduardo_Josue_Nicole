/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Farmacia;

/**
 *
 * @author Eduardo Jirón
 */
public class GestorFarmacia
{
    private DAO_Imp_Farmacia elDAO;
    
    public GestorFarmacia(){
        elDAO = new DAO_Imp_Farmacia();
    }
    
    public boolean crearFarmacia (Farmacia unaFarmacia ){
        System.out.println("en el Gestor de farmacias solicitando registro de farmacia");
        return elDAO.registrar(unaFarmacia);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Farmacia consultarProducto(int codigo) {
        return (Farmacia) elDAO.recuperar(codigo);
    }
    
}
