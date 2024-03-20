package sales;

import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class SaleMain {

    private Article[] storeArticles;
    private final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        SaleMain ap= new SaleMain();
        ap.run();
    }
    
    public void run() {
        //create test data
        generateArticles();
        //
        boolean exit = false;
        do {
            //read client data
            Client client = readClient();
            SaleLine[] lines = readSaleLines();
            //create sale
            Sale sale = new Sale(client, lines);
            //print bill
            printBill(sale);
            //ask the user to continue or end program
            String answer = readString("Another client?(Y/N): ");
            if (answer.equalsIgnoreCase("N")) {
                exit = true;
            }
        } while (!exit);
        System.out.println("Goodbye!");
    }    
    
    public Client readClient() {
        Client c = null;
        String nif = readString("Client nif: ");
        String name = readString("Client name: ");
        c = new Client(nif, name);
        return c;
    }
    
    public SaleLine[] readSaleLines() {
        SaleLine[] lines = null;
        //ask number of articles
        int numArticles = Integer.parseInt(readString("Quants articles?: "));
        //instantiate array of lines
        lines = new SaleLine[numArticles];
        for (int i = 0; i < numArticles; i++) {
            //read article code
            String code = readString("Code: ");
            Article art = findArticle(code);
            if (art != null) {
                //read quantity
                int quant = Integer.parseInt(readString("Quantitat: ")); 
                //instantiate a SaleLine and put it in the array of lines
                SaleLine line = new SaleLine(art, quant);
                lines[i] = line;
            }            
        }
        return lines;
    }
    
    /**
     * searches an article with the given code
     * @param code the code to search
     * @return the article found or null if not found
     */
    public Article findArticle(String code) {
        Article a = null;
        for (Article elem : storeArticles) {
            //String elemCode = elem.getCode();
            //if (elemCode.equals(code)) {
            if (elem.getCode().equals(code)) {
                a = elem;
                break;
            }
        }
        return a;
    }
    
    public void printBill(Sale sale) {
        double totalBill = 0.0;
        System.out.println("Client: ");
        System.out.format("\t%s%n", sale.getClient());
        System.out.println("Number of articles: "+sale.getLines().length);
        System.out.format("\t%10s\t%10s\t%10s\t%10s%n",
                    "Code", "Quantity", "Price", "Total");
        for (SaleLine line : sale.getLines()) {
            double totalLine = line.getArticle().getPrice() * line.getQuantity();
            System.out.format("\t%10s\t%10d\t%10.2f\t%10.2f%n", 
                line.getArticle().getCode(),
                line.getQuantity(),
                line.getArticle().getPrice(),
                totalLine);
            totalBill += totalLine;
        }
        System.out.println("To pay: "+totalBill);
    }
    
    public String readString(String message) {
        System.out.print(message);
        return scan.next();
    }
    
    public void generateArticles() {
        storeArticles = new Article[7];
        storeArticles[0] = new Article("A01", "Desc01", 101.0);
        storeArticles[1] = new Article("A02", "Desc02", 102.0);
        storeArticles[2] = new Article("A03", "Desc03", 103.0);
        storeArticles[3] = new Article("A04", "Desc04", 104.0);
        storeArticles[4] = new Article("A05", "Desc05", 105.0);
        storeArticles[5] = new Article("A06", "Desc06", 106.0);
        storeArticles[6] = new Article("A07", "Desc07", 107.0);   
    }
    
}
