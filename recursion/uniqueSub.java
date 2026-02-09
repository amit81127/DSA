import java.util.HashSet;

public class uniqueSub {
       public static void prisubsequence(String str,int idx,String newString, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currchar=str.charAt(idx);

        prisubsequence(str, idx+1, newString+currchar,set);

        prisubsequence(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String str="aaa";
        prisubsequence(str, 0, "",set);
    }
}
