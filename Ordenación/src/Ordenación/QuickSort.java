package Ordenación;

public class QuickSort {

    public static void quicksort(int Arreglo[], int izq, int der) {

        int pivote = Arreglo[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (Arreglo[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (Arreglo[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = Arreglo[i];                      // los intercambia
                Arreglo[i] = Arreglo[j];
                Arreglo[j] = aux;
            }
        }

        Arreglo[izq] = Arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        Arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(Arreglo, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(Arreglo, j + 1, der);          // ordenamos subarray derecho

        }

        System.out.print("Datos ordenados: [");
        for (int n = 0; n < Arreglo.length; n++) {
            System.out.print(Arreglo[n]);
            if (n != Arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

}
