
public class SearchInA2DMatrix {

    static boolean Search(int a[][], int target) {
        int row = 0;
        int col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            int current = a[row][col];
            if (current == target) {
                return true;
            } else if (current > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 7;
        System.out.println(Search(a, target));
    }
}
