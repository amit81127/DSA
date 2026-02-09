public class IndiceNumber {
    public static void printIndice(int key,int i,int arr[]){
          //base

          if(i==arr.length){
            return;
          }
          //kame
          if(arr[i]==key){
            System.out.print(i);
          }
          printIndice(key, i+1, arr);
    }
    public static void main(String[] args) {
        printIndice(2,0,new int[]{3, 2, 4, 5, 6, 2, 7, 2, 2});
    }
}
