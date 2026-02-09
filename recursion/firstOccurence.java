public class firstOccurence {
    public static int firstOccur(int arr[],int i,int x){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return firstOccur(arr,i+1,x);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,5,9};
        System.out.println(firstOccur(arr,0,5));
    }
}
