public class patternE {
    
    public static void main(String[] args){
        int row=5;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (i==0||j==0||i==row-1||i==row/2){ 
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
