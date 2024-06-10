import java.util.Scanner;
public class stringboolean{
    public static void main(String[] args) {
        System.out.println("Taking input from the user:");
        Scanner sc=new Scanner(System.in);
        boolean b1= sc.hasNextFloat();
        System.out.println(b1);
        sc.close();

    }

}