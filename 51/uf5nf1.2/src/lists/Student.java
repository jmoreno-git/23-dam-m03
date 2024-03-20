package lists;

import java.util.Objects;

/**
 *
 * @author ProvenSoft
 */
public class Student implements Comparable {
    private String name;
    private int qualification;

    public Student(String name, int qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
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
        final Student other = (Student) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", qualification=").append(qualification);
        sb.append('}');
        return sb.toString();
    }

    /**
     * compares students by name
     * @param o the object to compare with
     * @return negative, zero or positive integer acording to comparison
     */
    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return this.name.compareTo(other.name);
//        String name = this.name;
//        String otherName = other.name;
//        return name.compareTo(otherName);
    }
    
}
