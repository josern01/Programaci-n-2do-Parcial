
package Ordenación;

import java.util.Arrays;
import java.util.Random;


public class Inserción_directa {
   
    public static void ordenarInsercionIndirecta(int[] arreglo) {
        int n = arreglo.length;
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        for (int i = 1; i < n; i++) {
            int indiceActual = indices[i];
            int j = i - 1;
            while (j >= 0 && arreglo[indices[j]] > arreglo[indiceActual]) {
                indices[j+1] = indices[j];
                j--;
            }
            indices[j+1] = indiceActual;
        }
        int[] arregloOrdenado = new int[n];
        for (int i = 0; i < n; i++) {
            arregloOrdenado[i] = arreglo[indices[i]];
        }
        for (int i = 0; i < n; i++) {
            arreglo[i] = arregloOrdenado[i];
        }
        System.out.print("Datatos ordenados:[");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+ ",");
            
        }
        System.out.println("]");

    }
    
}
