package person;

/**
 *
 * @author ProvenSoft
 */
public class Employee extends Person {
    private int id;
    private double salary;
    private String department;
    private int hiringYear;

    public Employee() {
    }

    public Employee( 
            int id,
            String nif, 
            String name, 
            String address, 
            String phone, 
            int birthYear,
            double salary, 
            String department, 
            int hiringYear
    ) {
        super(nif, name, address, phone, birthYear);
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.hiringYear = hiringYear;
    }

    public Employee(Employee other) {
        super(other);
        this.id = other.id;
        this.salary = other.salary;
        this.department = other.department;
        this.hiringYear = other.hiringYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public void setHiringYear(int hiringYear) {
        this.hiringYear = hiringYear;
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
        final Employee other = (Employee) obj;
        return this.id == other.id;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append(super.toString());
        sb.append("id=").append(id);
        sb.append(", salary=").append(salary);
        sb.append(", department=").append(department);
        sb.append(", hiringYear=").append(hiringYear);
        sb.append('}');
        return sb.toString();
    }
    
    
}
