
public class MergeTwoSortedArraysInPlace {

    static void MergeSortedArray(int a[], int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j <= b.length - 1; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 7, 10};
        int b[] = {2, 3};
        MergeSortedArray(a, b);
    }
}
