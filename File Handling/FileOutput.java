import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutput {
    public static void main(String[] args) throws IOException {
        
        String s1="Vaibhav,Vaibhav,Vaibhav"; 
        byte b1[]=s1.getBytes();

        FileOutputStream fo=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
        fo.write(b1);
        fo.close();
        System.out.println("Data saved!");
       
    }
}

