public class findOccurance {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int idx,char element){
        if(idx==str.length()){
            System.err.println("first occurance "+first);
            System.err.println("last occurance "+last);
        }
        char cuur=str.charAt(idx);
        if(cuur==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }findOccurance(str, idx+1, element);
    }
    public static void main(String []arg){
        String str="abcaadefaah";
        findOccurance(str,0,'a');
        
    }
}
