
public class BoundaryTraversal {

    static void Boundary(int a[][]) {
        int endrow = a.length - 1;
        int endcol = a[0].length - 1;
        for (int i = 0; i <= endcol; i++) {
            System.out.print(a[0][i] + " ");
        }
        for (int i = 1; i <= endrow; i++) {
            System.out.print(a[i][endcol] + " ");
        }
        if (endrow > 1) {
            for (int i = endcol - 1; i >= 0; i--) {
                System.out.print(a[endrow][i] + " ");
            }
        }
        if (endcol > 1) {
            for (int i = endrow - 1; i > 0; i--) {
                System.out.print(a[i][0] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Boundary(a);
    }
}
