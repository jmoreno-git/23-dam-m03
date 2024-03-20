package athlets;

/**
 *
 * @author jmorenp
 */
public class Athlet extends Person {
    
    private String discipline;
    private int number;

    public Athlet(String name, int age, String discipline, int number) {
        super(name, age);
        this.discipline = discipline;
        this.number = number;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String attendClass() {
        return String.format(
                "I’m an athlet, my name is %s and I’m %s",
                this.name, "attending class"
        );
    }

    @Override
    public String swim() {
        return String.format(
                "I’m an athlet, my name is %s and I’m %s",
                this.name, "swimming"
        );
    }

    @Override
    public String jump() {
        return String.format(
                "I’m an athlet, my name is %s and I’m %s",
                this.name, "jumping"
        );
    }

    @Override
    public String run() {
        return String.format(
                "I’m an athlet, my name is %s and I’m %s",
                this.name, "running"
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Athlet{");
        sb.append(super.toString());
        sb.append("discipline=").append(discipline);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
    
}
