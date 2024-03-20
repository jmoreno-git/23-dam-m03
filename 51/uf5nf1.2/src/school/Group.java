package school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jose
 */
public class Group implements Comparable {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Group other = (Group) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group{");
        sb.append("name=").append(name);
        sb.append(", students=").append(students);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Group other = (Group) o;
        return name.compareTo(other.name);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    
}
