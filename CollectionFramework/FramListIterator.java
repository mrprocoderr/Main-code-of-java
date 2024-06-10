
import java.util.LinkedList;
import java.util.ListIterator;
public class FramListIterator {
    static void ListiterExa(){
        LinkedList<String> lk = new LinkedList<>();
        lk.add("Icecream");
        lk.add("Sabun");
        lk.add("Handwash");
        lk.add("Feshwash");
        lk.add(1,"ToothJel");
        lk.add("Shampu");
        System.out.println(lk);

        // for(int i=0;i<lk.size();i++){
        //     System.out.println(lk.get(i));
        // }
        // for(String s: lk){
        //     System.out.println(s);
        // }
        System.out.println("Length of LinkedList:"+lk.size()); // 6
        System.out.println("Search the element:"+lk.get(3));   //Handwash
        System.out.println("Remove the specific index element:"+lk.remove(4)); //Feshwash
        System.out.println("Search top of element:"+lk.peek()); //Icecream
        System.out.println("Remove top of element:"+lk.poll());  //Icecream

        System.out.println("------------------------------------");


         //Grtting ListIterator
        ListIterator<String> lt = lk.listIterator();
        //Traversing element
        System.out.println("Forword Direction Iteration:-");
        while(lt.hasNext()){
            System.out.println(lt.next());  //ToothJel, Sabun, Handwash, Shampu
        }
        
        System.out.println("------------------------------------");
        System.out.println("Backword Direction Iteration:-");
      while(lt.hasPrevious()){
            System.out.println(lt.previous());  //Shampu, Handwash, Sabun, ToothJel
        }

        
    }
    public static void main(String[] args) {
        ListiterExa();   //call to function
    } 
    
}
