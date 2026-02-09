public class lengthString {
    public static int findDigit(String str){
        //base
        if(str.equals("")){
            return 0;
        }
        return 1+findDigit(str.substring(1));
    }
    public static int printSubstring(String s,int i,int j){
        //base case
        int n=s.length();
        int count=0;
        if(i==n){
            return 0;
        }
        if(j==n){
            return printSubstring(s, i+1, i+1);
        }
        if(s.charAt(i)==s.charAt(j)){
         count+=1;
        }
        return count+printSubstring(s, i, j+1);


    }
    public static void main(String arr[]){
        System.out.println(printSubstring("abcab", 0, 0));
    
    }
}
