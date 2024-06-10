import java.util.Scanner;

public class arraypresentornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Search element in this array:");
        float num=sc.nextFloat();
        float marks[]={22.3f,44.6f,55.5f,66.6f,77.7f};
        boolean isInArray=false;
        for(float element:marks)
        {
            if(num==element){
            isInArray=true;
            break;
            }
        }
        if(isInArray)  
        {
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
        
    }
    
}
