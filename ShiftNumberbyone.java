public class ShiftNumberbyone {
     static int[] shiftNumber(int a[]) {
        int last = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = last;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int arr[] = shiftNumber(a);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
