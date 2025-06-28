
public class SetRowsAndColToOne {

    public static void solve(int a[][]) {
        boolean[] row = new boolean[a.length];
        boolean[] col = new boolean[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (row[i] || col[j]) {
                    a[i][j] = 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[][] = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        solve(a);
        //print array 
        for (int ele[] : a) {
            for (int val : ele) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
