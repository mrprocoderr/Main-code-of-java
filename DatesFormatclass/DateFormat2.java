import java.util.Date;
public class DateFormat2 {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
  
      // display formatted date
      System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
   }
}