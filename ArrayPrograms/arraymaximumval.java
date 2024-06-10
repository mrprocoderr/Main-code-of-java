public class arraymaximumval {
    public static void main(String[] args) {
        int [] arr={1,211,23,555,62,77,556,556};
        int max=0;
        for(int element:arr)
        {
            if(element>max)
            { 
                max=element;
            }
         
        }
            System.out.println(" The value of the maximun element in this array is:"+max);

        
    }
}
