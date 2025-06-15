
public class SearchInASortedMatrix {

    public static boolean Search(int a[][], int target) {
        int row = 0;
        int col = a[0].length - 1;

        while (row < a.length && col >= 0) {
            int current = a[row][col];

            if (current == target) {
                System.out.println("Found at (" + row + ", " + col + ")");
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
        int matrix[][] = {{1, 4, 7, 11}, {2, 5, 8, 12}, {3, 6, 9, 16}, {10, 13, 14, 17}};
        int target = 5;
        System.out.println(Search(matrix, target));
    }
}
