import java.util.Scanner;

/**
 * Hola món
 * @author ProvenSoft
 */
public class HolaMon {
    public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
        //imprimir missatge
        System.out.println("Hola món!");
        
        //llegir el nom
        System.out.print("Entra el nom: ");
        String nom = lector.next();
        //llegir edat
        System.out.print("Entra l'edat: ");
        int edat = lector.nextInt();
        
        System.out.println("El teu nom és: "+nom);
        System.out.println("La teva edat és: "+edat);
        final int ANY_ACTUAL = 2023;
        int anyNaixement = ANY_ACTUAL - edat;
        System.out.println("El teu any de naixement és: "+anyNaixement);
    } 
}
