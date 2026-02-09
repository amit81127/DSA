import java.util.*;

public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // list.add(3,6);
        System.out.println(list.size());
        // //get element at index 2
        // System.out.println(list.get(2));
        // //remove element at index 2
        // System.out.println(list.remove(2));
        // //set element at index 2
        // System.out.println(list.set(2,80));
        // System.out.println(list.contains(20));
        for(int i=list.size()-1;i>0;i--){
            System.out.print(list.get(i)+" ");
        } 

        
    }
}