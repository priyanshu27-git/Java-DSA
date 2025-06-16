
public class spiralTraversalOfAMatrix {

    public static void Spiral(int a[][]) {
        // first row  - left to right -> top to bottom -> right to left -> bottom to top  
        int startrow = 0;
        int endrow = a.length - 1;
        int startcol = 0;
        int endcol = a[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {

            for (int i = startcol; i <= endcol; i++) {// top row
                System.out.print(a[startrow][i] + " ");
            }
            startrow++;
            for (int i = startrow; i <= endrow; i++) {// right column
                System.out.print(a[i][endcol] + " ");
            }
            endcol--;
            if (startrow <= endrow) {
                for (int i = endcol; i >= startcol; i--) {// bottom row
                    System.out.print(a[endrow][i] + " ");
                }
                endrow--;
            }

            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {// left column
                    System.out.print(a[i][startcol] + " ");
                }
                startcol++;
            }

        }
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Spiral(a);
    }
}
