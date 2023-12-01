
import java.util.Scanner;


/**
 *
 * @author ProvenSoft
 */
public class ExempleScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Entra un text: ");
        String text = sc.next();
        //String text = sc.nextLine();
        System.out.println("Text: "+text);
    }
    
}
