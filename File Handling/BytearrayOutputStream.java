//It is useful for sending the same data from java application to multiple times at a time.

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BytearrayOutputStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream f1=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Text1.txt");
        FileOutputStream f2=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Text2.txt");
        FileOutputStream f3=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Text3.txt");

        ByteArrayOutputStream b1=new ByteArrayOutputStream();
        b1.write(new byte[]{100,97,100,32}); //valid
        b1.write(new byte[]{109,111,109});   //valid
        //b1.write(99);          //valid
        //b1.write(109,111,109); //invalid
        b1.writeTo(f1);
        b1.writeTo(f2);
        b1.writeTo(f3);
        System.out.println("Process Completed!");
        b1.flush();
        
    }
    
}
