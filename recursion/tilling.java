public class tilling {
    public  static int tilling(int n){
        if(n==0||n==1){
            return 1;
        }
        int fn1=tilling(n-1);
        int fn2=tilling(n-2);
        return fn1+fn2;
    }
    public static void main(String[] args){
        System.err.println(tilling(4));
    }
}
