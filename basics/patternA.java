public class patternA {
    public static void main(String[] var0) {
        int m=5,n=0;
        for(int row=1;row<10;row++){
        if(row<=5){
            for(int st=1;st<=m;st++){
                System.out.print("*");
            }
            for(int sp=1;sp<=n;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=m;st++){
                System.out.print("*");
            }
            m--;n+=2;
        }
        else{
            for(int st=1;st<=m+1;st++){
                System.out.print("*");
            }
            for(int sp=1;sp<=n-2;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=m+1;st++){
                System.out.print("*");
            }
            m++;n-=2;
        }
        System.out.println("");

        }
    }
}
