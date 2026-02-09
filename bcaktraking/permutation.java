public class permutation {
    public static void findPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            int cur=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            findPermutations(newStr, ans+(char)cur);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutations(str,"");
    }
}
