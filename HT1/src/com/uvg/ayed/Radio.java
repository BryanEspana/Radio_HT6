/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Javier Prado 21486 | Bryan Espana 21550 | Angel Perez - 21298
 */
package com.uvg.ayed;

import java.util.ArrayList;


/**
 *
 * @author Bryan|Javier|Angel
 */
public class Radio implements IRadio{
private boolean Rstate = false; //Sirve para saber el estado de apagado/encendido
private boolean Estate = false; // sirve para la emisora en FM O AM
private int EmisoraAM = 530; // Instanciamos valores de la AM para que inicie en 530
private double EmisoraFM = 87.9; //instanciamos valores de la FM para que inicie en 87.9
private double EmisoraFloatFM; //sirve para devolver valores de radio encontradas
//ARRAYS para guardar las emisoras de AM O FM
Integer[] slotAM = new Integer[12]; 
double[] slotFM = new double[12];


    @Override
    public boolean getStatus() { //Valores para apagado/encendido
        return Rstate;
    }

    @Override
    public void switchButton() { //metodo que intercala entre apagado y encendido
        Rstate = Rstate ? false : true;
        if(Rstate)
            System.out.println("Radio Encendido");
        else{
            System.out.println("Radio Apagado");
        }
    }

    @Override
    public void changeMode() { //metodo que intercala entre AM y FM
        Estate = Estate ? false : true;
        if(Rstate){ //Si el radio esta encendido cambiara de AM a FM
        if(Estate)
            System.out.println("Radio en FM");
        else{
            System.out.println("Radio en AM");
        }
        }
        else{
            System.out.println("Debe encender la radio");//Si el radio esta apagado sale este mensaje
        }
    }

    @Override
    public int getActualMode() {//devuleve valores 1 y 0 si esta encendido o apagado
     int Estados = 1;
     if(!Estate){
        Estados = 0;
     }
     return Estados;
    }

    @Override
    public void saveInAM(int slot, int freq) { //guardar emisoras en SLOT
      if(Rstate){
        slotAM[slot]= freq;
                
        }else{
            System.out.println("Radio Apagado");
        }
    }

    @Override
    public int getSavedFreqAM(int slot) { //Obtener emisora en SLOT
        EmisoraAM = slotAM[slot];
    return slotAM[slot];
    }

    @Override
    public void saveInFM(int slot, double freq) { //guardar emisora en SLOT
         if(Rstate){
        slotFM[slot]= freq;
                
        }else{
            System.out.println("Radio Apagado");
        }
    }

    @Override
    public double getSavedFreqFM(int slot) {//Obtener emisora en SLOT
       EmisoraFM = slotFM[slot];
        return slotFM[slot];
    }

    @Override
    public int getActualFreqAM() { //Devuleve la emisora en reproduccion AM
        return EmisoraAM;
    }

    @Override
    public double getActualFreqFM() { //Devuleve la emisora en reproduccion FM
        return EmisoraFloatFM;
    }

    @Override
    public void moveForward() { // avanzar emisora
           
        while(EmisoraAM >= 520 && EmisoraAM <= 1610)
            {
            EmisoraAM = EmisoraAM +10;
            if(EmisoraAM == 1610){
                EmisoraAM =520;
            }
        break;
            }
        while(EmisoraFM >= 87.7 && EmisoraFM <= 107.9)
         {
            EmisoraFM = EmisoraFM +0.2;
            EmisoraFloatFM = Math.round(100 * EmisoraFM) / 100d;
            
            if(EmisoraFloatFM == 107.9){
                EmisoraFM =87.7;
            }
        break;
         }
        if(Estate){
            System.out.println("Esta escuchando: "+EmisoraFloatFM+" FM");
        }else{
            System.out.println("Esta escuchando: "+EmisoraAM+" AM");
        }
        }
        

    @Override
    public void moveBackward() { //retroceder emisora
                
        while(EmisoraAM >= 520 && EmisoraAM <= 1610)
            {
            EmisoraAM = EmisoraAM -10;
            if(EmisoraAM == 1610){
                EmisoraAM =520;
            }
        break;
            }
        while(EmisoraFM >= 87.7 && EmisoraFM <= 107.9)
         {
            EmisoraFM = EmisoraFM -0.2;
            EmisoraFloatFM = Math.round(100 * EmisoraFM) / 100d;
            if(EmisoraFloatFM == 107.9){
                EmisoraFM =87.7;
            }
        break;
         }
        if(Estate){
            System.out.println("Esta escuchando: "+EmisoraFloatFM+" FM"); 
        }else{
            System.out.println("Esta escuchando: "+EmisoraAM+" AM");
        }
    }

    @Override
    public void seek() { //buscar emisora guardada
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int parseInt(int EmisoraRadio) { 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
