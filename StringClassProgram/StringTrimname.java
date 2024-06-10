import java.util.Scanner;
public class StringTrimname {
  public static void main(String[] args) {
    
         System.out.println("Taking input from the user:");
         Scanner sc= new Scanner(System.in);
         String name=sc.nextLine();
         System.out.println(name.trim()); 
         sc.close();
  }    
}
