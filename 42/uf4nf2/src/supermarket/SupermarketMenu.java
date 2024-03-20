package supermarket;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jmorenp
 */
public class SupermarketMenu {
    private String title = "Supermarket main menu";
    private String[] options = {
        "Exit", "Search article by EAN code",
        "Add a new article", "List all articles"
    };
    
    /**
     * displays menu and gets user's choice
     * @return option number selected by user or -1 if option not valid
     */
    public int displayMenu() {
        int option = -1;
        Scanner scan = new Scanner(System.in);
        System.out.format("======= %s ========%n", title);
        for (int i = 0; i < options.length; i++) {
            System.out.format("%d.%s%n", i, options[i]);
        }
        try {
            System.out.print("Select an option: ");
            option = scan.nextInt(); 
            //check range
            if ((option<0) || (option>=options.length)) {
                option = -1;
            }
        } catch (InputMismatchException e) {
            scan.next();
            option = -1;
        }
        return option;
    }
}
