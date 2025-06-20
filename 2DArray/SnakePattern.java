public class SnakePattern {

    static void Snake(int a[][]) {
        int row = a.length;
        int col = a[0].length;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {// left to right
                for (int j = 0; j < col; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {// right to left
                for (int k = col - 1; k >= 0; k--) {
                    System.out.print(a[i][k] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Snake Matrix ");
        Snake(a);
    }
}
