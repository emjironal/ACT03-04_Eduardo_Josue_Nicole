/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Factura;
import model.Producto;

/**
 *
 * @author ericka
 */
public class Controlador {

    private static Controlador instance;
    private DTOProductos dTOProductos;
    private GestorProductos gProductos;
    private GestorCliente gCliente;
    private FacturaFactory factory;
    private DTOFarmacia dTOFarmacias;
    private GestorFarmacia gFarmacia;
    private GestorFacturas gFacturas;
    
    private Controlador() {
        gProductos = new GestorProductos();
        dTOProductos = new DTOProductos();
        gCliente = new GestorCliente();
        gFarmacia = new GestorFarmacia();
        factory = new FacturaFactory();
        dTOFarmacias = new DTOFarmacia();
        gFacturas = new GestorFacturas();
    }
    
    
    public static Controlador getInstance(){
        if(instance == null){
            instance = new Controlador();
        }
        return instance;
    }

    public DTOProductos getdTOProductos() {
        return dTOProductos;
    }
    
    public boolean registrarCliente(Cliente c){
        if(gCliente.crearCliente(c)){
            JOptionPane.showMessageDialog(null, "Registro", "El registro fue exitoso", JOptionPane.WARNING_MESSAGE);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Registro", "El cliente ya existe", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    public boolean registrarProducto(int codigo, String descripcion, int unidades, int puntos){
        return true;
        
    }

    public boolean registrarProducto(){
        System.out.println("en el Controlador solicitando registro de producto");
        
        return gProductos.crearProducto(dTOProductos.getUnProducto());
    }
    
    public void recuperarProductos(){
        dTOProductos.setLosProductos((List) gProductos.recuperar());
    }

    public boolean recuperarProducto() {
        Producto elPrd =  gProductos.consultarProducto(dTOProductos.getUnProducto().getCodigo());
        dTOProductos.setUnProducto(elPrd);
        return elPrd!=null;
        
    }
    
    public void recuperarFarmacias(){
        dTOFarmacias.setListaFarmacias((List)gFarmacia.recuperar());
    }

    public FacturaFactory getFactory() {
        return factory;
    }
    
    public DTOFarmacia getdTOFarmacias(){
        return dTOFarmacias;
    }
    
    public boolean registrarFactura(){
        gFacturas.registrarFactura(factory.getUnaFactura());
        return true;
    }
}
