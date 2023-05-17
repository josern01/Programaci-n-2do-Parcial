package busqueda;

import java.util.Random;
import java.util.Scanner;

public class Secuencial {

    public static void main(String[] args) {

//        int numeros[] = {12, 23, 1, 45, 21, 15};

        
        int[] numeros = new Random().ints(5, 0, 100).toArray();

        // Imprimir el array generado
        for (int numero : numeros) {
            System.out.println(numero);
        
    }

        Scanner leer = new Scanner(System.in);
        System.out.println("Que numero quieres buscar en en el array?");

        int numeroAencontrar = leer.nextInt();

        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {//se recorre el arreglo
            if (numeros[i] == numeroAencontrar) {//comparamos el elemento en el arreglo con el buscado
                posicion = i;//Si es el número buscado guardamos la posicion
                break;//Para el ciclo
            }
        }
        
        
        System.out.println("El nunmero encontrado es:" + numeroAencontrar);
    }

}

