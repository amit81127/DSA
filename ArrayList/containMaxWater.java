import java.util.ArrayList;

class containMaxWater{
    public static int MaxWater(ArrayList<Integer> height){
        int max=0;
        for(int i=0;i<height.size();i++){
             for(int j=i+1;j<height.size();j++){
                int h=Math.min(height.get(i),height.get(j));
                int w=j-i;
                max=Math.max(max,h*w);
            }
        }return max;
    }
    public static void main(String arrg[]){
        ArrayList<Integer> List=new ArrayList<>();
        int a[]={1,8,6,2,5,4,8,3,7};
        for(int i=0;i<a.length;i++){
            List.add(a[i]);
        }
        System.out.println(List);
        System.out.println(motimizeMaxWater(List));
        
    }
    public static int motimizeMaxWater(ArrayList<Integer> height){
        int i=0,j=height.size()-1;
        int max=0;
        while(i<j){
            int h=Math.min(height.get(i),height.get(j));
            int w=j-i;
            max=Math.max(max,h*w);
            if(height.get(i)<height.get(j)){
                i++;
            }else{
                j--;
            }
        }return max;
    }
}