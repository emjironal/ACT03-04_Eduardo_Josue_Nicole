/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Farmacia;

/**
 *
 * @author ericka
 */
public class DAO_Imp_Farmacia implements DAOInterface{
    
    private ArrayList<Farmacia> lFarmacia = new ArrayList<>();

    public DAO_Imp_Farmacia() {
        for(int i=0;  i<10;i++){
            lFarmacia.add(new Farmacia(i, "Farmacia"+i,"2000000"+i));
        }
    }
    
    @Override
    public boolean registrar(Object obj) {
        Farmacia laFarmacia = (Farmacia) obj;
        
        System.out.println(" aqui se inserta la farmacia en la BD");
        return true;
        
        
    }

    @Override
    public List recuperar() {
        Conexion.getInstance().getConexion();
        // la magia de la recuperacion
        
        // simula que hace el select from.... 
        
        Conexion.getInstance().desconectar();
        return lFarmacia;
    }

    @Override
    public Object recuperar(Object clave) {
        int codigo = (int) clave;
        Conexion.getInstance().getConexion();

        // la magia de la recuperacion por id
        Farmacia laFarm = new Farmacia();
        laFarm.setCodigo(codigo);
        int donde = lFarmacia.indexOf(laFarm);
        
        Conexion.getInstance().desconectar();
        return (donde != -1 ? lFarmacia.get(donde) : null); 
    }
    
}
