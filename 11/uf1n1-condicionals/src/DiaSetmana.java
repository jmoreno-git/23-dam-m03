
import java.util.Scanner;

/**
 * Llegeix el número de dia de la setmana i mostra nom del dia de la setmana
 *
 * @author ProvenSoft
 */
public class DiaSetmana {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir el número del dia de la setmana
        System.out.print("Entra el dia de la setmana: ");
        int dia = lector.nextInt();
        //mostrar el dia de la setmana
        switch (dia) {
            case 1:
                System.out.println("Oh, avui és dilluns");
                break;
            case 2:
                System.out.println("Avui és dimarts");
                break;
            case 3:
                System.out.println("Avui és dimecres");
                break;
            case 4:
                System.out.println("Avui és dijous");
                break;
            case 5:
                System.out.println("Avui és divendres. Hurra!, demà serà dissabte");
                break;
            case 6:
                System.out.println("Avui és dissabte");
                break;
            case 7:
                System.out.println("Avui és diumenge. Ohh! demà serà dilluns");
                break;
            default:
                System.out.println("Número de dia incorrecte");
                break;
        }
    }

}
