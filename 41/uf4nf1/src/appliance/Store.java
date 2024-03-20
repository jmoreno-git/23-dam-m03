
package appliance;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Store {
    
    private String name;
    private Appliance[] appliances;

    public Store() {
    }

    public Store(String name, Appliance[] appliances) {
        this.name = name;
        this.appliances = appliances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Appliance[] getAppliances() {
        return appliances;
    }

    public void setAppliances(Appliance[] appliances) {
        this.appliances = appliances;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
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
        final Store other = (Store) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Store{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * searches the appliance with the given name
     * @param name the name of the appliance to search
     * @return tha appliance found or null if not found
     */
    public Appliance searchAppliance(String name) {
        Appliance result = null;
        for (Appliance elem : appliances) {
            if (elem.getName().equals(name)) {
                result = elem;
                break;
            }
        }
        return result;
    }
}
