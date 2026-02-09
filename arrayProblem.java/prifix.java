

public class prifix {
    public static void maxSubarray(int[] arr) {
int cuur;
int max=Integer.MIN_VALUE;
int prifix[]=new int[arr.length];
prifix[0]=arr[0];
for(int i=1;i<prifix.length;i++) {
      prifix[i]=prifix[i-1]+arr[i];
}
for(int i=0;i<arr.length;i++){
    int start=i;
    for(int j=i;j<arr.length;j++){
        int end=j;
        cuur=start==0?prifix[end] :prifix[end]-prifix[start-1];
       
        if(max<cuur){
            max=cuur;
        }
    }
    }
    System.out.println(max);
}

    public static void main(String[] args) {
        int[] arr = {1, -1, 6, -1, 3};
        maxSubarray(arr);
    }
    

}
