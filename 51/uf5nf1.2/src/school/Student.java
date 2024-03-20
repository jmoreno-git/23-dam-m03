package school;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jose
 */
public class Student implements Comparable {
    
    private String name;
    private String surname;
    private List<Integer> grades;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.surname);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.surname, other.surname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", surname=").append(surname);
        sb.append(", grades=").append(grades);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        Student other = (Student) o;
        result = this.surname.compareTo(other.surname);
        if (result == 0) {  //surname equals
            result = this.name.compareTo(other.name);
        }
        return result;
    }
    
    public double getMeanGrade() {
        double mean = 0.0;
        if (!grades.isEmpty()) {
            for (Integer grade : grades) {
               mean += grade;
            }
        mean /= grades.size();           
        }
        return mean;
    }
    
    public int getMaxGrade() {
        int max = 0;
//        if (!grades.isEmpty()) {
//            max = grades.get(0);
//            for (int i = 1; i < grades.size(); i++) {
//                max = Math.max(max, grades.get(i));
//            }
//        }
        max = Collections.max(grades); //get max value using Collections class.
        return max;
    }    
}
