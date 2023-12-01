import java.util.Scanner;
/**
 * Read variables in a line with terminador '\n' and field separator ';'
 * @author Jose
 */
public class ScannerCsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //show default delimiter
        System.out.println("Scanner default delimiter: "+sc.delimiter());
        //newlines and semicolons with any amount of spaces around are allowed
        sc.useDelimiter("(\\s*;\\s*)|\\n");
        //read a name (String with spaces allowed) and an integer age
        System.out.print("Input name and age: ");
        String name = sc.next();   //read name
        int age = sc.nextInt();   //read age
        //show variables read
        System.out.format("name: %s; age: %d\n", name, age);
    }
    
}