
public class TransposeOfMatrix {

     static void Transpose(int a[][]) {
        int row = a.length;
        int col = a[0].length;

        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = a[i][j];
            }
        }
        print(transpose);
    }
        static void print(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Original Matrix");
        print(a);
        System.out.println("Transpose of a Matrix");
        Transpose(a);
    }
}
