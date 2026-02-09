public class invertedhalf {
    
    public static void inverted(int x) {
        
     for(int i=1;i<=x;i++){
        int a=1;
        for(int j=1;j<=x-i+1;j++){
            System.out.print(a);
            a++;
        }
        for(int j=1;j<=x;j++){
            System.out.print(" ");
        } 
        System.out.println();

     }
    }
    public static void main(String[] args) {
        inverted(5);
    }
    
}
