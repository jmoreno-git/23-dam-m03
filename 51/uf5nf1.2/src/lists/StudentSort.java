package lists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class StudentSort {

    public static void main(String[] args) {
        Student st1 = new Student("Peter", 6);
        Student st2 = new Student("John", 8);
        System.out.println("st1.compareTo(st2): "+ st1.compareTo(st2));
        CompareStudentsByQualification studentComparator1 = new CompareStudentsByQualification();
        System.out.println("Compare students by qualif: "+
                studentComparator1.compare(st1, st2));
        CompareStudentsByNameLength studentsComparator2 = new CompareStudentsByNameLength();
        System.out.println("Compare students by name length: "+
                studentsComparator2.compare(st1, st2));
        List<Student> group = new ArrayList<>();
        group.add( new Student("Joseph", 5) );
        group.add( new Student("Albert", 8) );
        group.add( new Student("Zoe", 9) );
        group.add( new Student("Gabriel", 4) );
        group.add( new Student("Leonard", 2) );
        group.add( new Student("Martin", 6) );
        System.out.println("Unordered list");
        printList(group);
        System.out.println("Sort list with natural order (name)");
        group.sort(null);
        printList(group);
        System.out.println("Sort list by qualification");
        group.sort(studentComparator1);
        printList(group);
        System.out.println("Sort list by name length");
        group.sort(studentsComparator2);
        printList(group);
    }
    
    public static void printList(List<Student> data) {
        for (Student student : data) {
            System.out.println(student);
        }
    }
}
