
import java.util.Scanner;

/**
 * Entra preu inicial i de venda d'un producte,
 * calcula el percentatge de descompte
 * i mostra el resultat.
 * @author ProvenSoft
 */
public class Ex06Descompte {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir preu inicial
        System.out.print("Entra el preu inicial: ");
        double preuInicial = lector.nextDouble();
        //llegir preu de venda final
        System.out.print("Entra el preu de venda: ");
        double preuVenda = lector.nextDouble();
        //calcular percentatge de descompte
        double percentatgeDescompte = 
                (preuInicial - preuVenda) / preuInicial * 100.0;
        //mostrar resultat a l'usuari
        System.out.println("Preu inicial: "+preuInicial);
        System.out.println("Preu venda: "+preuVenda);
        System.out.format("Percentatge descompte: %.2f\n", percentatgeDescompte);
    }
    
}
