import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>();
        int a[]={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            List.add(a[i]);
        }
        System.out.println(List);
        int target=7;
        System.out.println(pairSum(List,target));
    }
    public static boolean pairSum(ArrayList<Integer> List,int target){
        int i=0,j=List.size()-1;
        while(i<j){
            int sum=List.get(i)+List.get(j);
            if(sum==target){
                return true;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }return false;
    }
}
