public class largest {

    public static int larges(int arr[]){
        int max=Integer.MIN_VALUE;
        int mai=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }for(int i=0;i<arr.length;i++){
            if(arr[i]<mai){
                mai=arr[i];
            }
        }
        System.out.println("Smallest element is: "+mai);
        return max;

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,19,14,16};
        int result=larges(arr);
        System.out.println("Largest element is: "+result);
    }
}
