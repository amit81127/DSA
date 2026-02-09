public class hybrideInheritance {
 public static void main(String[] args) {
     Fish fish=new Fish();
     fish.swim();
      fish.breathe();
       
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eating...");
    }
    void breathe(){
        System.out.println("breathing...");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("walking...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim...");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly...");
    }
}


//derived class

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("swimming...");
//     }
// }

