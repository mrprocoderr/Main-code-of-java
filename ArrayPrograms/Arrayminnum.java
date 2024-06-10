import java.util.Scanner;

public class Arrayminnum {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int min;
        int size=sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++)
         {
            a[i] = sc.nextInt();
        }
        min = a[0];
        for (int i = 1; i < size; i++) 
        {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum value:"+min);

    }

}
