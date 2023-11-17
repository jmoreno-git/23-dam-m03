
import java.util.Scanner;
/**
 * Llegir variables en línia amb terminador '\n' i separador de camps ';'
 * @author Jose
 */
public class ScannerCsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("(\\s*;\\s*)|\\n");
        System.out.print("Input name and age: ");
        String name = sc.next();
        int age = sc.nextInt();
        System.out.format("name: %s; age: %d\n", name, age);
    }
    
}
