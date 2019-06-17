/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAMENRQC;

import examen.AutosRQC;
import examen.AutosRQC;
import examen.AutosRQC;
import examen.EXAMENRQC;
import examen.EXAMENRQC;
import examen.ORDENACIONRQC;
import examen.ORDENACIONRQC;
import examen.TECLADORQC;
import examen.TECLADORQC;
import java.util.Scanner;

public class MenuDeOpcionesRQC {
        public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: AutosRQC.ejer1();break;
            case 2: TECLADORQC.ejer2();break;   
            case 3: ORDENACIONRQC.ejer3();break;
            case 4: EXAMENRQC.Ejer4();break;
            
          
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }
    
}