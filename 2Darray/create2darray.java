import java.util.*;

public class create2darray {
    public static void search(int matrix[][],int key){
        int n=matrix.length,m=matrix[0].length;
           for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found at "+i+" "+j);
                    return;
                }
            }
           }
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 9);
    }
    
}
