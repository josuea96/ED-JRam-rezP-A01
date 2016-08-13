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

public class RecursividadEscalera {
    
    public static int RecursividadEscalera(int n){
        if (n==0){//Caso Base
            System.out.println("Ya bajé los escalones");
            return 1;//El momento en el que el metodo finaliza
        }
        else{//Caso Recursivo, vuelve a iniciar el método
            System.out.println("Me encuentro en el escalon número " + n);
            return RecursividadEscalera(n-1);//Caso de Recursion, el metodo se esta llamando a si mismo, vuelve a iniciar
        }
    }
}
