import java.util.Scanner;

public class arrayfsum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         float sum=0;
         int i;
         int size=sc.nextInt();
         int  num[]=new int[size];
        {
            for( i=0;i<size;i++){
                num[i]=sc.nextInt();
                sum+=num[i];
            }
            
            System.out.println(sum);
        
        }

      //int size=sc.nextInt();

        
    //    float sum=0;
    //     int i;
    //     float  num[]=new float[5];
    //     {
    //         for( i=0;i<5;i++){
    //             num[i]=sc.nextFloat();
    //             sum+=num[i];
    //         }
            
    //         System.out.println(sum);
    //     }
    
    }
    
}
