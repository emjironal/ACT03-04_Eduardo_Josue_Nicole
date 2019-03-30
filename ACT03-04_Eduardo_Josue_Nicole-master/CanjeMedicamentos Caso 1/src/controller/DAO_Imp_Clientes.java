/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author jd_cm
 */
public class DAO_Imp_Clientes implements DAOInterface {
    
    List<Cliente> baseDatosClientes = new ArrayList<>();

    @Override
    public boolean registrar(Object obj) {
        Cliente clienteRegistrado = (Cliente) obj;
        for(Cliente c: baseDatosClientes){
            if(c.getEmail() == clienteRegistrado.getEmail()) return false;
        }
        baseDatosClientes.add(clienteRegistrado);
        return true;
    }
    

    @Override
    public List recuperar() {
        return baseDatosClientes;
    }

    @Override
    public Object recuperar(Object clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
