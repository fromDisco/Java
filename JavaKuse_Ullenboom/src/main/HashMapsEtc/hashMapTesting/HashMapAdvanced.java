package hashMapTesting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @see <a href="https://www.baeldung.com/java-hashmap-advanced">HashMap reference</a>
 */
public class HashMapAdvanced {
    public static void main(String[] args) {
        Product key = new Product("one");
        Map<Product, String> myMap = new HashMap<>();

        // hashMap.put(key, val) returns old value
        String initialVal = myMap.put(key, "val");
        System.out.println("# initialVal returned from .put(key, val) -> " + initialVal);
        System.out.println("object=key -> " + myMap + "\n");

        // replacing initial value, returns it
        String oldVal = myMap.put(key, "val2");
        System.out.println("# oldVal returned from .put(key, val2) -> " + oldVal);
        System.out.println("object=key -> " + myMap);


        // distinguish between value == null and and key not present in Map
        Map<String, String> stringMap = new HashMap<>();

        String val1 = stringMap.get("key");
        boolean valPresent = stringMap.containsKey("key");
        System.out.println("\n# distinguish between not excistent and mapped to null");
        System.out.println(".get(key): -> " + val1);
        System.out.println(".containsKey(key) -> " + valPresent);

        stringMap.put("key", null);
        String val = stringMap.get("key");
        valPresent = stringMap.containsKey("key");
        System.out.println("\n.get(key): -> " + val1);
        System.out.println(".containsKey(key) -> " + valPresent);

        Map<String, String> productMap = new HashMap<>();
        productMap.put("product01", "Food");
        productMap.put("product02", "Clothes");

        Set<String> productKeySet = productMap.keySet();
        Iterator<String> productKeyIterator = productKeySet.iterator();
        while (productKeyIterator.hasNext()) {
            System.out.println(productMap.get(productKeyIterator.next()));
        }
    }
}
