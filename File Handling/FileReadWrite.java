
// Read from one file and writes its context to another file

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    // public static void main(String[] args) throws IOException{
    // File f1=new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\sai.txt");
    // File f2=new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Om.txt");
    // FileReader fr=new FileReader(f1);
    // FileWriter fw=new FileWriter(f2);
    // int i;
    // while((i=fr.read())!=-1){
    // fw.write(i);
    // }
    // fr.close();
    // fw.close();
    // }

    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Sai.txt");
        File f2 = new File("C:\\Users\\vaibhav\\Desktop\\Suraj\\Om.txt");
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(f1);
            fw = new FileWriter(f2);
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fr.close();
            fw.close();
            System.out.println("Data Saved!");
            System.out.println("File close Succesfully!");

        }

    }
}
