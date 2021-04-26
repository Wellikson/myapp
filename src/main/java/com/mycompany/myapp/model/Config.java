/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.model;

/**
 *
 * @author wellikson
 */
public class Config {
    private static final Config instance = new Config();
    
    String formatRelatorios = "html";
    String tipoGraficos = "pizza";

    private Config(){}
    
    public static Config getInstance(){
        return instance;
    }
    
    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
    
    
}
