import java.util.Scanner;

class Student {
    public int roll;
    public String name;
    public String cource;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() > 60)
            return 'A';
        else
            return 'B';

    }


    public String toString(){
      return "Roll No:" + roll + "\n" + "Name :" + name + "\n" + "Course:" + cource + "\n";

    }

}

public class ClassStudentinfo {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc=new Scanner(System.in);
        s.roll = sc.nextInt();
        s.name = sc.next();
        s.cource = sc.next();
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();
        // s.roll = 1;
        // s.name = "Vaibhav";
        // s.cource = "Computer_science";
        // s.m1 = 70;
        // s.m2 = 80;
        // s.m3 = 65;

       // System.out.println("Details :" + s.details());
        System.out.println("Details :" + s );
        System.out.println("Total :" + s.total());
        System.out.println("Average :" + s.average());

    }
}
