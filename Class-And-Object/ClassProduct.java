import java.util.Scanner;

class Product{
    private String itemno;
    private String name;
    private double price;
    private short  qty;
    
    public Product(String ino, String n){
    itemno=ino;
    name=n;
    }
    public String getItemNo(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public short getQty(){
        return qty;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setQty(short q){
        qty=q;
    }

}
public class ClassProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        String n=sc.nextLine();

        Product p=new Product(i,n);
        double c=sc.nextFloat();
        short q=sc.nextShort();
        p.setPrice(c);
        p.setQty(q);

        System.out.println("Print the item no:"+p.getItemNo());
        System.out.println("Print the item Name:"+p.getName());
        System.out.println("Print the item Price:"+p.getPrice());
        System.out.println("Print the item Name:"+p.getQty());
        sc.close();
    }
    
}
