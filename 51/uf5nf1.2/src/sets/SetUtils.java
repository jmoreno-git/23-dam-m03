package sets;

import java.util.HashSet;
import java.util.Set;

/**
 * Utilities for sets
 *
 * @author Jose
 * @param <T>
 */
public class SetUtils<T> {

    /**
     * performs union of two sets
     * @param <T> type of elements of sets
     * @param set1 first set
     * @param set2 second set
     * @return union set
     */
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    /**
     * performs intersection of two sets
     * @param <T> type of elements of sets
     * @param set1 first set
     * @param set2 second set
     * @return intersection set
     */
    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    /**
     * performs difference (complemenentary) of two sets
     * @param <T> type of elements of sets
     * @param set1 first set
     * @param set2 second set
     * @return difference set
     */
    public static <T> Set<T> difference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

}
