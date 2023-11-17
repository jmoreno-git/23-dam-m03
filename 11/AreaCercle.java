import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Llegeix el radi d'un cercle de l'usuari,
 * calcula l'àrea del cercle
 * i imprimeix el resultat.
 */
public class AreaCercle {
	
	public static void main (String[] args) {
		Scanner lector = new Scanner(System.in);
		//llegir el radi
		System.out.print("Entra el radi del cercle: ");
		try {
			double radi = lector.nextDouble();
			//calcular l'àrea del cercle
			double area = Math.PI * radi * radi;
			//imprimir resultat
			System.out.println("L'àrea del cercle de radi "+radi+" és "+area);
			System.out.format("L'àrea del cercle de radi %.2f és %.2f\n", radi, area);
		} catch (InputMismatchException ex) {
			System.out.println("Dada incorrecta");
			//ex.printStackTrace();
		}
		System.out.println("fi del programa");
	}
}

