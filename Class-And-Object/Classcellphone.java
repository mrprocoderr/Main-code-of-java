class Cellphone{
    public void ring(){
        System.out.println("Ringging......");
    }
    public void vibrat(){
        System.out.println("vibrating......");
    } 
    public void callfriend(){
        System.out.println("calling Vaibhav......");
    }

}

public class Classcellphone {
    public static void main(String[] args) {
        
        Cellphone c=new Cellphone();
        c.ring();
        c.vibrat();
        c.callfriend();
    }
    
}
