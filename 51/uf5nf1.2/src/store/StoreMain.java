package store;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class StoreMain {

    private Store myStore;
    private boolean exit;  //flag to exit application.
    private Scanner scan;
    
    public StoreMain() {
        myStore = new Store("La meva botigueta");
        scan = new Scanner(System.in);
    }
    
    public static void main(String[] args) {
        StoreMain sm = new StoreMain();
        sm.run();
    }

    private void run() {
        //instantiate store
        //myStore = new Store("La meva botigueta");
        myStore.generateProducts();
        //
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
                case 1: //list all products
                    doListAllProducts();
                    break;
                case 2: //list product by code
                    doListProductByCode();
                    break;
                case 3: //list products with low stock
                    doListProductsWithLowStock();
                    break;
                case 4: //add a new product
                    doAddProduct();
                    break;
                case 5: //modify a product
                    doModifyProduct();
                    break;
                case 6: //remove a product
                    doRemoveProduct();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (!exit);
    }

    /*  ========= View methods =========*/
    
    private Menu createMenu() {
        Menu mnu = new Menu("Store application");
        mnu.addOption("Exit");
        mnu.addOption("List all products");
        mnu.addOption("List product by code");
        mnu.addOption("List products with low stock");
        mnu.addOption("Add a new product");
        mnu.addOption("Modify a product");
        mnu.addOption("Remove a product");
        return mnu;
    }
    

    /**
     * displays the list of products
     * @param data the list to display
     */
    private void displayProductList(List<Product> data) {
        for (Product p : data) {
            System.out.println(p);
        }
        System.out.format("%d elements shown%n", data.size());
    }    

    /**
     * reads a string from user
     *
     * @param message the message to prompt to use
     * @return user's answer
     */
    private String readString(String message) {
        System.out.print(message);
        return scan.next();
    }    
    
    /**
     * reads from user a product
     *
     * @return the product read or null in case of error
     */
    private Product readProduct() {
        Product p = null;
        try {
            String code = readString("Code: ");
            String description = readString("description: ");
            String sprice = readString("Price: ");
            String sstock = readString("Stock: ");
            double price = Double.parseDouble(sprice);
            int stock = Integer.parseInt(sstock);
            p = new Product(code, description, price, stock);
        } catch (NumberFormatException ex) {
            p = null;
        }
        return p;
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
     * lists all products
     */
    private void doListAllProducts() {
        List<Product> result = myStore.getAllProducts();
        displayProductList(result);
    }
    
    /**
     * reads from user the code of the product,
     * then searches the product with that code,
     * if found, it displays the product,
     * if not found, it reports to user.
     */
    private void doListProductByCode() {
        //read the code
        System.out.print("Input the code: ");
        String code = scan.next();
        //
        Product result = myStore.getProductByCode(code);
        if (result != null) {  //found
            System.out.println(result);
        } else {  //not found
            System.out.printf("Product with code '%s' not found%n", code);
        }
    }

    /**
     * reads from user data for the new product,
     * if correctly read instantiates a product with that data,
     * and adds the product to the list
     * If not correctly read, it reports the error to the user
     * Finally, it reports result to user.
     */
    private void doAddProduct() {
        //read the product
        Product prod = readProduct();
        if (prod != null) {  //correctly read
            boolean result = myStore.addProduct(prod);
            if (result) { //added
                System.out.println("Product successfully added");
            } else {  //not added
                System.out.println("Product not added");
            }
        } else {  //invalid data read
            System.out.println("Invalid data!");
        }
    }
    

    /**
     * asks the user to input the stock threshold,
     * searches products with stock lower than threshold
     * and displays them.
     */
    private void doListProductsWithLowStock() {
        //read threshold
        String sstock = readString("Min. Stock: ");
        try {
            int stock = Integer.parseInt(sstock);
            List<Product> result = myStore.getProductsWithLowStock(stock);
            displayProductList(result);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid value for stock: "+sstock);
        }
    }

    /**
     * asks the the user the code of the product,
     * searches the product with that code and, 
     * if found, displays the product and 
     * asks for confirmation.
     * If so, asks the user to input new data for the product,
     * and, if correctly read, modifies the product and report result to user.
     * Otherwise, it reports error to user.
     */
    private void doModifyProduct() {
        //read the code
        String code = readString("code: ");
        //search product
        Product found = myStore.getProductByCode(code);
        if (found != null) {
            //display product
            System.out.println(found);
            String answer = readString("Sure to modify? (yes/no)");
            if (answer.equalsIgnoreCase("yes")) {
                //read new data for the product
                Product p = readProduct();
                if (p != null) {
                    boolean result = myStore.modifyProduct(found, p);
                    if (result) {
                        System.out.println("Successfully modified");
                    } else {
                        System.out.println("Product not modified");
                    }
                } else {
                    System.out.println("Invalid data reading product");
                }
            } else {
                System.out.println("Cancelled by user");
            }
        } else {
            System.out.format("Code %s not found%n",code);
        }
    }

    /**
     * asks the user the code of the product,
     * searches the product with that code,
     * if found, displays it to user, asks 
     * for confirmation to remove and
     * removes the product.
     * if not found, it reports this to user.
     */
    private void doRemoveProduct() {
        //ask code
        String code = readString("Code: ");
        //search product
        Product found = myStore.getProductByCode(code);
        if (found != null) { //product found
            //display product
            System.out.println(found);
            String answer = readString("Sure to remove? (yes/no)");
            if (answer.equalsIgnoreCase("yes")) {
                boolean result = myStore.removeProduct(found);
                if (result) {
                    System.out.println("Successfully removed");
                } else {
                    System.out.println("Product not removed");
                }
            } else {
                System.out.println("Removal cancelled by user");
            }
        } else {  //product not found
            System.out.format("Code %s not found%n",code);
        }
    }
}
