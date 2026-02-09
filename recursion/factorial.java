public class factorial {
    public static int factorial(int n){
        if(n==0 ){
            return 1;
        }
        int f1=factorial(n-1);
        int f2=n*f1;
        return f2;

    }
    public static void main(String[] args) {
        System.out.print(factorial(8));
    }
}
