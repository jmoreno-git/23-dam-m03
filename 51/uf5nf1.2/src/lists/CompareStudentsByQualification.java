package lists;

import java.util.Comparator;

/**
 *
 * @author ProvenSoft
 */
public class CompareStudentsByQualification implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int q1 = o1.getQualification();
        int q2 = o2.getQualification();
        return q1 - q2;
    }
    
}
