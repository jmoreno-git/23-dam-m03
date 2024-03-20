package store;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class Store {

    private String name;
    private List<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public List<Product> getAllProducts() {
        List<Product> result = null;
        result = new ArrayList<>(products);
        return result;
    }
    
    /**
     * gets the product with the given code
     * @param code the code to search
     * @return the product with the given code or null if not found
     */
    public Product getProductByCode(String code) {
        Product result = null;
        int index = products.indexOf(new Product(code));
        if (index >= 0) {
            result = products.get(index);
        }
        return result;
    }
    
    /**
     * searches prducts with stock lower than given value
     * @param stock the min value for stock
     * @return a list of products or empty list if none is found
     */
    public List<Product> getProductsWithLowStock(int stock) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getStock() < stock) {
                result.add(p);
            }
        }
        return result;
    }
    
    /**
     * adds a product to the list,
     * avoids null objects, objects with null code and code duplicates.
     * @param product the product to add
     * @return true if successfully added, false otherwiser
     */
    public boolean addProduct(Product product) {
        boolean b = false;
        if ( (product != null) && (product.getCode() != null) ) {
            if (!products.contains(product)) {
                products.add(product);
                b = true;
            }
            
        }
        return b;
    }

    /**
     * modifies current with product
     * avoids that product be null and its code to be null.
     * avoids code duplicates.
     * @param current the current version of product
     * @param product the new version of product
     * @return true is successfully modified, false otherwise
     */
    public boolean modifyProduct(Product current, Product product) {
        boolean b = false;
        //TODO perform verifications
        int index = products.indexOf(current);
        if (index >= 0) {
            products.set(index, product); 
            b = true;            
        }
        return b;
    }

    /**
     * removes a product from the list
     * @param product the product to remove
     * @return true if successfully removed, false otherwise
     */
    public boolean removeProduct(Product product) {
        boolean b = false;
        b = products.remove(product);
        return b;
    }
    
    public void generateProducts() {
        products.add( new Product("code01", "desc01", 101.0, 11));
        products.add( new Product("code02", "desc02", 102.0, 12));
        products.add( new Product("code03", "desc03", 103.0, 13));
        products.add( new Product("code04", "desc04", 104.0, 14));
        products.add( new Product("code05", "desc05", 105.0, 15));    
    }
}
