/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Factura;
import model.Farmacia;

/**
 *
 * @author Nicole
 */
public class GestorFacturas {
    private DAO_Imp_Facturas elDAO;
    
    public GestorFacturas(){
        elDAO = new DAO_Imp_Facturas();
    }
    
    public boolean registrarFactura (Factura unaFactura ){
        System.out.println("en el Gestor de facturas solicitando registro de compra");
        return elDAO.registrar(unaFactura);
    }
    
    public List recuperar(){
        return elDAO.recuperar();
    }

    public Factura consultarFactura(int codigo) {
        return (Factura) elDAO.recuperar(codigo);
    }
}
