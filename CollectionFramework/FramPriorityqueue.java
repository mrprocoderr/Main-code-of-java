import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class FramPriorityqueue {
    static void PriorityExa(){
        PriorityQueue<String> pq =new PriorityQueue<>();  // By defoult min priority
        pq.add("Vaibhav");
        pq.add("Ram");
        pq.add("Pawan");
        pq.add("Akshay");
        pq.add("Sham");
        System.out.println(pq); //[Akshay, Pawan, Ram, Vaibhav, Sham]
        System.out.println(pq.peek()); //Akshay
        System.out.println(pq.poll());//Akshay
        System.out.println(pq);       //[Pawan, Sham, Ram, Vaibhav]
        System.out.println(pq.peek()); //Pawan
        System.out.println("***************************************");

    }
    static void PriorityExa1(){
        PriorityQueue<String> pq =new PriorityQueue<>(Comparator.reverseOrder());  // Max priority queue
        pq.add("Vaibhav");
        pq.add("Ram");
        pq.add("Pawan");
        pq.add("Akshay");
        pq.add("Sham");
        System.out.println(pq); //[Vaibhav, Sham, Pawan, Akshay, Ram]
        System.out.println(pq.peek()); //Vaibhav
        System.out.println(pq.poll()); //Vaibhav
        System.out.println(pq);  //[Sham, Ram, Pawan, Akshay]
        System.out.println(pq.peek()); //Sham

    }
    public static void main(String[] args) {
        
        PriorityExa();
        PriorityExa1();
    }
    
}
