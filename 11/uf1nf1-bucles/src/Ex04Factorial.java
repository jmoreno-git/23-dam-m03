
import java.util.Scanner;


/**
 * Entra un número natural,
 * calcula el seu factorial
 * i imprimeix el resultat
 * @author ProvenSoft
 */
public class Ex04Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //llegir el número
        System.out.print("Introdueix el número del qual vols calcular el factorial: ");
        int n = sc.nextInt();
        //calcular el factorial
        int factorial = 1;
//        for (int i=1; i<=n; i++) {
//            //factorial = factorial * i;
//            factorial *= i;
//        }
        for (int i=n; i>0; i--) {
            factorial *= i;
        }
        //mostrar el resultat
        //System.out.format("%d! = %d\n", 
        //        n, factorial);
        String missatge = 
                String.format("%d! = %d", 
                n, factorial);
        System.out.println(missatge);
    }
    
}
