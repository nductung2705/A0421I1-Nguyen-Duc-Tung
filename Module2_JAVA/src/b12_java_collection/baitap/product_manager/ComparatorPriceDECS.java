package b12_java_collection.baitap.product_manager;

import java.util.Comparator;

public class ComparatorPriceDECS implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return -1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return 1;
        } else return 0;
    }
}
