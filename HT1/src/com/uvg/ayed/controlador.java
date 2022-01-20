/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvg.ayed;

/**
 *
 * @author Bryan
 */
public class controlador extends Radio {
    vista Vista = new vista();
    Radio r = new Radio();
    public void Ejecutar(){
        boolean continuar = true;
        while(continuar){
        Vista.bienvenida();
        }
        
    }

}
