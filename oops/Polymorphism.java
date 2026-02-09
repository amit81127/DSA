public class Polymorphism {
    public static void main(String[] args) {
        // Calculator c=new Calculator();;
        // System.out.println(c.sum(2,7));
        // System.out.println(c.sum((float)2.8,(float)7.6));
        // System.out.println(c.sum(2,7,8));
        Dear d=new Dear();
        d.eat();

    }
}
class Animal{
    void eat(){
        System.out.println("eat...anything");
    }
}
class Dear extends Animal{
    void eat(){
        System.out.println("eat...Grass");
    }
} 
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}