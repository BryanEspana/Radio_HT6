<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvg.ayed;
import java.util.Scanner;
/**
 *
 * @author Bryan
 */
public class vista {
    
    Scanner intscanner = new Scanner (System.in);
    Radio r = new Radio();
    public void bienvenida(){
        System.out.println("--------------------RADIO---------------------\n"
                        +  "1. Encender/Apagar Radio \n"
                        +  "1.Encender Radio \n"
                        +  "2. Cambia de AM a FM o AM\n" 
                        +  "3. Siguiente emisora\n" 
                        +  "4. Guardar Emisora (Maximo 12)\n" 
                        +  "5. Seleccionar Emisora Guardada (Del 1 al 12)\n" 
                        +  "6. Apagar el radio");
             int opcion = intscanner.nextInt();
             switch(opcion){
                 case 1:
                     r.switchButton();
                     break;
                 case 2:
                     r.changeMode();
                     break;
                 case 6:
                     r.switchButton();
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
  




=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uvg.ayed;
import java.util.Scanner;
/**
 *
 * @author Bryan
 */
public class vista {
    
    Scanner intscanner = new Scanner (System.in);
    Radio r = new Radio();
    public void bienvenida(){
        System.out.println("--------------------RADIO---------------------\n"
                        +  "1.Encender Radio \n"
                        +  "2. Cambia de AM a FM o AM\n" 
                        +  "3. Siguiente emisora\n" 
                        +  "4. Guardar Emisora (Maximo 12)\n" 
                        +  "5. Seleccionar Emisora Guardada (Del 1 al 12)\n" 
                        +  "6. Apagar el radio");
             int opcion = intscanner.nextInt();
             switch(opcion){
                 case 1:
                     r.switchButton();
                     break;
                 case 2:
                     r.changeMode();
                     break;
                 case 6:
                     r.switchButton();
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





>>>>>>> main
