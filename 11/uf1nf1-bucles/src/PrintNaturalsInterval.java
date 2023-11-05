
import java.util.Scanner;

/**
 * Demana a l'usuari dos nombres naturals i 
 * imprimeix tots els naturals entre aquest dos inclosos.
 * @author Provensoft
 */
public class PrintNaturalsInterval {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //entrada dels números límit de l'interval
        System.out.print("Entra el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Entra el segon número: ");
        int num2 = lector.nextInt();
        //amb bucle while
        System.out.println("Amb bucle while");
        //inicialitzar iterador
        int iter1 = num1;
        while ( iter1<=num2 ) {            
            System.out.println(iter1);
            iter1++;
        }
        //amb bucle do-while
        System.out.println("Amb bucle do-while");
         //inicialitzar iterador
         int iter2 = num1;
         do {            
            System.out.println(iter2);
            iter2++;
        } while ( iter2<=num2 );
        //amb bucle for
        System.out.println("Amb bucle for");
        for (int iter3=num1; iter3 <= num2; iter3++) {
            System.out.println(iter3);
        }
        //fi del programa
        System.out.println("Fin del programa");
    }
    
}
