
public class MatrixMultiplication {

    static void Multiply(int a[][], int b[][]) {
        int rowOfa = a.length;
        int colOfa = a[0].length;
        int colOfb = b[0].length;

        int c[][] = new int[rowOfa][colOfb];
        for (int i = 0; i < rowOfa; i++) {
            for (int j = 0; j < colOfb; j++) {
                c[i][j] = 0;
                for (int k = 0; k < colOfa; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < rowOfa; i++) {
            for (int j = 0; j < colOfb; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int b[][] = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        Multiply(a, b);
    }
}
