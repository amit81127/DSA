public class subsequence {
    public static void prisubsequence(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);

        prisubsequence(str, idx+1, newString+currchar);

        prisubsequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        prisubsequence(str, 0, "");
    }
}
