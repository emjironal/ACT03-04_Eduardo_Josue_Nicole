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
    private DAO_Imp_Farmacia daoFarmacia;
    
    public GestorFarmacia()
    {
        daoFarmacia = new DAO_Imp_Farmacia();
    }
    
    public List recuperar()
    {
        return daoFarmacia.recuperar();
    }
    
    public Farmacia consulta(int codigo)
    {
        return (Farmacia)daoFarmacia.recuperar(codigo);
    }
    
    public boolean registrar(Farmacia pFarmacia)
    {
        System.out.println("en el Gestor de farmacia solicitando registro de farmacia");
        return daoFarmacia.registrar(pFarmacia);
    }
}
