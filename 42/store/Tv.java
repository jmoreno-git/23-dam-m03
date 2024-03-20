package store;

/**
 *
 * @author ProvenSoft
 */
public class Tv extends Product {
    //attributes.
    private int inches;
    
    //constructors.
    public Tv(String code, String description, double price, int stock, int inches) {
        super(code, description, price, stock);
        this.inches = inches;
    }
    
    public Tv(Tv other) {
        super(other);
        this.inches = other.inches;
    }
    
    //accessors.

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    //methods.

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tv{");
        sb.append(super.toString());
        sb.append("[inches="); sb.append(inches); sb.append("]");
        sb.append("}");
        return sb.toString();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
