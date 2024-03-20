package store;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class Store {

    private String name;
    private Product[] products;
    private final int MAX_PRODUCTS;
    private int numProducts;

    private final String [] mainMenu = {
        "Exit", "List all products", "List product by code",
        "List products with low stock", "Add a new product",
        "Modify a product", "Remove a product"
    };    
    
    public Store(String name) {
        this.name = name;
        MAX_PRODUCTS = 100;
        numProducts = 0;
        products = new Product[MAX_PRODUCTS];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    public boolean addProduct(Product p) {
        boolean b = false;
        if (numProducts < MAX_PRODUCTS) {
            products[numProducts] = p;
            numProducts++;
            b = true;
        }
        return b;
    }
    
    /**
     * loads initial test data into data source.
     */
    public void loadTestData() {
        addProduct(new Tv("C01", "desc01", 101.0, 11, 62));
        addProduct(new Fridge("C02", "desc02", 102.0, 12, 180, false));
        addProduct(new Tv("C03", "desc03", 103.0, 13, 50));
        addProduct(new Tv("C04", "desc04", 104.0, 14, 46));
        addProduct(new Fridge("C05", "desc05", 105.0, 15, 200, true));
        addProduct(new Fridge("C06", "desc06", 106.0, 16, 250, true));
    } 
    
    /**
     * prints main menu option and 
     * reads selected option from the user.
     * @return the number of the option selected by user
     *  or -1 in case of input error.
     */
    
    private int showMenu() {
        System.out.println("=====Store main menu=======");
        for (int i=0; i<mainMenu.length; i++) {
            System.out.format("[%d]. %s\n", i, mainMenu[i]);
        } 
        System.out.print("Select an option: ");
        Scanner sc = new Scanner(System.in);
        int selectedOption;
        try {
            selectedOption = sc.nextInt();
            //ckeck range.
            if ((selectedOption<0) ||
                (selectedOption>=mainMenu.length) ) {
                selectedOption = -1;
            }        
        } catch (InputMismatchException e) {
            //System.out.println(e.getMessage());
            selectedOption = -1;
        }
        
        return selectedOption;
    }    
    
    public static void main(String[] args) {
        Store myStore = new Store("All 1 euro");
        boolean exit = false;
        do {
            int option = myStore.showMenu();
            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    throw new AssertionError();
            }
        } while (!exit);
    }    
    
}
