

public class arrayreverseorder {
    public static void main(String[] args) {
       
        int [] arr={1,21,3,4,5,34,67};
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        int temp;
        //System.out.println(" 1,2,3,4,5,34,67 ");
        for(int i=0;i<n;i++)
        {
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        
        }
        for(int element:arr)
        {   
            System.out.print(element+" ");
        }
    }
    
}
