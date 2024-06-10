import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class FramQueueExample1 {
    static void QueueExa() {
        ArrayDeque<String> q = new ArrayDeque<>();
        q.offer("Vaibhav");
        q.offer("Pawan");
        q.offer("Sham");
        q.offer("Gaurav");
        q.offer("Ganesh");
        System.out.println(q); // [Vaibhav, Pawan, Sham, Gaurav, Ganesh]

        System.out.println(q.peek());// Vaibhav

        System.out.println(q.poll()); // vaibhav- will also remove

        System.out.println(q); // [ Pawan, Sham, Gaurav, Ganesh]

        System.out.println(q.peek()); // Pawan

        System.out.println(q.size()); // 4
        q.clear();
        // q.offer("A");
        // System.out.println(q);
        System.out.println(q.isEmpty()); // true

       //searchig Top of element Methods
        System.out.println(q.peek());// null
        try {
            System.out.println(q.element());// Throws Exception
        } catch (Exception e) {
            System.out.println("Exceotion:-" + e);
        }
        System.out.println("---------------------------------");

        // Deleting Top of element methods
        System.out.println(q.poll());// null
      //  System.out.println(q);
        try {
            System.out.println(q.remove()); // Throws Exception
        } catch (Exception e) {

            System.out.println("Exceotion:-" + e);
        }

    }

    public static void main(String[] args) {
        QueueExa();
    }

}
