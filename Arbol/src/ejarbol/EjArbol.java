package ejarbol;

import java.util.Scanner;

public class EjArbol {

    public static void main(String[] args) {
        ArbolB A = new ArbolB();
        int indice;
        int opc = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("***BIENVENIDO A ARBOL BINARIO ORDENADO***");
        do {
            System.out.println("Menu");
            System.out.println("1.Insertar");
            System.out.println("2.Buscar elemento");
            System.out.println("3.Recorrido en Pre orden");
            System.out.println("4.Recorrido en In orden");
            System.out.println("5.Recorrido en Pos orden");
            System.out.println("6.Salir");
            System.out.println("seleccione opción --->\n");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Dame el numero a insertar");
                    int p = leer.nextInt();
                    A.InsertaNodo(p);
                    break;

                case 2:
                    System.out.println("Buscar elemento");
                    int elementoBusqueda = leer.nextInt();
                    A.Busqueda(elementoBusqueda, A.raiz);
    
                    break;

                case 3:
                    System.out.println("El recorrido en Preorden");
                    A.Preorden(A.raiz);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("El recorrido en Inorden es");
                    A.Inorden(A.raiz);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("EL recorrido en Postorden es");
                    A.PostOrden(A.raiz);
                    System.out.println();
                    break;
            }
        } while (opc != 6);
    }
}
