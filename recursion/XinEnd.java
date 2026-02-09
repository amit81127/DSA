public class XinEnd {
    public static void XinEnd(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char cuurchar=str.charAt(idx);
        if(cuurchar=='x'){
            count++;
            XinEnd(str,idx+1,count,newString);
        }else{
             newString+=cuurchar;
            XinEnd(str,idx+1,count,newString);
        }
    }
    public static void main(String []arg){
   String str="axxbdxcefxhix";
    XinEnd(str,0,0,"");
    }
}
