public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid

        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 0; k != 2 * i - 1; ++k) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }
    }
}
