package com.example.jaimemaretoli.listadecontatos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jaimemaretoli on 26/07/16.
 */
public class ListaTelefone {

    private Map<String, String> valores;
    private static ListaTelefone instancia;

    private ListaTelefone(){

    }

    public static ListaTelefone getInstancia(){

        if(instancia == null){
            instancia = new ListaTelefone();
            instancia.setValores(new HashMap<String, String>());
        }

        return instancia;
    }

    public Map<String, String> getValores() {
        return valores;
    }

    public void setValores(Map<String, String> valores) {
        this.valores = valores;
    }
}
