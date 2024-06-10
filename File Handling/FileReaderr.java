import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    // public static void main(String[] args) throws IOException {
    // File fo=new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
    // FileReader fr=new FileReader(fo);
    // int i;
    // while ((i=fr.read())!=-1) {
    // System.out.print((char)i);
    // }
    // fr.close();
    // System.out.println();
    // System.out.println("File succesfully close!");
    // System.out.println("Data read succesfully!");
    // }

    public static void main(String[] args) throws IOException {
        File fo = new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(fo);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } 
        catch (Exception e) {
             System.out.println(e);
        } 
        finally {

            fr.close();
            System.out.println();
            System.out.println("File succesfully close!");
            System.out.println("Data read succesfully!");
        }

    }

}