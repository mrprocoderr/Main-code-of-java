import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInput {
    public static void main(String[] args) throws IOException{
      FileInputStream fo=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
      BufferedInputStream Bo=new BufferedInputStream(fo);

      int i;
      while((i=Bo.read())!=-1){
        System.out.print((char)i);
      }
      System.out.println();
      System.out.println("Read the Data Succsefully!");
    }
}
