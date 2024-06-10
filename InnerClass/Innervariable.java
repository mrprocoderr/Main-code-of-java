
class Outer{
    int x=10;
    class Inner{
        int y=20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay(){
       Inner obj = new Inner();
       obj.innerDisplay();
       System.out.println(obj.y);
        
    }
}
public class Innervariable {
 
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.outerDisplay();
        Outer.Inner obj = Outer().new Inner();
    }
    
}
