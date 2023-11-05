
import java.util.Scanner;


/**
 *
 * @author ProvenSoft
 */
public class Ex18NomEdat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String nom;
        int edat;
        System.out.print("Entra un nom: ");
        //nom = sc.nextLine();
        nom = sc.next();
        System.out.print("Entra una edat: ");
        edat = sc.nextInt();
        //
        System.out.println("Nom: "+nom);
        System.out.println("Edat: "+edat);
    }
    
}
