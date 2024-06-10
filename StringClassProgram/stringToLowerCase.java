import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

//import java.util.Scanner;

public class stringToLowerCase {
    public static void main(String[] args)throws Exception{
        // String letter="गौरव विनोद मते";
        // byte [] arr=letter.getBytes();
        // ByteArrayInputStream bin;
        // bin=ByteArrayInputStream(arr);
        // int x;
        
        // do{
        //     x=bin.read();
        //     System.out.println((char)x);
        // }while(x!=-1);



        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your name:");
        // String name = sc.nextLine();
        // System.out.println(name.toLowerCase());
        // sc.close();


        String letter ="गौरव विनोद मते";
        char [] arr= letter.toCharArray();
        CharArrayReader bin;
        bin=new CharArrayReader(arr);
        int x;
        do{
            x=bin.read();
            System.out.print((char)x);
        }while(x!=-1);
        //System.out.println(letter);

    }

}
