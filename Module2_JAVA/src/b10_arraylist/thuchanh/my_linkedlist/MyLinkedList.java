package b10_arraylist.thuchanh.my_linkedlist;

public class MyLinkedList {
    private MyNode head;
    private int numNodes;

    public MyLinkedList(Object data){
        this.head=new MyNode(data);
    }
    private class MyNode {
        private MyNode next;
        private Object data;

        public MyNode(Object data){
            this.data=data;
        }

        public Object getData() {
            return data;
        }

    }
    public void add(int index, Object data){
        MyNode temp= head;
        MyNode holder;
        for(int i=0;i<index-1&& temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new MyNode(data);
        temp.next.next=holder;
        numNodes++;
    }
    public void addFirst(Object data){
        MyNode temp=head;
        head=new MyNode(data);
        head.next=temp;
        numNodes++;
    }
    public Object get(int index){
        MyNode temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public void printList(){
        MyNode temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
