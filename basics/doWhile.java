import java.util.*;
public class doWhile {
    public static void main(String[] args) {
        // int c=0;
        // do { 
        //     System.err.println("hello");
        //     c++;
        // } while (c<10);
        //break statment
        // Scanner sc=new Scanner(System.in);
        
        // do { 
        //     System.out.println("Enter a number : ");
        //     int num=sc.nextInt();
        //     if(num%10==0){
        //         break;
        //     }
        //     System.out.println("You Entered : "+num);
        // } while (true);

        //continue statement


    //    Scanner sc=new Scanner(System.in);
        
    //     do { 
    //         System.out.print("Enter a number : ");
    //         int num=sc.nextInt();
    //         if(num%10==0){
    //             continue;
    //         }
    //         System.out.println("You Entered : "+num);
    //     } while (true);

    //cheak prime number

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==2){
        System.out.println(n+" is a prime number");
    }
     else{
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
              System.out.println(n+" is not a prime number");
              break;
            }
            else{
              System.out.println(n+" is a prime number");
            }
    
          }
    
     }
   
    }
}
