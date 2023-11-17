
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex06MesGran {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir de l'usuari els números
        System.out.print("Entra el primer número: ");
        double num1 = lector.nextDouble();
        System.out.print("Entra el segon número: ");
        double num2 = lector.nextDouble();
        //mostrar el més gran
        if (num1 == num2) {
            System.out.println("Els dos números són iguals");
        } else {
            if (num1 > num2) {
                System.out.println("El més gran és el primer: "+num1);
            } else {
                System.out.println("El més gran és el segon: "+num2);        
            }
        }
        
    }

}
