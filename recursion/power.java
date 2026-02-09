public class power {
    public static int power(int n,int p){
        // if(p==0){
        //     return 1;
        // }
        // return n*power(n,p-1);

        //optamize
        if(p==0){
            return 1;
        }

        int halfPowe=power(n,p/2);
       int halfPowesqr=halfPowe*halfPowe;
        // if p is odd  
        if(p%2!=0){
            halfPowesqr=halfPowesqr*n;
        }
        return halfPowesqr;

    }
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
