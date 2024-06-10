
import java.util.Scanner;
public class stringname {
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");
        Scanner sc=new Scanner(System.in);
       // String str=sc.next();
        //System.out.println(str);

       String str = sc.nextLine();
       System.out.println(str);
       sc.close();
    }
    
}
