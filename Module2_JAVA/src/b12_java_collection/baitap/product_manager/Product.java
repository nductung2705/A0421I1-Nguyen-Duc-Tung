package b12_java_collection.baitap.product_manager;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name="";
    private String id="";
    private float price=0;

    public Product(String id, String name, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getId().compareTo(o.getId());
    }
    public String toString(){
        return "ID:" +getId()+", product name: "+getName()+", price: "+getPrice();
    }
}
