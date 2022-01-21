/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Javier Prado 21486 | Bryan Espana 21550 | Angel Perez - 21298
 */
package com.uvg.ayed;

/**
 *
 * @author Bryan|Javier|Angel
 */
public class controlador extends Radio { 
    vista Vista = new vista(); //se llama a clase vista
    Radio r = new Radio();
    public void Ejecutar(){
        boolean continuar = true;
        while(continuar){
        Vista.bienvenida();
        }
        
    }

}
