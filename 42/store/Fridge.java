package store;

/**
 *
 * @author ProvenSoft
 */
public class Fridge extends Product {
    private int capacity;
    private boolean noFrost;

    public Fridge(String code, String description, double price, int stock, 
            int capacity, boolean noFrost) {
        super(code, description, price, stock);
        this.capacity = capacity;
        this.noFrost = noFrost;
    }
    public Fridge(Fridge other) {
        super(other);
        this.capacity = other.capacity;
        this.noFrost = other.noFrost;
    }    

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fridge{");
        sb.append(super.toString());
        sb.append("[capacity="); sb.append(capacity); sb.append("]");
        sb.append("[noFrost="); sb.append(noFrost); sb.append("]");
        sb.append("}");
        return sb.toString();
    }    
    
}
