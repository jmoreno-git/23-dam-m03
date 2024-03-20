package bank;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Bank {
    private String name;
    private String code;
    private Account[] accounts;
    //
    private final int MAX_ACCOUNTS = 100;
    private int numAccounts;

    public Bank(String name, String code) {
        this.name = name;
        this.code = code;
        this.numAccounts = 0;
        this.accounts = new Account[MAX_ACCOUNTS];
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public Account[] getAccounts() {
        return Arrays.copyOf(accounts, numAccounts);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.code);
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
        final Bank other = (Bank) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.code, other.code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bank{");
        sb.append("name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", numAccounts=").append(numAccounts);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * add a new account to the bank
     * @param acc the account to add
     * @return true if successfully added, false otherwise
     */
    public boolean addAccount(Account acc) {
        boolean b = false;
        //TODO avoid iban duplicates
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = acc;
            numAccounts++;
            b = true;
        }
        return b;
    }
    
}
