public class Oop{
    public static void main(String[] args) {
        Pen p1 = new Pen();//created a pen object p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
       
        p1.setColor("red");
        System.out.println(p1.getColor());

        // BankAccount myAcc=new BankAccount();
        // myAcc.username="John";
        // myAcc.setPassword="1235";
    }
}

// class BankAccount{
//     public String username;
//     private String password;
//     default void setPassword(String pass){
//         password=pass;
//     }
// }

class Pen{
    private String color;
    int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int Tip){
        this.tip = Tip;
    }
}

// class Student{
//     String name;
//     int age;
//     float percentage;
//     void calcPercentage(int phy,int chem,int math){
//         percentage = (phy + chem + math) / 3.0f;
//     }
// }