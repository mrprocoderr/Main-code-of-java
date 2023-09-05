import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

public class ClassEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner s=new Scanner(System.in);
        String n =s.nextLine();
        e.setname(n);
        e.salary = 12000;
        System.out.println(e.getname());
        System.out.println(e.getsalary());

    }

}
