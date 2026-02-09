public class if_2or_not {
    public static boolean check(int n){
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        System.out.println(check(8));
        System.out.println(check(7));
       
    }
}
