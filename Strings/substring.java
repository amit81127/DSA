public class substring {
    public static String issubstring(String str,int si,int ei){
       String substr="";
       for(int i=si;i<ei;i++){
        substr+=str.charAt(i);
       }return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        //method
        System.err.println(str.substring(0,5));

        //manually
        System.err.println(issubstring(str, 3, 5));
    }
}
