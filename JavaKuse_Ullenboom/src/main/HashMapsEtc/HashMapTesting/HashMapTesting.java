package HashMapTesting;
import java.util.HashMap;
import java.util.Map;

public class HashMapTesting {
    public static void main(String[] args) {
        HashMap<String, Product> productsByName = new HashMap<>();

        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        System.out.println(".get(key) -> " + productsByName.get("E-Bike"));
        System.out.println(".get(key).getDescription() -> " + productsByName.get("E-Bike").getDescription());

        // "null" as key
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
        productsByName.put(null, defaultProduct);
        Product nextPurchase = productsByName.get(null);
        System.out.println("\n# hashMap allows \"null\" as key: elementWithNullKey.put(null, object)");
        System.out.println("\"description\" == elementWithNullKey.getDescription() -> " + ("At least buy chocolate" ==  nextPurchase.getDescription()));

        // remove element
        System.out.println("\n# List all Map elements, and remove one -> .remove(element)");
        System.out.println(productsByName);
        productsByName.remove(null);
        System.out.println(productsByName);

        // check if value exists in Map
        System.out.println("\n# Check if \"key\" exists in Map:");
        System.out.println(".containsKey(key) -> " + productsByName.containsKey("E-Bike"));
        System.out.println("\n# Check if \"value\" exists in Map:");
        System.out.println(".containsValue(key) -> " + productsByName.containsValue(eBike));

        // iterating
        System.out.println("\n# Iterating over a HashMap");
        // keySet()
        System.out.println("# .keySet():");
        for (String key : productsByName.keySet()) {
            System.out.println("key: " + key);
        }
        // values()
        System.out.println("\n# .values():");
        for (Object value : productsByName.values()) {
            System.out.println("value: " + value);
        }
        // entrySet
        System.out.println("\n# .entrySet():");
        for (Map.Entry<String, Product> entry : productsByName.entrySet()) {
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }

        // Object as key
        System.out.println("\n# object as key:");
        HashMap<Product, Integer> productAsKey = new HashMap<>();
        productAsKey.put(eBike, 900);
        System.out.println(productAsKey.get(eBike));

        // .forEach()
        System.out.println("\n# .forEach((key, value) -> {do something});");
        productsByName.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        // getOrDefault()
        System.out.println("\n# .getOrDefault(key, alternative)");
        Product chocolate = new Product("chocolate", "something sweet");
        Product defaultProduct02 = productsByName.getOrDefault("horse carriage", chocolate);
        Product bike = productsByName.getOrDefault("E-Bike", chocolate);
        System.out.println(defaultProduct02);
        System.out.println(bike);

        // .putIfAbsent()
        System.out.println("\n# .putIfAbsent(key, value):");
        Product sbc = new Product("Panda", "faster than ever");
        productsByName.putIfAbsent("LattePanda", sbc);
        productsByName.putIfAbsent("E-Bike", sbc);

        productsByName.forEach((key, value) -> {
            System.out.println("\"" + key + "\"" + " : " + value);
        });

        // .merge()
        System.out.println("\n# .merge(key, value, BiFunction):");
        Product eBike2 = new Product("E-Bike", "A bike with a battery");
        eBike2.setTags("sport");
        productsByName.merge("E-Bike", eBike2, Product::addTagsOfOtherProduct);
        System.out.println(eBike);

        // change "key" after adding to HashMap
        System.out.println("\n# change key after adding to hashMap :");
        Product key = new Product("initial");
        Map<Product, String> items = new HashMap<>();
        System.out.println(".hashCode() before change: " + key.hashCode());
        items.put(key, "success");
        key.setDescription("changed");
        System.out.println(".hashCode() after: " + key.hashCode());
        System.out.println(items.getOrDefault(key, "not found"));
    }

}
