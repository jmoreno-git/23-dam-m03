package lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ProvenSoft
 */
public class StudentMain {

    public static void main(String[] args) {
        //declare and instantiate list of students
        List<Student> students = new ArrayList<>();
        //populate list with data
        loadData(students);
        //show students
        System.out.println("Students: " + students);
        //find student
        int index = students.indexOf(new Student("Name84"));
        if (index >= 0) {
            Student s1 = students.get(index);
            System.out.println("Name04: " + s1);
        } else {
            System.out.println("Name04 is not in the list");
        }
        List<Student> passList = 
                getStudentsWithQualifGreaterThan(students, 5);
        System.out.println("Number of students that pass: "+passList.size());
        System.out.println(passList);
        //
        amendQualif(students, 1);
        System.out.println(students);
        //sort by qualification
        students.sort(new CompareStudentsByQualification());
        System.out.println("Students sorted by qualification: "+students);
        //sort by name
        students.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println("Students sorted by reversed name: "+students);
        //sort by reversed qualification
        students.sort(Comparator.comparing(Student::getQualification).reversed());
        System.out.println("Students sorted by reversed qualification: "+students);
        //sort by natural method
        students.sort(null);
        System.out.println("Students sorted by natural method: "+students);
    }

    private static void loadData(List<Student> stud) {
        Random rnd = new Random();
        //stud.add( new Student("Peter", 4) );
        for (int i = 0; i < 50; i++) {
            String name = String.format("Name%02d", i + 1);
            int qualif = rnd.nextInt(0, 11);
            Student st = new Student(name, qualif);
            stud.add(st);
        }
    }

    /**
     * get all students with qualification greater than
     * or equal to 'qual'
     * @param data the list of students
     * @param qual the threshold of qualification
     * @return a list of students with that filter
     */
    private static List<Student> getStudentsWithQualifGreaterThan(
            List<Student> data, int qual) {
        List<Student> result = new ArrayList<>();
        for (Student s : data) {
            if (s.getQualification() >= qual) {
                result.add(s);
            }
        }
        return result;
    }
    
    /**
     * adds 'diff' to qualifications of all students
     * Qualifications must not be negative nor greater than 10
     * @param data the list of students
     * @param diff the difference of qualification to apply
     */
    private static void amendQualif(List<Student> data, int diff) {
        for (Student s : data) {
            int q = s.getQualification();
            q += diff;
            q = Math.min(10, q);
            q = Math.max(0, q);
            s.setQualification(q);
        }
    }
}
