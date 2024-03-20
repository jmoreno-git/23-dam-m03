package school;

import java.util.Comparator;

/**
 *
 * @author Jose
 */
public class StudentComparatorByMaxGrade implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMaxGrade() - o2.getMaxGrade();
    }
    
}
