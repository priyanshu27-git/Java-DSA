
public class FindMedian {

    static int BinarySearch(int[] row, int x) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (row[mid] <= x) {
                low = mid + 1; 
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

    static int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find  min and max
        for (int i = 0; i < r; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][c - 1]);
        }

        int desired = (r * c + 1) / 2;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            for (int i = 0; i < r; i++) {
                count += BinarySearch(matrix[i], mid);
            }

            if (count < desired) {
                low = mid + 1; 
            }else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println(findMedian(a));
    }
}
