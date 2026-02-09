
public class linear {
        public static int search(int nums[], int key) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==key){
                    return i;
                }
            }
            return -1; 
        }

    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14,16};
        int key=16;
        int result=search(nums,key);
        System.out.println("Element found at index: "+result);

    }
}
