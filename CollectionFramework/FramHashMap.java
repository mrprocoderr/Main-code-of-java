import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class FramHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("India",120);
        mp.put("US",200);
        mp.put("China",150);
        
        System.out.println(mp);
        mp.put("China",250);
        System.out.println(mp);
        mp.replace("China",250,40);
        System.out.println(mp);
        
        
        System.out.println(mp.containsKey("US"));
        System.out.println(mp.containsValue(250));
        
        System.out.println(mp.get("US"));  // key exists
        System.out.println(mp.get("Aashiya"));  // key doesn't exist 
        
        //    int arr[]={1,2,3};
        //    for(int i=0;i<3;i++){
            //     System.out.print(arr[i] + " ");
            //    }
            //    System.out.println();
            
            //     String arr1[]={"Vaibhav", "Gajanan", "Nagargoje"};
            //     for(String val : arr1){
                //         System.out.print(val +" ")
                //}
                
                for(Map.Entry<String,Integer> e: mp.entrySet()){
                    System.out.println(e.getKey()+" "+ e.getValue());
                }
                System.out.println("All values:");

                
                Collection<Integer> mvalues = mp.values();
                for(Integer s: mvalues){
                    System.out.println(s);
                }
                

        
    }
    
}
