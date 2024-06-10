import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterr{
    public static void main(String[] args) throws IOException{
        File fo=new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
        FileWriter fw=new FileWriter(fo);
        String s="Priti Sheshrao Misal";
        fw.write(s);
        fw.close();
        System.out.println("Data Saved!");

    }
}
