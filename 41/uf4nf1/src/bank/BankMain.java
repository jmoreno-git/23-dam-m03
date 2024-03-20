
package bank;

import java.util.Scanner;

/**
 *
 * @author ProvenSoft
 */
public class BankMain {
    
    private Bank myBank;
    private Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        BankMain ap = new BankMain();
        ap.run();
    }

    private void run() {
        generateBank();
        System.out.println(myBank.toString());
        printAllAccounts();
        //TODO loop to serve clients
        boolean exit = false;
        do {            
            serveClient();
            exit = endProgram();
        } while (!exit);
    }

    private void generateBank() {
        myBank = new Bank("Robobank", "1234");
        int num = 100000;
        myBank.addAccount(new Account(
            String.format("ES%s%d", myBank.getCode(), num),
            new Client("1111A", "Client01"),
            3.0, 1000.0));
        num++;
        myBank.addAccount(new Account(
            String.format("ES%s%d", myBank.getCode(), num),
            new Client("1112A", "Client02"),
            2.0, 2000.0));
        num++;
        myBank.addAccount(new Account(
            String.format("ES%s%d", myBank.getCode(), num),
            new Client("1113A", "Client03"),
            5.0, 3000.0));
    }

    private void printAllAccounts() {
        for (Account acc : myBank.getAccounts()) {
            System.out.println(acc.toString());
        }
    }

    private void serveClient() {
        //ask iban
        
        //ask type of operation
        
        //ask amount
        
        //report result to user
        
    }

    private boolean endProgram() {
        String answer = readString(("Tancar programa? Y/N: "));
        return answer.equalsIgnoreCase("Y");
    }
    
    public String readString(String message) {
        System.out.print(message);
        return scan.next();
    }    
    
}
