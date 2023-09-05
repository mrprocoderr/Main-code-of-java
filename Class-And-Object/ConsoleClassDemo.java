import java.io.Console;
public class ConsoleClassDemo {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter your name:");
        String username=c.readLine();
        System.out.println("Enter your password:");
        char [] ch=c.readPassword();
        String pass =String.valueOf(ch);

        System.out.println("Username="+username);
        System.out.println("Password is:"+pass);
        System.out.println("Welcome to new learnings:"+username);
    
    }
    
    
}
