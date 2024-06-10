import java.util.Scanner;

public class Arraymaxnum{
    public static void main(String[] args) {

        int max;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element");
        for (int i = 0; i < 5; i++) 
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (int i = 1; i < 5; i++)
        {
            if (a[i] > max) 
            {
                max = a[i];
            }
        }
        System.out.println("Maximum number:" + max);
    }

}
