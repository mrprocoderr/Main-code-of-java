import java.util.Scanner;

public class arrayprintd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int clos=sc.nextInt();
        int [][]numbers=new int[rows][clos];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<clos;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        { 
            for(int j=0;j<clos;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }
    }
    
}
