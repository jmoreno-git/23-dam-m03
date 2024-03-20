package lists;

import java.util.Comparator;

/**
 *
 * @author ProvenSoft
 */
public class CompareStudentsByNameLength implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = 0;
        int byLength = o1.getName().length() - o2.getName().length();
        if (byLength == 0) {
            result = o1.getName().compareTo(o2.getName());
        } else {
            result = byLength;
        }
        return result;
    }
    
}
