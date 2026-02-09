

public class binomialCoefficient {
    public static int bino(int n,int r){
        int c=1;
        for(int i=1;i<=r;i++){
            c=c*(n-i+1)/i;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int result= bino(n,r);
        System.out.println("Binomial Coefficient of "+n+" choose "+r+" is "+result);

    }
}
