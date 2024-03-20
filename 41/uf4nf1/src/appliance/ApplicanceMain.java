
package appliance;

/**
 *
 * @author ProvenSoft
 */
public class ApplicanceMain {

    private Store myStore;
    
    public static void main(String[] args) {
        ApplicanceMain ap = new ApplicanceMain();
        ap.run();
        //ap.tests();
    }
    
    public void tests() {
        System.out.println("Appliance.IVA: "+Appliance.VAT);
        Appliance a1 = new Appliance("Tv52", "Brown", 1000.0, EnergyType.E, 15.0);
        Appliance a2 = new Appliance("Fridge", "White", 1400.0, EnergyType.C, 120.0);
        System.out.println("a1.IVA: "+a1.VAT);
        System.out.println("a2.IVA: "+a2.VAT);
        System.out.println("Appliance.IVA: "+Appliance.VAT);
//        a2.VAT = 0.10;
//        System.out.println("a1.IVA: "+a1.VAT);
//        System.out.println("a2.IVA: "+a2.VAT);
//        System.out.println("Appliance.IVA: "+Appliance.VAT);
        //
        System.out.println("a1.getPriceWithVat(): "+a1.getPriceWithVat());
        System.out.println("Appliance.calcPriceWithVat(): "+Appliance.calcPriceWithVat(200.0));
    }
    
    public void run() {
        //here goes all the main code
        //myStore = new Store();
        //myStore.setName("Electrodomèstics Paco");
        Appliance[] appliances = generateData();
        //myStore.setAppliances(appliances);
        myStore = new Store("Electrodomèstics Paco", appliances);
        System.out.println("Printing all appliances of store "+myStore.getName());
        printAppliances(myStore.getAppliances());
        String applName = "Fridge"; 
        System.out.println("Search appliance "+applName);
        Appliance found = myStore.searchAppliance(applName);
        printAppliance(found);
        //
        applName = "Phone"; 
        System.out.println("Search appliance "+applName);
        found = myStore.searchAppliance(applName);
        printAppliance(found);
    }
    
    public void printAppliances(Appliance[] appliances) {
        for (int i = 0; i < appliances.length; i++) {
            System.out.println(appliances[i].toString());
        }
    }
    
    public void printAppliance(Appliance appliance) {
        if (appliance != null) {
            System.out.println(appliance);
        } else {
            System.out.println("Not found!");
        }
    }
    
    private Appliance[] generateData() {
        Appliance[] devices = new Appliance[5];
        devices[0] = new Appliance("Tv", "black", 800.0, EnergyType.C, 20.0);
        devices[1] = new Appliance("Fridge", "White", 1200.0, EnergyType.B, 200.0);
        devices[2] = new Appliance("Kitchen", "Gray", 1000.0, EnergyType.F, 80.0);
        devices[3] = new Appliance("Toaster", "Blue", 30.0, EnergyType.D, 2.0);
        devices[4] = new Appliance("Washing Machine", "White", 600.0, EnergyType.C, 100.0);
        return devices;
    }
}
