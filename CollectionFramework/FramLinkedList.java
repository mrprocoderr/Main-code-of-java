import java.util.LinkedList;
import java.util.ListIterator;

public class FramLinkedList {
    static void Linkedlist() {

        LinkedList<Integer> list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addLast(11);
        list.addLast(15);
        list.addFirst(12);
        list.addFirst(13);
        System.out.println(list);
        
        System.out.println(list.get(3));
        
        list.set(4, 222);
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list.removeFirst());
        
        System.out.println(list);
        System.out.println(list.contains(111));
        System.out.println("------------------------------------");
        
       
    }

    public static void main(String[] args) {

        Linkedlist();

    }

}
