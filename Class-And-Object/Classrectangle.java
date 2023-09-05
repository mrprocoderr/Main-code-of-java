class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    
    public double Perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return (length==breadth);
    }


} 
public class Classrectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=10.5;
        System.out.println("Area :"+r.area());
        System.out.println("perimeter :"+r.Perimeter());
        System.out.println("Is it a Square :"+r.isSquare());
    }
    
}
