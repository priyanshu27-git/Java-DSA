
public class CountIslands {

    static int numOfIslands(char[][] a) {
        int row = a.length;
        int col = a[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (a[i][j] == '1') {
                    dfs(a, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] a, int i, int j) {
        if (i < 0 || j < 0 || i >= a.length || j >= a[0].length || a[i][j] == '0') {
            return;
        }
        a[i][j] = '0';

        dfs(a, i + 1, j);
        dfs(a, i - 1, j);
        dfs(a, i, j + 1);
        dfs(a, i, j - 1);

    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number Of Islands are = " + numOfIslands(grid));
    }
}
