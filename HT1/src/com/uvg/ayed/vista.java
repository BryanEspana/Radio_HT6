/*
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Javier Prado 21486 | Bryan Espana 21550 | Angel Perez - 21298
 */
package com.uvg.ayed;
import java.util.Scanner;
/**
 *
 * @author Bryan|Javier|Angel
 */
public class vista {
    
    Scanner intscanner = new Scanner (System.in);
    Radio r = new Radio();
    public void bienvenida(){ // Menu de funciones de radio
        System.out.println("--------------------RADIO---------------------\n"
                        +  "1. Encender/Apagar Radio \n"
                        +  "2. Cambia de AM a FM o AM\n" 
                        +  "3. Siguiente emisora\n" 
                        +  "4. Retroceder Emisora\n"
                        +  "5. Guardar Emisora (Maximo 12)\n" 
                        +  "6. Seleccionar Emisora Guardada (Del 1 al 12)\n" 
                        +  "7. Salir de la Radio");
             int opcion = intscanner.nextInt();
             switch(opcion){
                 case 1://Encender/Apagar Radio
                     r.switchButton();
                     break;
                 case 2://Cambia de AM a FM o AM
                     r.changeMode();
                     break;
                 case 3://Siguiente emisora
                     r.moveForward();
                     break;
                 case 4://Retroceder Emisora
                     r.moveBackward();
                     break;
                 case 5://Guardar Emisora (Maximo 12
                     System.out.println("Ingrese un numero de 1 al 12 para guardar la Emisora.");
                     int casilla = intscanner.nextInt();
                     while(casilla < 1 || casilla>12){
                         System.out.println("Error, Espacio Invalido");
                         System.out.println("Ingrese un numero de 1 al 12 para guardar la Emisora.");
                         casilla = intscanner.nextInt();
                     }
                     if(r.getActualMode() == 0){
                         r.saveInAM(casilla,r.getActualFreqAM());
                     }else if (r.getActualMode() == 1){
                         r.saveInFM(casilla, r.getActualFreqFM());
                     }
                     
                     break;

                 case 6://Seleccionar Emisora Guardada (Del 1 al 12)
                        System.out.println("Ingrese un numero de 1 al 12 para cargar la Emisora.");
                        casilla = intscanner.nextInt();
                        while(casilla < 1 || casilla>12){
                         System.out.println("Error, Espacio Invalido");
                         System.out.println("Ingrese un numero de 1 al 12 para cargar la Emisora.");
                         casilla = intscanner.nextInt();
                     }
                     if(r.getActualMode() == 0){
                         System.out.println("La Emisora Cargada es "+String.valueOf(r.getSavedFreqAM(casilla))+"AM");
                     }else if (r.getActualMode() == 1){
                         System.out.println("La Emisora Cargada es "+String.valueOf(r.getSavedFreqFM(casilla))+"FM");
                     }
                     
                     break;
                 case 7://Salir de la Radio
                        System.exit(0);
                     break;
             }
    }
    
     
    public void Error(){
        System.out.println("ERROR. intentelo de nuevo");
    }

        public void Encendido(){
        System.out.println("El Radio Esta encendido");
    }

    public void Apagado(){
        System.out.println("El Radio Esta Apagado");
    }
    }
 