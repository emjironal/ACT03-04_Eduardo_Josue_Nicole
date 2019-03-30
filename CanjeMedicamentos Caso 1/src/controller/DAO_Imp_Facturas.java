/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Factura;

/**
 *
 * @author Nicole
 */
public class DAO_Imp_Facturas implements DAOInterface {

    @Override
    public boolean registrar(Object obj) {
        Factura laFactura = (Factura) obj;
        
        System.out.println(" aqui se inserta la factura en la BD");
        return true;
    }

    @Override
    public List recuperar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object recuperar(Object clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
