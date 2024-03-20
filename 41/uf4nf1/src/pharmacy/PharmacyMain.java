package pharmacy;

/**
 *
 * @author Jose
 */
public class PharmacyMain {

    public static void main(String[] args) {
        PharmacyMain main = new PharmacyMain();
        main.run();        
    }
    
    private void run() {
        Pharmacy pharmacy = new Pharmacy("MyPharmacy");
        Drug[] pharmacyDrugs = loadData();
        pharmacy.setDrugs(pharmacyDrugs);
        showDrugList(pharmacy.getDrugs());
    }
    
    public void showDrugList(Drug[] list) {
        for (Drug drug : list) {
            System.out.println(drug);
        }
    }
    
    private Drug[] loadData() {
        String[][] drugNames = {
            {"Paracetamol", "Ibuprofeno", "Omeprazol", "Amoxicilina"},
            {"Loratadina", "Simvastatina", "Metformina", "Cetirizina"},
            {"Atorvastatina", "Aspirina", "Naproxeno", "Escitalopram"},
            {"Losartán", "Sildenafil", "Montelukast", "Clopidogrel"}
        };
        Double[][] drugPrices = {
            {9.50, 6.75, 12.99, 11.25},
            {5.80, 18.25, 7.99, 8.50},
            {15.75, 4.99, 7.25, 14.50},
            {10.80, 23.99, 9.75, 20.50}
        };
        Integer[][] drugStocks = {
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5},
            {5, 5, 5, 5}
        };
        Drug[] drugs = new Drug[drugNames.length * drugNames[0].length];
        int count = 0;
        for (int i = 0; i < drugNames.length; i++) {
            for (int j = 0; j < drugNames[0].length; j++) {
                drugs[count] = new Drug(drugNames[i][j], drugPrices[i][j], drugStocks[i][j]);
                count++;
            }
        }
        return drugs;
    }
    
}
