package hashMapTesting;

import java.util.HashMap;
public class HashMapHashCollision {
    public static void main(String[] args) {

        HashMap<Product, String> map = new HashMap<>();
        Product k1 = new Product("one", "firstKey");
        Product k2 = new Product("two", "secondKey");
        Product k3 = new Product("three", "thirdKey");

        System.out.println("storing value for k1");
        map.put(k1, "firstValue");
        System.out.println("storing value for k2");
        map.put(k2, "secondValue");
        System.out.println("storing value for k3");
        map.put(k3, "thirdValue");

        System.out.println("retrieving value for k1");
        String v1 = map.get(k1);
        System.out.println("retrieving value for k2");
        String v2 = map.get(k2);
        System.out.println("retrieving value for k3");
        String v3 = map.get(k3);
    }
}
