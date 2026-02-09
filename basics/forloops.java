import java.util.*;
public class forloops{
    public static void main(String[] args){
        //   for(int i = 1; i <=4;i++){
        //     System.out.println("****");
        //   }
          //square pattern

          //revers number
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number:");
          int n=sc.nextInt();
        //   while (n>0) { 
        //       int last=n%10;
        //       System.out.print(last+" ");
        //       n=n/10;
        //   }
        //   System.out.println();
        int revers=0;
            while(n>0){
                int last=n%10;
               n=n/10;
                revers=(revers*10)+last;
                
            }System.out.println("Reversed number is: "+revers);
    }
}