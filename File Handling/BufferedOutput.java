import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutput {
    public static void main(String[] args) throws IOException{
      FileOutputStream fo=new FileOutputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
      BufferedOutputStream Bo=new BufferedOutputStream(fo);
    
      String s= "Vaibhav Gajanan Nagargoje";
      byte b[]=s.getBytes();
      Bo.write(b);
      Bo.close();
      fo.close();
      System.out.println("Data Saved!");
    }
    
}




