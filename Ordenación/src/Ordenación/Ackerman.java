
package Ordenación;


public class Ackerman {
    
    public static int ackermann(int m, int n) {
    if (m == 0) {
        return n + 1;
    } else if (n == 0) {
        return ackermann(m - 1, 1);
    } else {
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int result = ackermann(m, n);
        System.out.println("El resultado de A(" + m + ", " + n + ") es " + result);
    }
}



