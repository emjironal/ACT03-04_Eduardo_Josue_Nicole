/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Cliente;
import model.Factura;
import model.Farmacia;

/**
 *
 * @author Nicole
 */
public class FacturaFactory {
    
    private List productosRegistrados;
    private Factura unaFactura;
    
    public FacturaFactory(){
        unaFactura = new Factura();
    }

    public Factura getUnaFactura() {
        return unaFactura;
    }

    public void setUnaFactura(Factura unaFactura) {
        this.unaFactura = unaFactura;
    }

    
    public List getProductosRegistrados() {
        return productosRegistrados;
    }

    public void setProductosRegistrados(List productosRegistrados) {
        this.productosRegistrados = productosRegistrados;
    }
    
   
    
}
