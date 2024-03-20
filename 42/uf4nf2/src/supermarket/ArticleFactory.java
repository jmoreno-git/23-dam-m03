package supermarket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jmorenp
 */
public class ArticleFactory {

    private static Scanner scan = new Scanner(System.in);

    public static Article readArticle(String type) {
        Article art = null;
        switch (type) {
            case "food":
                art = readFood();
                break;
            default:
                art = null;
        }
        return art;
    }

    /**
     * reads data from user for a new Food object
     * @return a Food object or null in case of error
     */
    private static Food readFood() {
        Food a = null;
        try {
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Maker: ");
            String maker = scan.next();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            System.out.print("EAN: ");
            String ean = scan.next();
            System.out.print("Date: ");
            String date = scan.next();
            a = new Food(name, maker, price, ean, date);            
        } catch (InputMismatchException e) {
            a = null;
        }
        return a;
    }
}
