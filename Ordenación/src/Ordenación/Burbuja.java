package Ordenación;


public class Burbuja {

    

    public static void ordenarBurbuja(int [] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                     
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        
        System.out.print("Datatos ordenados:[");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+ ",");
            
        }
        System.out.println("]");

    }
    
}
