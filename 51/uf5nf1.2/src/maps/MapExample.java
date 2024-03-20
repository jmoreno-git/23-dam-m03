package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ProvenSoft
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        //populate data
        items.put("F", 60);
        items.put("A", 10);
        items.put("B", 20);
        items.put("C",30);
        items.put("D", 40);
        items.put("E", 50);

        //
        System.out.println("Iterate map with an keyset");
        Set<String> keys = items.keySet();
        for (String key : keys) {
            System.out.format("key: %s, value: %d%n",
                    key, items.get(key));
        }
        System.out.println("Iterate map with for-each");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.format("key: %s, value: %d%n",
                    key, value);
        }
        System.out.println("Iterate map with iterator");
        Set<Map.Entry<String, Integer>> entries =  items.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = entries.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.format("key: %s, value: %d%n",
                    key, value);
        }
        //
        items.replace("C", 70);
        System.out.println(items);
        System.out.println("Items contains key D? "+items.containsKey("D"));
        System.out.println("Items contains value 50? "+items.containsValue(50));
        items.remove("C");
        System.out.println(items);
    }
    
}
