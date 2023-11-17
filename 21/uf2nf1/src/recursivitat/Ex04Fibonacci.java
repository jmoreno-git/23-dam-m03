package recursivitat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex04Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Entra n: ");
            int n = in.nextInt();
            if (n > 0) {
                int element = fibonacci(n);
                System.out.printf(
                        "L'element %d de la successió de Fibonacci és %d%n", 
                        n, element);
            } else {
                System.out.println("El número ha de ser positiu");
            }
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduir un número enter");
        }

    }
    
    /**
     * calcula l'element n de la successió de Fibonacci
     * @param n l'element a calcular
     * @return l'element a la posició n a la successió de Fibonacci
     */
    private static int fibonacci(int n) {
        //System.out.printf("%d ", n);
        int result = 0;
        if ((n == 1) || (n == 2)) {  //cas base
            return 1;  // cas final
        } else {  //cas recursiu
            result = fibonacci(n-1) + fibonacci(n-2);
        }
        return result;
    }


}
