
import java.util.Scanner;

/**
 * Demana a l'usuari un número natural
 * i imprimeix tots els nombres parells 
 * entre 1 i el número entrat.
 * @author ProvenSoft
 */
public class Ex02Parells {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //llegir el número
        System.out.print("Entra un número natural: ");
        int numero = scan.nextInt();
        //Amb bucle while
        System.out.println("Amb bucle while");
        int compt1 = 2;
        while ( compt1 <= numero ) {
            //imprimer el comptador
            System.out.println(compt1);
            //incrementar el comptador
            compt1 += 2;
        }
        //Amb bucle do-while
        System.out.println("Amb bucle do-while");
        int compt2 = 2;
        do {            
            System.out.println(compt2);
            compt2 += 2;
        } while ( compt2 <= numero );
        //Amb bucle for
        System.out.println("Amb bucle for");
        for (int compt3=2; compt3 <= numero; compt3 += 2) {
            System.out.println(compt3);
        }
        //final del programa
        System.out.println("Final de programa");
    }
    
}
