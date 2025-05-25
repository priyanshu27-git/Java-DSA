public class KthMaxMin {
    public static int[] SortArray(int a[]) {
        //Sort Array
        for (int i = 1; i <= a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {5, 7, 9, 2, 4};
        a = SortArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int k = 2;
        System.out.println("\nk = " +k);
        System.out.println(k +" max = " + a[a.length - k]);
        System.out.println(k + " min = " + a[k - 1]);
    }
}
