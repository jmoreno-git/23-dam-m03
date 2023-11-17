package recursivitat;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex05Palindrom {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix una frase sense espais: ");
        String frase = in.next();
        boolean resultat = esPalindrom(frase);
        System.out.println( (resultat ? "És palíndrom" : "No és palíndrom") );
    }
    
    /**
     * verifica si text és un palíndrom
     * @param text el text a verificar
     * @return true si és palíndrom, false en cas contrari
     */
    private static boolean esPalindrom(String text) {
        //System.out.printf("esPalindrom: %s%n", text);
        boolean result = false;
        if (text.length() <= 1) {
            result = true;
        } else {
            char primer = text.charAt(0);
            char darrer = text.charAt(text.length()-1);
            String subText = text.substring(1, text.length()-1);
            result = (primer == darrer) && esPalindrom(subText);
        }
        return result;
    }

}
