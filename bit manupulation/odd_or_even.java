public class odd_or_even {
    public static void addOdd(int n){
       if((n&1)==0){
           System.out.println("even");
       }else{
           System.out.println("odd");
       }

    }
    public static void main(String[] args) {
        addOdd(3);
        addOdd(9);
        addOdd(1728);
    }
}
