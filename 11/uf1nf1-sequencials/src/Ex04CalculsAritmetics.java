
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex04CalculsAritmetics {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //entrar el primer número
        System.out.print("Entra el primer número: ");
        float num1 = lector.nextFloat();
        //entrar el segon número
        System.out.print("Entra el segon número: ");
        float num2 = lector.nextFloat();
        //calcular la suma
        float suma = num1 + num2;
        //calcular la resta
        float resta = num1 - num2;
        //calcular la multiplicació
        float producte = num1 * num2;
        //calcular la divisió
        float divisio = num1 / num2;
        //mostrar resultats
//        System.out.println("suma="+suma);
//        System.out.println("resta="+resta);
//        System.out.println("multiplicació="+producte);
//        System.out.println("divisió="+divisio);
        System.out.format("%.2f+%.2f=%.2f\n", 
                num1, num2, 
                suma);
        System.out.format("%.2f-%.2f=%.2f\n", 
                num1, num2, 
                resta);
        System.out.format("%.2f*%.2f=%.2f\n", 
                num1, num2, 
                producte);
        System.out.format("%.2f/%.2f=%.2f\n", 
                num1, num2, 
                divisio);
    }
    
}
