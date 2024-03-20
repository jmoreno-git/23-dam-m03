package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Menu {
    private String title;
    private List<String> options;

    public Menu(String title) {
        this.title = title;
        this.options = new ArrayList<>();
    }
    
    public void addOption(String option) {
        options.add(option);
    }
    
    /**
     * displays menu and gets user's option
     * @return option number selected by user or -1 if invalid option
     */
    public int displayMenuAndReadOption() {
        int opt = -1;
        System.out.printf("======== %s =======%n", title);
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d. %s%n", i, options.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Select an option: ");
        opt = sc.nextInt();
        return opt;
    }
    
}
