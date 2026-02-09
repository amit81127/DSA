public class rotatedHalfpyramid {
    public static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

        }
    }
     
        public static void main(String[] args){
           
            printHalfPyramid(4);
        }
}
