import java.util.Arrays;
public class insertion {
    public static void insert(int ar[]){
       for(int i=0;i<ar.length;i++){
        int cuu=ar[i];
        int prev=i-1;
        while(prev>=0&&ar[prev]>cuu){
            ar[prev+1]=ar[prev];
            prev--;
        }
        ar[prev+1]=cuu;
       }
    }
    public static void print(int ar[]){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }

    public static void main(String[] args) {
        int ar[]={5,4,1,3,2};
        // insert(ar);
        Arrays.sort(ar,0,3);
        print(ar);
    }
}
