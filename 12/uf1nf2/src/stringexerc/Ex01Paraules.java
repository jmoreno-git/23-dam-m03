
package stringexerc;

import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Ex01Paraules {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        //
        System.out.print("Entra una frase: ");
        String frase = scan.next();
        System.out.println("Frase: "+frase);
        //
        char c = ' ';
        int index, prevIndex;
        //
        //buscar espai
        index = frase.indexOf(c);
        String paraula;
//        if (index >= 0) {  //caràcter trobat
            paraula = frase.substring(0, index);
            System.out.println(paraula);
            prevIndex = index;
            index = frase.indexOf(c, index+1);
            paraula = frase.substring(prevIndex+1, index);
            System.out.println(paraula);
//        } else {  //caràcter no trobat
//            
//        }
    }
    
}
