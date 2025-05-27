
public class MaximumProductSubarray {

    public static int MaximumProduct(int a[]) {
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            int max = 1;
            for (int j = i; j < a.length; j++) {
                max *= a[j];
                result = max > result ? max : result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {-2, 6, -3, -10, 0, 2};
        System.out.println(MaximumProduct(a));
    }
}
