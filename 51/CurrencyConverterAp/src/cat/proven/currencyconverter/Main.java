package cat.proven.currencyconverter;

import cat.proven.currencyconverter.model.CurrencyConverter;
import java.util.Scanner;
import java.util.Set;

/**
 * Main class for currency converter application
 * @author ProvenSoft
 */
public class Main {

    /**
     * the data service (model)
     */
    private final CurrencyConverter converter;
    /**
     * flag to exit application
     */
    private boolean exit;
    /**
     * Scanner to read from user
     */
    private final Scanner scan;

    public Main() {
        converter = new CurrencyConverter();
        exit = false;
        scan = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        Main ap = new Main();
        ap.init();
    }

    /**
     * init method
     */
    private void init() {
        exit = false;
        //instantiate menu
        Menu mnu = createMenu();
        //control loop (interact with user)
        do {            
            //display menu and read user's choice
            int option = mnu.displayMenuAndReadOption();
            switch (option) {
                case 0: //exit
                    doExit();
                    break;
                case 1: //list all currency names
                    doListAllCurrencies();
                    break;
                case 2:  //show value of a currency
                    doShowValueOfCurrency();
                    break;
                case 3: //calculate change
                    doCalculateChange();
                    break;
                case 4: //add a currency
                    doAddCurrency();
                    break;
                case 5: //modify a currency
                    doModifyCurrency();
                    break;
                case 6: //remove a currency
                    doRemoveCurrency();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exit);
    }

    /*  ========= View methods =========*/
    
    /**
     * creates a menu for currency converter application
     * @return a menu
     */
    private Menu createMenu() {
        Menu mnu = new Menu("Store application");
        mnu.addOption("Exit");
        mnu.addOption("List all currency names");
        mnu.addOption("Show value of a currency");
        mnu.addOption("Calculate change");
        mnu.addOption("Add a currency");
        mnu.addOption("Modify a currency");
        mnu.addOption("Remove a currency");
        return mnu;
    }

     /*  ========= Control methods =========*/
    
    /**
     * asks for confirmation and exits application
     */
    private void doExit() {
        System.out.print("Are you sure? (yes/no)");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("yes")) {
            exit = true;
        }
    }

    /**
     * gets all currency names and displays them
     */
    private void doListAllCurrencies() {
        Set<String> names = converter.getCurrencies();
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * read from user a currency name,
     * gets its value (if found)
     * and displays it
     * If not found, it reports error to user
     */
    private void doShowValueOfCurrency() {
        //TODO
        System.out.println("Not implemented yet!");
    }

    /**
     * reads from user currency names (source and target) and the amount to change,
     * then calculates change in target currency and displays result to user
     */
    private void doCalculateChange() {
        //TODO
        System.out.println("Not implemented yet!");
    }

    /**
     * reads currency name and value from user
     * adds the information to map of currencies and 
     * report result to user
     */
    private void doAddCurrency() {
        //TODO
        System.out.println("Not implemented yet!");
    }

    /**
     * reads currency name and new value from user,
     * searches currency and displays name and value to user,
     * asks for confirmation and, if so, 
     * modifies value of currency
     */
    private void doModifyCurrency() {
        //TODO
        System.out.println("Not implemented yet!");
    }

    /**
     * reads currency name from user,
     * searches currency and displays name and value to user,
     * asks for confirmation and, if so, 
     * removes currency
     */
    private void doRemoveCurrency() {
        //TODO
        System.out.println("Not implemented yet!");
    }
    
}
