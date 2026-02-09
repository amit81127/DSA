public class Abstraction {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        // Chicken c=new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);
    Mustang myHorse = new Mustang();
    
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("...eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void changeColor(){
        color="green";
    }
    void walk(){
        System.out.println("4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("2 legs");
    }
}