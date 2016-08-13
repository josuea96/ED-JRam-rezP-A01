/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.actividad.escalera;

/**
 *
 * @author josuealexis96
 */
import java.util.*;

public class EDActividadEscalera {

    public static void main (String [] args){
        
        int n;//Se declaran las variables que se usaran
        Scanner sc = new Scanner (System.in);//Pregunta
        //al usuario que número de escalones que quiere bajar
        
        System.out.println("¿Cuantos escalones vas a bajar? ");
        n = sc.nextInt();//Se guarda el resultado en la variable n
        System.out.println(RecursividadEscalera.RecursividadEscalera(n));
        
    }
    
}
