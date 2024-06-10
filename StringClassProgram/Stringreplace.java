
import java.util.Scanner;

public class Stringreplace {
  public static void main(String[] args) {

    // System.out.println("Taking input from the user:");
    // Scanner sc = new Scanner(System.in);
    // String text = sc.nextLine();
    // System.out.println(text.replace(" ", "i"));

    System.out.println("Taking input from the user:");
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    String letter="Dear <|name|>,Thanks a lot !";
    System.out.println(letter.replace("<|name|>",text));
    sc.close();
  }

}
