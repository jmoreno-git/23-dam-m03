package bank;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Account {
    private String iban;
    private Client client;
    private double interesRate;
    private double balance;
    private Operation[] operations;
    //
    private final int MAX_OPERATIONS = 200;
    private int numOperations;
    
    public Account(String iban, Client client, double interesRate, double balance) {
        this.iban = iban;
        this.client = client;
        this.interesRate = interesRate;
        this.balance = balance;
        this.operations = new Operation[MAX_OPERATIONS];
        this.numOperations = 0;
    }

    public String getIban() {
        return iban;
    }

    public Client getClient() {
        return client;
    }

    public double getInteresRate() {
        return interesRate;
    }

    public double getBalance() {
        return balance;
    }

    public Operation[] getOperations() {
        return operations;
    }

    public int getNumOperations() {
        return numOperations;
    }

    public void setInteresRate(double interesRate) {
        this.interesRate = interesRate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.iban);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        return Objects.equals(this.iban, other.iban);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account{");
        sb.append("iban=").append(iban);
        sb.append(", client=").append(client);
        sb.append(", interesRate=").append(interesRate);
        sb.append(", balance=").append(balance);
        sb.append(", numOperations=").append(numOperations);
        sb.append('}');
        return sb.toString();
    }
    
    
}
