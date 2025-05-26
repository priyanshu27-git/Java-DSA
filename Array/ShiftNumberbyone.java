
public class ShiftNumberbyone {

    static int[] shiftNumber(int a[]) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nUpdated Array ");
        int arr[] = shiftNumber(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
