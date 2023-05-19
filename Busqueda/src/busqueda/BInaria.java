package busqueda;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BInaria {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
//        int numeros[] = {12, 23, 1, 45, 21, 15};
        
        int[] numeros = new Random().ints(5, 0, 100).toArray();

        // Imprimir el array generado
        for (int numero : numeros) {
            System.out.println(numero);
        
    }

        System.out.println("Que numero quieres buscar en en el array?");

        int numeroAencontrar = leer.nextInt();

        Arrays.sort(numeros);

        if (Arrays.binarySearch(numeros, numeroAencontrar) > 0) {
            System.out.println("El número " + numeroAencontrar + " está en el Array");
        } else {
            System.out.println("El número " + numeroAencontrar + " NO está en el Array");
        }

    }
}
