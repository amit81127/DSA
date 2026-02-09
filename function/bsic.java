public class bsic {
    // public static void printHello(){
    //     System.out.println("Hello World!");
    // }

    // public static void sum(int a,int b){
  
    //     int sum =a+b;
    //     System.out.println("Sum is: "+sum);
    // }

    public static void swap(int a, int b){
        int tem=a;
        a=b;
        b=tem;
        System.out.print (a +" "+b);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter two numbers:");
        // int a =sc.nextInt();
        // int b=sc.nextInt();
        // sum(a,b);

       int a=5;
        int b=8; 

        swap(a,b);  
    }
}
