package school;

import java.util.Comparator;

/**
 *
 * @author Jose
 */
public class StudentComparatorByMeanGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.signum(o1.getMeanGrade() - o2.getMeanGrade());
    }
    
}
