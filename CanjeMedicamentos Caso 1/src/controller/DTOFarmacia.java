/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Farmacia;

/**
 *
 * @author Eduardo Jirón
 */
public class DTOFarmacia 
{
    private Farmacia unaFarmacia;
    private ArrayList listaFarmacias;
    private String usuario;
    
    public DTOFarmacia()
    {
        unaFarmacia = new Farmacia();
    }
    
    public void setUnaFarmacia(Farmacia pFarmacia)
    {
        unaFarmacia = pFarmacia;
    }
    
    public Farmacia getUnaFarmacia()
    {
        return unaFarmacia;
    }

    /**
     * @return the listaFarmacias
     */
    public ArrayList getListaFarmacias() {
        return listaFarmacias;
    }

    /**
     * @param listaFarmacias the listaFarmacias to set
     */
    public void setListaFarmacias(ArrayList listaFarmacias) {
        this.listaFarmacias = listaFarmacias;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
