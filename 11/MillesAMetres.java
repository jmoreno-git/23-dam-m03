import java.util.Scanner;

/**
 * Demana a l'usuari una distància en milles,
 * la converteix a metres
 * i mostra el resultat
 */
public class MillesAMetres {
	
	public static void main (String[] args) {
		//definir factor de conversió
		final double MILLES_A_METRES = 1852.0;
		//crear un scanner per llegir del teclat (entrada estàndard)
		Scanner lector = new Scanner(System.in);
		//demanar les milles a l'usuari
		System.out.print("Entra les milles a convertir: ");
		double milles = lector.nextDouble();
		//calcular la conversió a metres
		double metres = milles * MILLES_A_METRES;
		//informar a l'usuari del resultat
		System.out.println("El resultat és: " + metres);
		System.out.println(milles + " milles equivalen a " +  metres + " metres");
	}
}

