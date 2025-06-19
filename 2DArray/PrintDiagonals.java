public class PrintDiagonals {
    public static void Diagonals(int a[][]) {
        int row = a.length;
        System.out.println("Primary Diagonal");
        for (int i = 0; i < row; i++) {
            System.out.print(a[i][i] + " ");
        }
        System.out.println("\nSecondary Diagonal");
        for (int i = 0; i < row; i++) {
            System.out.print(a[i][row-1-i] + " ");
        }
}
    public static void main(String[] args) {
        int a[][]= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Diagonals(a);
    }
}
