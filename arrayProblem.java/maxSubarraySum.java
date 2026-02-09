

public class maxSubarraySum {
    public static void maxSubarray(int[] arr) {
int cuur;
int max=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    int start=i;
    for(int j=0;j<arr.length;j++){
        int end=j;
        cuur=0;
        for(int k=start;k<=end;k++){
            cuur+=arr[k];
        }System.out.println(cuur);
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
