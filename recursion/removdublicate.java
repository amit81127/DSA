public class removdublicate {
    public static boolean[] map=new boolean[26];
    public static void removeDublicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.print(newString);
            return;
        }

        char cuurchar=str.charAt(idx);
        if(map[cuurchar-'a']){
            removeDublicate(str,idx+1,newString);
        }else{
            newString+=cuurchar;
            map[cuurchar-'a']=true;
            removeDublicate(str,idx+1,newString);
        }
    }
    public static void main(String []arg){
        String str="aapapapaoddvs";
        removeDublicate(str,0,"");
    }
}
