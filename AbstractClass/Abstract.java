abstract class Monkey{
    abstract void jump();
    abstract void bite();
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void jump(){
        System.out.println("jumping....");
    }
    public void bite(){
        System.out.println("bite");
    }
    public void eat(){
        System.out.println("Eating...");

    }
    public void sleep(){
         System.out.println("Sleeping..");
    }

}



public class Abstract {
    public static void main(String[] args) {
         Human h=new Human();
         h.jump();
         h.bite();
         h.eat();

         Monkey m=new Human();
         m.jump();
         m.bite();
         //m.sleep(); --> can not use sleep method because reference is monkey which does not have sleep method

         BasicAnimal b=new Human();
         b.eat();
         b.sleep();   // using polymorphism
        // b.bite(); -->error
    }
    
}
