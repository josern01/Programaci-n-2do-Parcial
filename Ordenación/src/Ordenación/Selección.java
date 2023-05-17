package Ordenación;



public class Selección {

  

    public static void ordenarSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // intercambiar elemento i con el mínimo encontrado
            int aux = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = aux;
        }
         System.out.print("Datatos ordenados:[");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+ ",");
            
        }
        System.out.println("]");

    }

}
