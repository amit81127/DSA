class clear_range{
    public static int clear(int i,int j,int n){
          int a =((~0)<<j+1);
          int b =(1<<i)-1;
            int mask = a|b;
            return n&mask;
    }
    public static void main (String args[]){
        System.out.println(clear(2,4,10));
        // 0000 1111
        // 0000 0011
        // 0000 1100
        // 0000 0000
    }
}