package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ProvenSoft
 */
public class Colec {

    public static void main(String[] args) {
        //Collection<Integer> data = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        // add data
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        //
        System.out.println("Number of elements: "+data.size());
        //
        for (Integer elem: data) {
            System.out.println(elem);
        }
        //
        Iterator<Integer> iter = data.iterator();
        while (iter.hasNext()) {
            Integer elem = iter.next();
            System.out.println(elem);
        }
        System.out.println("Collection contains value 5?: "+data.contains(5));
        //
        System.out.println("Is empty?: "+data.isEmpty());
        //
//        data.remove(5);
//        System.out.println(data.toString());
        //
//        data.clear();
//        System.out.println(data.toString());
//        System.out.println("Is empty?: "+data.isEmpty());
//        System.out.println("Size: "+data.size());
        //
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
        //
        data.set(3, 15);
        System.out.println(data);
        data.add(1, 10);
        data.add(4, 2);
        System.out.println(data);
        System.out.println("Find the 1st value 2: "+data.indexOf(2));
        System.out.println("Find the last value 2: "+data.lastIndexOf(2));
        //
        data.add(0, 8);
        System.out.println(data);
        //
        data.remove(Integer.valueOf(3));
        System.out.println(data);
        data.remove(5); //remove element at index 5
        System.out.println(data);
    }
    
}
