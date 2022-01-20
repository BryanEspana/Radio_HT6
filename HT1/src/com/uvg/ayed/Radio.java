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
public class Radio implements IRadio{
private boolean Rstate = false;
private boolean Estate = false;
private int EmisoraAM = 530;
private double EmisoraFM = 87.9;
private double EmisoraFloatFM;

    @Override
    public boolean getStatus() {
        return Rstate;
    }

    @Override
    public void switchButton() {
        Rstate = Rstate ? false : true;
        if(Rstate)
            System.out.println("Radio Encendido");
        else{
            System.out.println("Radio Apagado");
        }
    }

    @Override
    public void changeMode() {
        Estate = Estate ? false : true;
        if(Rstate){
        if(Estate)
            System.out.println("Radio en FM");
        else{
            System.out.println("Radio en AM");
        }
        }
        else{
            System.out.println("Debe encender la radio");
        }
    }

    @Override
    public int getActualMode() {
        if(Rstate){
        if(Estate)
            getActualFreqFM();
        else{
            getActualFreqAM();
        }
        }else{
            System.out.println("Debe encender la radio");   
        }
    return EmisoraAM;
    }

    @Override
    public void saveInAM(int slot, int freq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getSavedFreqAM(int slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveInFM(int slot, double freq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSavedFreqFM(int slot) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getActualFreqAM() {
        while(EmisoraAM >= 520 && EmisoraAM <= 1610)
        {
            EmisoraAM = EmisoraAM +10;
            System.out.println("Esta escuchando: "+EmisoraAM+" AM"); 
            if(EmisoraAM == 1610){
                EmisoraAM =520;
            }
        break;
        }
        

    return EmisoraAM;
    }

    @Override
    public double getActualFreqFM() {
         while(EmisoraFM >= 87.7 && EmisoraFM <= 107.9)
         {
            EmisoraFM = EmisoraFM +0.2;
            EmisoraFloatFM = Math.round(100 * EmisoraFM) / 100d;
            System.out.println("Esta escuchando: "+EmisoraFloatFM+" FM");
            if(EmisoraFloatFM == 107.9){
                EmisoraFM =87.7;
            }
            break;
         }

    return EmisoraFM;
    }

    @Override
    public void moveForward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveBackward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void seek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int parseInt(int EmisoraRadio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
