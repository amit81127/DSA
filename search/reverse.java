public class reverse {
    public static int[] reverseArray(int[] arr){
       int first=0,last=arr.length-1;
       while(first<last){
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        first++;
        last--;
       }
         return arr;
    }
    public static void main(String[] args) {
        int arr[]={6,3,7,2,8,3,5,3};
        int result[]=reverseArray(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    
}
