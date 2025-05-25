
public class MissingNumberInArray {

    public static void missingNumber(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int ans = (n * (n + 1) / 2) - sum;
        System.out.println("\nMissing number = " + ans);
    }

    public static void main(String[] args) {
        int a[] = {9,6,4,2,3,5,7,0,1};
        int n = 9;
        for (int i : a) {
            System.out.print(i + " ");
        }
        missingNumber(a, n);
    }
}
