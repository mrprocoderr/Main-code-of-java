import java.util.Scanner;

public class Arraysorting {
    public static void main(String[] vaibhav) {
        int temp;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array element:"); // 14 10 20 30 40
        for (int i = 0; i < 5; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) // i=0
        {
            for (int j = i + 1; j < 5; j++) // j=1
            {
                if (a[i] > a[j]) // 14>10
                {
                    temp = a[i]; // temp=14
                    a[i] = a[j]; // a[0]=10
                    a[j] = temp; // a[1]=14
                }
            }
            System.out.println("Ascending="+a[i] );
         }
        

         // Desending order
        // for (int k = 0; k < 5; k++) //k=0
        // {
        //     for (int j = k + 1; j < 5; j++) // j=1
        //     {
        //         if (a[k] < a[j]) 
        //         {
        //             temp = a[k]; // temp=14
        //             a[k] = a[j]; // a[0]=10
        //             a[j] = temp; // a[1]=14
        //         }
        //     }
        // }
        // for (int k= 0; k < 5; k++) 
        // {
            
        //     System.out.println("Decending"+a[k] );
        // }
        

    }

}
