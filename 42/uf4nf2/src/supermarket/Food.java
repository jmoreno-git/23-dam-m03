package supermarket;

/**
 *
 * @author Jose
 */
public class Food extends Article {
    
    private String date;
    
    public Food(String name, String maker, double price, String eanCode, String date) {
        super(name, maker, price, eanCode);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public double getPvp() {
        return getPrice() * (1.0+VAT_RED);
    }    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Food{");
        sb.append(super.toString());
//        sb.append("name=").append(getName());
//        sb.append(", maker=").append(getMaker());
//        sb.append(", price=").append(getPrice());
//        sb.append(", eanCode=").append(getEanCode());
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
    
}
