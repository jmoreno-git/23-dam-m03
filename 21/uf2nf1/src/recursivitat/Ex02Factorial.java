package recursivitat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex02Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Entra n: ");
            int n = in.nextInt();
            if (n >= 0) {
                int fact = factorial(n);
                System.out.printf("%d! = %d%n", n, fact);
            } else {
                System.out.println("El número no pot ser negatiu");
            }
        } catch (InputMismatchException e) {
            System.out.println("Has d'introduir un número enter");
        }

    }

    /**
     * calcula de forma recursiva el factorial del paràmetre
     *
     * @param n el número del qual es calcula el factorial
     * @return el factorial del número
     */
    private static int factorial(int n) {
        int result = 1;
        if (n == 0) {   //cas base
            result = 1;  //cas final
        } else {   //cas recursiu
            result = n * factorial(n - 1);
        }
        return result;
    }

}
