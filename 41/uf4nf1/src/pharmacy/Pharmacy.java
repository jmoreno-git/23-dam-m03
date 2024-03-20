package pharmacy;

import java.util.Objects;

/**
 *
 * @author Jose
 */
public class Pharmacy {
    private String name;
    private Drug[] drugs;

    public Pharmacy(String name) {
        this.name = name;
    }

    public Pharmacy(String name, Drug[] drugs) {
        this.name = name;
        this.drugs = drugs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drug[] getDrugs() {
        return drugs;
    }

    public void setDrugs(Drug[] drugs) {
        this.drugs = drugs;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final Pharmacy other = (Pharmacy) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Pharmacy{" + "name=" + name + '}';
    } 
    
    private int searchDrug(String drugName) {
       int position = -1;
        for (int i = 0; i < drugs.length; i++) {
            if (drugs[i].getName().equals(drugName)) {
                position = i;
                break;
            }
        }
        return position;        
    }
    
    public double getPrice(String drugName) {
        double price = -1.0;
        int position = searchDrug(drugName);
        if (position >= 0) {
            price = drugs[position].getPrice();
        }
        return price;
    }
    
    public double getStock(String drugName) {
        int stock = -1;
        int position = searchDrug(drugName);
        if (position >= 0) {
            stock = drugs[position].getStock();
        }
        return stock;
    }    
    
}
