import java.util.Scanner;

abstract class Shape {
    abstract double perimeter();

    abstract double area();

}

class Circle extends Shape {
    double radius;

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {
    double length;
    double breadth;

    double perimeter() {
        return 2 * (length + breadth);
    }

    double area() {
        return length * breadth;
    }
}

public class abstractshape {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth:");
        r.length=sc.nextDouble();
        r.breadth=sc.nextDouble();

        
        // r.length = 10;
        // r.breadth = 5;
        
        System.out.println("Perimeter of Rectangle:"+r.perimeter());
        System.out.println("Area of Rectangle:"+r.area());
        
        Circle c=new Circle();
        System.out.println("Enter the radius:");
        c.radius=sc.nextDouble();
        System.out.println("Area of Circle:"+c.area());
    }

}
