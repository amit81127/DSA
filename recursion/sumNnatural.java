public class sumNnatural {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
      int S1=sum(n-1);
       int S2=n+S1;
       return S2;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
