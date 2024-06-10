import java.util.ArrayList;

import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        System.out.println("---------------------------------");

        //get element
        int element =list.get(1);
        System.out.println(element);
        System.out.println("---------------------------------");

        //add element in between
        list.add(0,0);
        System.out.println(list);
        System.out.println("---------------------------------");

        //set element
        list.set(0, 5);
        System.out.println(list);
        System.out.println("---------------------------------");

        //delete element
        list.remove(2);
        System.out.println(list);
        System.out.println("---------------------------------");

        //size
        int size=list.size();
        System.out.println(size);
        System.out.println("---------------------------------");
        
        //loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.println("---------------------------------");

        // sorting
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------------------------");
    }
    
}
