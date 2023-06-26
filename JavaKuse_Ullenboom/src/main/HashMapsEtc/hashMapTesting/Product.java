package hashMapTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private String description;
    private List<String> tags = new ArrayList<>();

    // Constructors
    Product(String name) {
        this.name = name;
    }

    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // standard getters/setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags.add(tags);
    }

    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }

    // to use the product object as a key for a hashMap it has to integrate .equals() and .hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product product = (Product) obj;
        return Objects.equals(this.name, product.name) && Objects.equals(this.description, product.description);
    }

    @Override
    public int hashCode() {
        int objHash = Objects.hash(this.name, this.description);
        System.out.println("Object hash -> " + objHash);
        return objHash;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }
}
