import java.util.EmptyStackException;
import java.util.Stack;

public class FramStack {
    static void StackExample()
    {
        Stack<String> st=new Stack<>();
        st.push("Vaibhav");
        st.push("Pawan");
        st.push("Sham");
        st.push("Gaurav");
        st.push("Ganesh");

        System.out.println(st);
        System.out.println(st.peek()); //Ganesh
        System.out.println(st.pop()); // Ganesh(will also remove it)
        // try{
        //     while(!st.empty()){
        //         System.out.println(st.pop());
        //     }
        // }
        // catch(EmptyStackException a){
        //     System.out.println(a);
        // }

        System.out.println(st);
        System.out.println(st.peek()); // Gaurav
        System.out.println(st.size());
        st.clear();
        System.out.println(st.empty());
        //System.out.println(st.clear());
    }

    public static void main(String[] args) {

       StackExample();

    }

    
}
