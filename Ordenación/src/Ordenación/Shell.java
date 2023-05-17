
package Ordenación;


public class Shell {
    public static void ordenarShell(int[] arreglo) {
        int n = arreglo.length;

        // Calcula la secuencia de intervalos
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1;
        }

        // Aplica el algoritmo de inserción directa en cada subgrupo
        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                int temp = arreglo[i];
                int j = i;
                while (j > intervalo - 1 && arreglo[j - intervalo] >= temp) {
                    arreglo[j] = arreglo[j - intervalo];
                    j -= intervalo;
                }
                arreglo[j] = temp;
            }
            intervalo = (intervalo - 1) / 3;
        }
        
        System.out.print("Datatos ordenados:[");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i]+ ",");
            
        }
        System.out.println("]");
    }
    
    
    
}
