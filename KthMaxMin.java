
public class KthMaxMin {

    public static int[] SortArray(int a[]) {
        //Sort Array
        int temp = 0;
        for (int i = 1; i <= a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
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
       int k = 1;
       System.out.println("\nKth max = " +a[a.length - k]);
       System.out.println("Kth min = " +a[k - 1]);
    }
}
