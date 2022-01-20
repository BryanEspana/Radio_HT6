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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getActualFreqAM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getActualFreqFM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
