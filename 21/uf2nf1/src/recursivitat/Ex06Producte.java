package recursivitat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex06Producte {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Entra m: ");
            int m = in.nextInt();
            System.out.print("Entra n: ");
            int n = in.nextInt();
            int producte = producteRecursiu(m, n);
            System.out.printf("%d x %d = %d%n", m, n, producte);
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
    private static int producteRecursiu(int m, int n) {
        int result = 1;
        if (n == 1) {   //cas base
            result = m;  //cas final
        } else {   //cas recursiu
            result = m + producteRecursiu(m, n - 1);
        }
        return result;
    }

}
