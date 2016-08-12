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

public class RecursividadEscalera {
    
    public static void main (String [] args){
        
        int es, m;//Se declaran las variables que se usaran      
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuantos escalones quieres bajar");
        es = sc.nextInt();//Se le asigna un valor a cada una de las variables
        
        RecursividadEscalera e = new RecursividadEscalera(); //Se declara el objeto que se usara
        m = e.RecursividadEscalera(es); //se manda a llamar al metodo por medio de una variable
        System.out.println("Ya estas en el piso");//Se imprime un mensaje para que se le haga saber que ya
        //bajó las escaleras
    }
    
    public int RecursividadEscalera(int n){
        if (n==0){//Caso Base
            return 1;//El momento en el que el metodo finaliza
        }
        else{//Caso Recursivo, vuelve a iniciar el método
            System.out.println("Me encuentro en el escalon número " + n);
            return RecursividadEscalera(n-1);//Caso de Recursion, el metodo se esta llamando a si mismo, vuelve a iniciar
        }
    }
}
