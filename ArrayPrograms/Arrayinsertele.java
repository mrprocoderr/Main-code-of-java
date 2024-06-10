import java.util.Scanner;

public class Arrayinsertele {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size:");  //4
        size=sc.nextInt();

        int a[]=new int[size+1];   
        System.out.println("Enter Array Element"); // 33 44 55 66
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Array location:"); // 2
        loc=sc.nextInt();
        System.out.println("Enter new item :");  // 100
        item=sc.nextInt();

        for(i=size;i>loc;i--)   //i=4
        {
            a[i]=a[i-1];     // 4-1= 3 a[3]  Array 3 empty
        }                    // 3-1= 2 a[2]  Array 2 empty

        a[loc]=item;         // a[2]=100
        size++;              // size=5
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");    // 33 44 100 55 66
        }
    }
    
}
