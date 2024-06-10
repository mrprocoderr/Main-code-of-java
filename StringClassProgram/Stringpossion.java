import java.util.Scanner;

public class Stringpossion {
    public static void main(String []vaibhav)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input from the user:");
        String name=sc.nextLine();
        System.out.println(name.charAt(10));
        sc.close();

    }
    
}
