import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        // input
        for (int i = 0; i < size; i++) 
        {
            number[i] = sc.nextInt();
        }
        System.out.println("Search Array element:");
        int x = sc.nextInt();

        // output
    
       for(int i=0;i<number.length;i++)
        {
            if (number[i]==x)
             {
                System.out.println("X found at index:" + i);
                break;
          
             } else 
            {
                System.out.println("Invalid choice !" + i);
                      
            }
        
        }


    }

}
