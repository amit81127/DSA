public class pyramid01 {
    public static void main(String[] args) {
        int n=5;
       
        for (int i = 0; i < n; i++) {
            int b=0;
            for(int j=0;j<i;j++) {
                System.out.print(b);
                b++;
            }
            System.out.println();
            
        }
    }
}
