
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringTokenizerPercentage {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String str;
        float grade;
        float sum=0.0f;
        int count=0;
    
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sumit.txt"));
        StringTokenizer data;
        try{
            while ((str= br.readLine()) != null) {
                    data = new StringTokenizer(str);
               while(data.hasMoreTokens()){
                grade=Float.parseFloat(data.nextToken());
                sum+=grade;
                count++;
            } 
            System.out.println("Avg="+sum/count);
          }
        }    
        catch(NumberFormatException e){
            System.out.println("Invalide Dada");
          }
        }
}



// public class StringTokenizerPercentage {
//     public static void main(String[] args) {
//         String str;
//         float grade;
//         float sum=0.0f;
//         int count=0;
//         System.out.println("Enter a number sapreted by space:");
//         Scanner sc=new Scanner(System.in);
//         str =sc.nextLine();
//         StringTokenizer data=new StringTokenizer(str);
//         try{
//             while(data.hasMoreTokens()){
//                 grade=Float.parseFloat(data.nextToken());
//                 sum+=grade;
//                 count++;
//             }
//             System.out.println("Avg="+sum/count);
//         }
//         catch(NumberFormatException e){
//             System.out.println("Invalide Dada");
//           }
//         }
// }


