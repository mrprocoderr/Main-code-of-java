import java.util.Scanner;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        radius = 5;
        height = 10;
    }

    public Cylinder(int r) {
        radius = r;
    }

    public Cylinder(int r, int h) {
        radius = r;
        height = h;
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius( int r){
        radius=r;
    } 

    public int getHeight() {
        return height;
    }
    public void setHeight(int h){
        height=h;
    }

}

public class ConstCylinder1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Taking input from the user:");
        // int i = sc.nextInt();
        // int h=sc.nextInt();
           
        Cylinder c = new Cylinder(7,7);
        System.out.println("Area :" + c.lidArea());
        System.out.println("circumference :" + c.circumference());
        System.out.println("totalSurfaceArea :" + c.totalSurfaceArea());
    }
}
