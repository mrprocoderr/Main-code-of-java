import java.util.Scanner;
public class arraynames {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
          System.out.println("Enter a number:");
          int size=s.nextInt();
          String names []=new String [size];
        
          //input
          for(int i=0;i<size;i++)
          {
             names[i]=s.next();
          }
          
          //output
         for(int i=0;i<names.length;i++)
          {  
               System.out.println(" name "+(i+1)+" is: "+names[i]);
          }
    }
}
