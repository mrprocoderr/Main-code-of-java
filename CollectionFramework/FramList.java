import java.util.ArrayList;

public class FramList {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add(1,"D");
        ar.add("B");
        ar.add("E");
        System.out.println(ar); //[A, D, B, C, B, E]

        int x;
        //indexOf
        x=ar.indexOf("B");
        System.out.println(x);  //2

        //lastIndexOf
        x=ar.lastIndexOf("B");
        System.out.println(x);  //4

        // Removed item from specified index
        ar.remove(1);
        System.out.println(ar); // [A, B, C, B, E]
       
       
        System.out.println(ar.get(2));  //c
        System.out.println(ar.get(4));  //E

        

    }
    
}
