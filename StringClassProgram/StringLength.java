import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name =sc.nextLine();

        System.out.println(name.length());
       //  int value=name.length();
       // System.out.println(value);
        sc.close();
        
    }
    
}
