package school;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class SchoolMain {
    
    private List<Group> groups;

    public SchoolMain() {
        this.groups = new ArrayList<>();
        generateGroups();
    }

    public static void main(String[] args) {
        SchoolMain sm = new SchoolMain();
        sm.init();
    }

    private void init() {
        groups.sort(null);
        System.out.println("Groups: "+groups);
        List<Student> dam1List = getStudentsByGroupName("DAM1");
        System.out.println("Students in DAM1 sorted by natural criteria");
        dam1List.sort(null);
        System.out.println(dam1List);
        //
        List<Student> dam1ListSorted1 = new ArrayList<>(getStudentsByGroupName("DAM1"));
        System.out.println("Students in DAM1 sorted by mean grade");
        dam1ListSorted1.sort(new StudentComparatorByMeanGrade());
        System.out.println(dam1ListSorted1);
        for (Student st : dam1ListSorted1) {
            System.out.printf("%s %s: %.2f%n", 
                    st.getName(), st.getSurname(), st.getMeanGrade());
        }
        //
        List<Student> dam1ListSorted2 = new ArrayList<>(getStudentsByGroupName("DAM1"));
        System.out.println("Students in DAM1 sorted by max grade");
        dam1ListSorted2.sort(new StudentComparatorByMaxGrade());
        System.out.println(dam1ListSorted2);
        for (Student st : dam1ListSorted2) {
            System.out.printf("%s %s: %d%n", 
                    st.getName(), st.getSurname(), st.getMaxGrade());
        }
    }

    private void generateGroups() {
        Group g;
        Student s;
        //
        g = new Group("DAW1");
            //TODO add students
        groups.add(g);
        //
        g = new Group("DAM1");
            //
            s = new Student("Joseph", "Morgan");
                s.getGrades().add(5);
                s.getGrades().add(6);
                s.getGrades().add(3);
                s.getGrades().add(8);
                s.getGrades().add(1);
            g.addStudent(s);
            //
            s = new Student("Albert", "Morgan");
                s.getGrades().add(9);
                s.getGrades().add(7);
                s.getGrades().add(8);
                s.getGrades().add(10);
                s.getGrades().add(7);
            g.addStudent(s);
            //
            s = new Student("Zoe", "Lopez");
                s.getGrades().add(2);
                s.getGrades().add(5);
                s.getGrades().add(6);
                s.getGrades().add(9);
                s.getGrades().add(3);
            g.addStudent(s);
        //
        groups.add(g);

    }
    
    public List<Student> getStudentsByGroupName(String grName) {
        List<Student> list = null;
        for (Group g : groups) {
            if (g.getName().equals(grName)) {
                list = g.getStudents();
                break;
            }
        }
        return list;
    }
}
