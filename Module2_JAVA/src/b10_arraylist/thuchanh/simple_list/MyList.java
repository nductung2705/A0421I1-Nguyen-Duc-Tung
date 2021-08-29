package b10_arraylist.thuchanh.simple_list;

import javax.xml.bind.annotation.XmlType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity() {
        int newsize = elements.length * 2;
        elements = Arrays.copyOf(elements, newsize);
    }

    public void add(E newElement) {
        if (size == elements.length) {
            ensureCapacity();
        } else elements[size++] = newElement;
    }

    public void add(int index, E newElement) {
        if (size == elements.length) {
            ensureCapacity();
        } else elements[size++] = elements;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + ",Size only =" + size);
        } else {
            return (E) elements[index];
        }
    }
}
