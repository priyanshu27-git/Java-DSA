
public class RotateMatrixBy90deg {

    public static void RotateMatrix(int a[][]) {
        //we will first transpose this matrix then reverse each row
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {// Transpose matrix 
            for (int j = i; j < col; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            int left = 0, right = col - 1;
            while (left < right) {
                int temp1 = a[i][right];
                a[i][right] = a[i][left];
                a[i][left] = temp1;
                left++;
                right--;
            }
        }
    }

    static void print(int matrix[][]) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Original Matrix ");
        print(a);
        System.out.println("Rotated Matrix ");
        RotateMatrix(a);
        print(a);
    }
}
