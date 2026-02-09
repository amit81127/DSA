public class subarray {
    public static void Subarray(int[] num) {
        for(int i=0;i<num.length;i++){
            int curr=i;
            for(int j=1;j<num.length;j++){
              int end=j;
              for(int k=curr;k<=end;k++){
                  System.out.print(num[k]+" ");
            }
            System.out.println();
        }
          System.out.println();
    }

    }
        
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Subarray(num);

    }
}
