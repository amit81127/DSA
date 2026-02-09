public class compare {
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony ";
        String s3 =new String("Tony");

        if(s1==s2){
            System.err.println("String equal");
        }else{
            System.err.println("String not equal");
        }

        if(s1.equals(s3)){
            System.err.println("String equal");
        }else{
            System.err.println("String not equal");
        }
    }
}
