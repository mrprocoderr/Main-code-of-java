
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class FramHashSet1 {
    static void HashsetExa() {
        HashSet<String> st = new HashSet<>();
        st.add("Surendra");
        st.add("Ganesh");
        st.add("Matadi");
        st.add("Ganesh");
        st.add("vaibhav");
        st.add("Surendra");
       
        System.out.println("Size of set is:" + st.size());
        // Delete
        st.remove("Ganesh");
        if (!st.contains("Ganesh")) {
            System.out.println("Does not contain Ganesh - we delet");
        }
        // size
        System.out.println("Size of set is:" + st.size());
        System.out.println(st);

        // search - contains
        System.out.println(st.contains("Ganesh"));

        if (st.contains("Matadi")) {
            System.out.println("set contains Matadi");
        }
        if (!st.contains("Sham")) {
            System.out.println("Does not contain");
        }
        // Iterator
        java.util.Iterator<String> it = st.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        HashsetExa();
    }

}
