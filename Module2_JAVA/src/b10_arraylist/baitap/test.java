package b10_arraylist.baitap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
    }
}

