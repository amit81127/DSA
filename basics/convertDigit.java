public class convertDigit {
    
    public static void convert(int n){
        //base
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        convert(n/10);
        System.out.print(arr[lastdigit]+" ");

    }
    public static void main(String[] args) {
        convert(123);
    }
}
