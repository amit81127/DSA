import java.util.*;

public class basic {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }System.err.println();
    }
    
    public static void main(String[] args) {
        // char arr[] ={'a','b','c','d'};
        // String str ="abcd";
        // String str2 = new String("xyz");


        // //string are immutable means it not change 


        // Scanner sc= new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
            

        //string length

        // String fullName="amit kumar prasad";
        // System.out.println(fullName.length());
         
        //concatenation

        String firstName= "Amit";
        String secondName="Kumar";
        String fullName= firstName + " " + secondName;
        System.err.println(fullName.charAt(0) + " is my name");
              
        printLetter(fullName);
    }

}
