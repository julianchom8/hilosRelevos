
package com.mycompany.hilosrelevos;


/**
 *
 * @author Julian Medina
 * @author Erika Cortes
 */
public class Random {
    
    /**
     * Metodo que retorna numeros aleatorios
     * @return 
     */
    
    public static int random(){
        double i=Math.random()*100;
        int j=(int) i;
        if(j<25){
            j=0;
        }
        else if(j>=25&&j<50){
            j=1;
        }
        else if(j>=50&&j<75){
            j=2;
        }
        else if(j>=75){
            j=3;
        }
        return j;
    } 
}
