package b10_arraylist.thuchanh.my_linkedlist;

import b10_arraylist.thuchanh.simple_list.MyList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList nodeList=new MyLinkedList(1);

        nodeList.addFirst(0);
        nodeList.add(1,1.5);
        System.out.println(nodeList.get(1));
        
        nodeList.printList();

    }
}
