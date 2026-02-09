public class sumOfdigit {
    public static int sum(int n) {
        int sum=0;
        int tem=n;
        while(tem!=0){
            sum=sum+tem%10;
            tem=tem/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println(sum(299));
    }
}
