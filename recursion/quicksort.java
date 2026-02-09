public class quicksort {
    public static void main(String arr[]){
        int a[]={9,5,2,8,9,6,5,4,-1,3};
        QuickSort(a,0, a.length-1);
        Print(a);

    }
      
    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int par=Partion(arr, si, ei);
        QuickSort(arr, si, par-1);
        QuickSort(arr, par+1, ei);
    }
    public static int Partion(int arr[],int si,int ei){
         int privot=arr[ei];
         int i=si-1;
         for(int j=si;j<ei;j++){
           if(arr[j]<=privot){
            i++;
            int tep=arr[j];
            arr[j]=arr[i];
            arr[i]=tep;
           }
         }
         i++;
         int tep=privot;
            arr[ei]=arr[i];
            arr[i]=tep;
         return i;
    }

}


