import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class FramArrayList {
    static void Arraylist() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(111);
        list.add(4);
        System.out.println(list); //print the list [0, 1, 2, 111, 4]

        System.out.println(list.get(3)); // 111

        list.set(4, 222);  
        System.out.println(list); //[0, 1, 2, 111, 222]

        System.out.println(list.contains(111)); // true
        System.out.println("By using array:");
        Object[] arr = list.toArray();
        int i;
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]); //0
                                        //1
                                        //2
                                        //111
                                        //22 
}
        
        System.out.println(list.isEmpty()); //false
        list.clear();                // all code clear 
        System.out.println(list.isEmpty()); //true
        System.out.println("------------------------------------");

    }

    static void Linkedlist() {

        LinkedList<Integer> list = new LinkedList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        System.out.println(list.get(3));

        list.set(4, 222);
        System.out.println(list);

        System.out.println(list.contains(111));
        System.out.println("------------------------------------");

    }
    static void StackExample(){
        Stack<String> st=new Stack<>();
        st.push("Vaibhav");
        st.push("Pawan");
        st.push("Sham");
        st.push("Gaurav");
        st.push("Ganesh");

        System.out.println(st);
        System.out.println(st.peek()); //Ganesh
        System.out.println(st.pop()); // Ganesh(will also remove it)
        System.out.println(st);
        System.out.println(st.peek()); // Gaurav
        System.out.println(st.size());
        
        System.out.println(st.empty());
        //System.out.println(st.clear());
    }

    public static void main(String[] args) {

        Arraylist();
        // Linkedlist();
        // StackExample();
        

    }

}
