import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
        int i;
        while ((i=fi.read())!=-1) {
            System.out.print((char)i);
        }
        fi.close();
    }
    
}
