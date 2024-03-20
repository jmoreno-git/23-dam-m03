package store;

/**
 *
 * @author ProvenSoft
 */
public class StoreTest {

    private Store myStore = new Store("La meva botigueta");
    
    public static void main(String[] args) {
//        Product p1 = new Product(null, null, 0, 0);
//        Product p2 = null;
        StoreTest st = new StoreTest();
        st.run();
    }

    private void run() {
        testAddNullProduct();
    }

    private void testAddNullProduct() {
        boolean b = myStore.addProduct(null);
        if (b) {  //added
            System.out.println("Test FAIL");  //FAIL
        } else {  //not added
            System.out.println("Test OK");  //OK
        }
    }
    
}
