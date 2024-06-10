
abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void Disconnect();
}

class SmartTelephone extends Telephone {
    public void ring() {
        System.out.println("Ringing thr telephone...");
    }

    public void lift() {
        System.out.println("The lifiting the telephone...");
    }

    public void Disconnect() {
        System.out.println("Disconnect the telephone...");
    }
}

public class Abstract1 {
    public static void main(String[] args) {

        Telephone T = new SmartTelephone();
        T.ring();
        T.lift();
        T.Disconnect();
    }
}
