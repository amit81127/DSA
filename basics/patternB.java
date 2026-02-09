public class patternB {
    public static void main(String[] args){
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0|| (i == 0 || i == rows - 1|| i == rows / 2)|| (j == rows - 1 )  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

// 
