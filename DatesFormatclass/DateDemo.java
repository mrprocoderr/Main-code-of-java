import java.util.*;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      Datedemo2 dNow = new Datedemo2( );
      SimpleDateFormat ft =  new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
