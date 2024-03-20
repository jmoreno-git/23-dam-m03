package bank;

/**
 *
 * @author ProvenSoft
 */
public class Operation {
    private double amount;
    private OperationType type;

    public Operation(double amount, OperationType type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operation{");
        sb.append("amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
    
    
}
