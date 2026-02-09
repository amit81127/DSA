import java.util.*;
public class inputArray {
    public static void main(String[] args) {
    int maks[]=new int[50];
    Scanner scanner = new Scanner(System.in);
    System.out.print("marks : ");
    int n = scanner.nextInt();
    for(int i=0;i<n;i++){
        maks[i]=scanner.nextInt();
    }
    int per=0;
    for(int i=0;i<n;i++){
        
        //     //update
        // maks[1]=25;
        per=per+maks[i];
        
    }
    int percent=per/n;
    System.out.println("Percentage : "+percent);
    

    }
}
