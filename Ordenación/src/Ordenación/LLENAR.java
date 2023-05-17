package Ordenación;

import java.util.Arrays;
import java.util.Random;


public class LLENAR {

    public static int[] llenar(int n) {

       int[] arreglo = new int[n];
       Random rand = new Random();
       for (int i = 0; i < n; i++) {
           arreglo[i] = rand.nextInt(100);
       }
       System.out.println("Números aleatorios generados: " + Arrays.toString(arreglo));
       return arreglo;
    }  
}



 


