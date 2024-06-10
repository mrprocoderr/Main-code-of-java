import java.util.ArrayDeque;

public class FramDeque {
    static void dequeExa() {
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.addFirst("Vaibhav");
        dq.addFirst("Sham");
        dq.addLast("Narayan");
        dq.addLast("Sumit");
        System.out.println(dq); // [Sham, Vaibhav, Narayan, Sumit]
        System.out.println(dq.pollLast()); // remove Sumit
        System.out.println(dq); // [Sham, Vaibhav, Narayan]
        System.out.println(dq.pollFirst()); // remove Sham
        System.out.println(dq); // [Vaibhav, Narayan]
        System.out.println(dq.size());  //2
        System.out.println(dq.getFirst());  //Vaibhav
        System.out.println(dq.getLast());   //Narayan
        
    }

    public static void main(String[] args) {
        dequeExa();
    }

}
