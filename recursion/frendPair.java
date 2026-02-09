public class frendPair {
    public static int friend(int n){
        if(n==1||n==2){
            return n;
        }
        int fn1=friend(n-1);
        int fn2=friend(n-2);
        return (n-1)*fn2+fn1;
    }
    public static void main(String[] args) {
        
        System.out.println(friend(6));
    }
}
