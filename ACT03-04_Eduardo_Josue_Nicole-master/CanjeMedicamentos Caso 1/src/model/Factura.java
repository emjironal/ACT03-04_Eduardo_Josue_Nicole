/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nicole
 */
public class Factura {
    
    private String id;
    private Farmacia farmacia;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<Producto> productos;

    public Factura(String id, Farmacia farmacia, Cliente cliente, Date fecha) {
        this.id = id; 
        this.farmacia = farmacia;
        this.cliente = cliente;
        this.fecha = fecha;
        productos = new ArrayList<>();
    }
    
    public Factura(){
        productos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void addProducto(Producto otroProducto){
        this.productos.add(otroProducto);
    }
    
    
    
    
    
}
