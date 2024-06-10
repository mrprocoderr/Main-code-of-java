import java.util.Scanner;

public class arraymaximininum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int number[]=new int[size];

        //input
        for(int i=0;i<size;i++)
        {
            number[i]=s.nextInt();
        }
         
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++)
        {
            if(number[i]<min);
            {
                min=number[i];
                
            }
            if(number[i]>max);
            {
                max=number[i];
                
            }
        }
        System.out.println("Largest number is:"+ max);
        System.out.println("Smallest number is:"+ min);
    }
    
}
