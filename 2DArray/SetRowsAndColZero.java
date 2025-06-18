
public class SetRowsAndColZero {

    static void setRowAndColZero(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rows[i] || cols[j]) {
                    a[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        setRowAndColZero(a);
        for (int[] res : a) {
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
