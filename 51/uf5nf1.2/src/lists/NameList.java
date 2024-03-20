package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Provensoft
 */
public class NameList {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        //names.add(new String("Peter"));
        names.add("Peter");
        names.add("Laura");
        names.add("John");
        names.add("Mary");
        names.add("Paul");
        //
        System.out.println("Names: "+names);
        //change 'John' to 'Andrew'
        int indexOfJohn = names.indexOf("John");
        names.set(indexOfJohn, "Andrew");
        System.out.println("Names: "+names);
        names.sort(String::compareTo);
        System.out.println("Names: "+names);
        addSorted(names, "Joseph");
        System.out.println("Names: "+names);
        addSorted(names, "Zoe");
        addSorted(names, "Alan");
        System.out.println("Names: "+names);
        addSorted(names, "Mary");
        System.out.println("Names: "+names);
    }
    
    /**
     * adds 'name' to 'data' keeping order
     * @param data the list to add new element to
     * @param name the element to add
     */
    public static void addSorted(List<String> data, String name) {
        //find index for new element
        int index = -1;
        for (int i = 0; i < data.size(); i++) {
            String elem = data.get(i);
            if ( elem.compareTo(name) > 0 ) {  //found
                index = i;
                break;
            }
        } 
        //set element at proper index
        if (index < 0) {
            data.add(name);
        } else {
            data.add(index, name);
        }
        
    }
    
}
