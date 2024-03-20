package sets;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
/**
 *
 * @author Jose
 */
public class SetTests {

    public static void main(String[] args) {
        
        Set<String> namesSetA = Set.of("Anne", "John", "Lewis", "Laura");
        Set<String> namesSetB = Set.of("Peter", "John", "Anne", "Zoe");
        
        System.out.println("A: "+namesSetA);
        System.out.println("B: "+namesSetB);
        System.out.println("A union B: "+SetUtils.union(namesSetA, namesSetB));
        System.out.println("A intersection B: "+SetUtils.intersection(namesSetA, namesSetB));
        System.out.println("A - B: "+SetUtils.difference(namesSetA, namesSetB));
        
        Random rnd = new Random(System.currentTimeMillis());
        
        Set<Integer> intSetA = rnd.ints(10, 1, 15).boxed().collect(Collectors.toSet());
        Set<Integer> intSetB = rnd.ints(8, 1, 15).boxed().collect(Collectors.toSet());
        
        System.out.println("A: "+intSetA);
        System.out.println("B: "+intSetB);
        System.out.println("A union B: "+SetUtils.union(intSetA, intSetB));
        System.out.println("A intersection B: "+SetUtils.intersection(intSetA, intSetB));
        System.out.println("A - B: "+SetUtils.difference(intSetA, intSetB));        
    }
    
}
