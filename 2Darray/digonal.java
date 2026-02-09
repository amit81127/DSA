class digonal{
    public static int pdigonsun(int n[][]){
        int sum = 0;
        for(int i=0;i<n.length;i++){
            // for(int j=0;j<n[0].length;j++){
            //     if(i==j){
            //         sum+=n[i][j];
            //     }
            //     else if(i+j==n.length-1){
            //         sum+=n[i][j];
            //     }
            // }
            sum+=n[i][i];
             if(i!=n.length-i-1)
            sum+=n[i][n.length-i-1];

        }return sum;
    }
    public static void main(String[] args) {
        int n[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
       int sum= pdigonsun(n);
        System.out.println("Sum of primary diagonal elements: "+sum);
    }
}