import java.util.Scanner;

class Customer {
    private String custid;
    private String name;
    private String address;
    private String phno;

    public Customer(String c, String n) {
        this.custid = c;
       this. name = n;
    }

    public String getCustId() {
        return custid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNo() {
        return phno;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setPhNo(String p) {
        phno = p;
    }

}

public class ConstCustomer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer ID:");
        String c=sc.nextLine();
        System.out.println("Enter the Customer Name:");
        String n=sc.nextLine();
        Customer r=new Customer(c,n);
        System.out.println("Enter the Customer Address:");
        String a=sc.nextLine();
        System.out.println("Enter the Customer Pno.:");
        String p=sc.nextLine();
        r.setAddress(a);
        r.setPhNo(p);
        
        System.out.println("Customer ID:"+ r.getCustId());
        System.out.println("Customer Name:"+r.getName());
        System.out.println("Customer Address:"+r.getAddress());
        System.out.println("Customer Pno:"+r.getPhNo());
        
    }

}
