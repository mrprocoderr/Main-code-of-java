class Rectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getbreadth() {
        return breadth;
    }

    public void setLength(double l) {
        if (l > 0)
            length = l;
        else
            length = 0;
    }

    public void setbreadth(double b) {
        if (b > 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class ClassPrivateRect {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5.5);
        r.setbreadth(5.5);
        
        System.out.println(r.getLength());
        System.out.println(r.getbreadth());
        
        System.out.println("Area :"+r.area());
        System.out.println("Perimeter :"+r.perimeter());
        System.out.println("It is a Square :"+r.isSquare());

    }

}
