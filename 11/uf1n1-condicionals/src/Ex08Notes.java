
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex08Notes {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //llegir de l'usuari els números
        System.out.print("Entra la nota numèrica: ");
        double nota = lector.nextDouble();
        String qualificacio = "";
        if ( nota <= 10) {
            if ( nota >= 9 ) {
                qualificacio = "Excel·lent";
            } else {
                if ( nota >= 6 ) {
                    qualificacio = "Notable";
                } else {
                    if ( nota >= 5 ) {
                        qualificacio = "Bé";
                    } else {
                        if ( nota >= 3 ) {
                            qualificacio = "Insuficient";
                        } else {
                            if ( nota >= 0 ) {
                                qualificacio = "Molt deficient";
                            } else {
                                System.out.println("Nota no vàlida");
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Nota no vàlida");
        }
        if (qualificacio.length() > 0) {
            System.out.println("Qualificació: "+qualificacio);
        }
    }
    
}
