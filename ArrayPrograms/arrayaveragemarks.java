import java.util.Scanner;

public class arrayaveragemarks {
    public static void main(String[] args) {
      //  Scanner s=new Scanner(System.in); 
      //  float marks=s.nextFloat();       
      //  float Size []=new float[marks];
     float [] marks={45.7f,67.8f,63.4f,99.2f,100.0f};
       
       float sum=0;
       
       for(float element:marks)
       {
         sum=sum+element;
       }
       System.out.println("The value of average marks is:"+sum/marks.length);
    }
    
}
