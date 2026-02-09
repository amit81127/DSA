public class palidroma {
    public static void ispalidroma(int n){
        int rev=0;int tem=n;
        while(tem!=0){
            rev=rev*10+tem%10;
            tem=tem/10;
        }
            if(n==rev){
                System.out.println("palidroma");
            }else{
                System.out.println("not palidroma");
            }
        
    }
    public static void main(String[] args) {
        ispalidroma(121);
        
    }
}
