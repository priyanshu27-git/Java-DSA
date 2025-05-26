public class NegativeinstartPositiveinend {
    static int[] Movenumbers(int a[]) {
        int arr[] = new int[a.length];
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                arr[left] = a[i];
                left++;
            } else if (a[i] > 0) {
                arr[right] = a[i];
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
         int[] a = {4,5,6,-4,-5,-6};
        System.out.println("Original Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nUpdated Array ");
        int arr[] = Movenumbers(a);
        for (int i : arr) {//For each loop 
            System.out.print(i + " ");
        }
    }
}
