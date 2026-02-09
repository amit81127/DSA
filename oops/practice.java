class practice{
    public static void main(String[] args) {
        
    }
}

class Animal{
    String name;
    int age;
    String color;

    Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
}
class fish extends Animal{
    String type;
    void display(){
        super.display();
        System.out.println("Type: " + type);
    }
}
class bird extends Animal{
    String type;
    void display(){
        super.display();
        System.out.println("Type: " + type);
    }
}
class mammal extends Animal{
    String type;
    void display(){
        super.display();
        System.out.println("Type: " + type);
    }
}

