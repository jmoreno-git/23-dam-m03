package cat.proven.currencyconverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to provide a menu to user interaction
 * @author ProvenSoft
 */
public class Menu {

    /**
     * title of menu
     */
    private final String title;
    /**
     * options of menu
     */
    private final List<String> options;

    public Menu(String title) {
        this.title = title;
        this.options = new ArrayList<>();
    }

    /**
     * adds an option to the menu
     *
     * @param option the option to add
     */
    public void addOption(String option) {
        options.add(option);
    }

    /**
     * displays menu and gets user's option
     *
     * @return option number selected by user or -1 if invalid option
     */
    public int displayMenuAndReadOption() {
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        System.out.printf("======== %s =======%n", title);
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d. %s%n", i, options.get(i));
        }
        try {
            System.out.print("Select an option: ");
            opt = sc.nextInt();
            if ( (opt<0) || (opt>=options.size()) ) {
                opt = -1;
            }
        } catch (NumberFormatException ex) {
            sc.next();
            opt = -1;
        }
        return opt;
    }

}
