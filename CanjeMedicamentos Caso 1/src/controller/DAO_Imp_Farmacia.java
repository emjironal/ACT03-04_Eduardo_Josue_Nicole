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
public class DAO_Imp_Farmacia implements DAOInterface
{
    private static ArrayList<Farmacia> farmaciasDB = new ArrayList<>();
    @Override
    public boolean registrar(Object obj) {
        Farmacia laFarmacia = (Farmacia) obj;
        farmaciasDB.add(laFarmacia);
        System.out.println(" aqui se inserta la farmacia en la BD");
        return true;
        
        
    }

    @Override
    public List recuperar()
    {
        //Se conecta
        Conexion dbConexion = Conexion.getInstance();
        //Hace sus trabajos
        //Se desconecta
        dbConexion.desconectar();
        //Devuelve las farmacias de la db
        return farmaciasDB;
    }

    @Override
    public Object recuperar(Object clave)
    {
        //Se conecta
        Conexion dbConexion = Conexion.getInstance();
        //Hace sus trabajos
        for(Farmacia farmacia : farmaciasDB)
        {
            if(farmacia.getCodigo() == (Integer)clave)
            {
                //Se desconecta
                dbConexion.desconectar();
                //Devuelve la farmacia de la db
                return farmacia;
            }
        }
        //Se desconecta
        dbConexion.desconectar();
        //Devuelve null
        return null;
    }
    
}
