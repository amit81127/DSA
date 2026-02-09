import java.util.*;
public class PairSum2 {
    public static void main(String arr[]){
        ArrayList<Integer> List=new ArrayList<>();
        int a[]={11,15,6,8,9,10};
        for(int i=0;i<a.length;i++){
            List.add(a[i]);
        }
        System.out.println(List);
        int target=16;
        System.out.println(pairSum(List,target));
    }
    public static boolean pairSum(ArrayList<Integer> list,int target){
         int bp=-1;
         for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
         }
        int lp=bp+1;
         int rp=bp;
         while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<target){
                 lp=(lp+1)%list.size();
            }else{
                rp=(list.size()+rp-1)%list.size();
            }
            
         }
         return false;
    }
}
