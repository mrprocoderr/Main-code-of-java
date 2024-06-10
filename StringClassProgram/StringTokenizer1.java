import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
       // String str="sham,ram,naru,sumit,vaibhav";
        
        int count=0;
        StringTokenizer word =new StringTokenizer(str);
       // StringTokenizer word =new StringTokenizer(str,",",true);
       // System.out.println("Total Tokens=" + word.countTokens());
        while(word.hasMoreTokens()){
            System.out.println(word.nextToken());
           // count++;
        }
       //  System.out.println("Total Tokens=" + count);
        //System.out.println("Total Tokens=" + word.countTokens());
        
    }
    
}
