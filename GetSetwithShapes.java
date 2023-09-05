import java.util.Scanner;

class Rectangle {
    int length, breadth;
    // setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // getters
    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public double areaRectangle() {
        return this.length * this.breadth;
    }
}
class square extends Rectangle{
    int size;
    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return this.size;
    }
    public int squareArea(){
        return this.size*this.size;
    }
}

class circle extends square {
    double radius;

    public void setRadiuss(Double radius) {
        this.radius = radius;
    }

    public double getRadiuss() {
        return this.radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }
}

class cylinder extends circle {
    double radius, height;

    public void setRadiusss(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadiusss() {
        return this.radius;
    }

    public double getHeight() {
        return this.height;
    }

    public double volumeofcylinder() {
        return Math.PI * (this.radius * this.radius) * this.height;
    }

}
class Sphere extends cylinder{
    double radius;

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double SphereArea(){
      return 4*Math.PI*(radius*radius);
    }
}

public class GetSetwithShapes {
public static void main(String[] args) {
    Sphere s=new Sphere();
    Scanner sc=new Scanner(System.in);

    //Rectangle
    System.out.println("\4------------------------------\4");
    System.out.println("Enter the Length & Breadth:");
    int a =sc.nextInt();
    int b =sc.nextInt();
    s.setLength(a);
    s.setBreadth(b);
    System.out.println("Area of Rectangle:"+s.areaRectangle());
    System.out.println("\4------------------------------\4");

    //Square
    System.out.println("\4------------------------------\4");
    System.out.println("Enter the Size:");
    int c=sc.nextInt();
    s.setSize(c);
    System.out.println("Size of Square:"+s.squareArea());
    System.out.println("\4------------------------------\4");

    //circle
    System.out.println("\4------------------------------\4");
    System.out.println("Enter the Raduis:");
    double d=sc.nextFloat();
    s.setRadiuss(d);
    System.out.println("Radius of circle:"+s.area());
    System.out.println("\4------------------------------\4");

    //cylinder
    System.out.println("\4------------------------------\4");
    System.out.println("Enter the Radius and height:");
    double e=sc.nextFloat();
    double f=sc.nextFloat();
    s.setRadiusss(e);
    s.setHeight(f);
    System.out.println("volume of cylinder:"+s.volumeofcylinder());
    System.out.println("\4------------------------------\4");

    //Sphere
    System.out.println("\4------------------------------\4");
    System.out.println("Enter the Radius:");
    double m=sc.nextFloat();
    s.setRadius(m);
    System.out.println("Area of sphare:"+s.SphereArea());
    System.out.println("\4------------------------------\4");

    
    
    
} 
}
