
public class positivetoendnegativeinstart {

    static int[] Movenumbers(int a[]) {
        int arr[] = new int[a.length];
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                arr[left] = a[i];
                left++;
            } else if (a[i] % 2 == 0) {
                arr[right] = a[i];
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 2, 3, 6, 9};
        System.out.println("Original Array ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Reversed Array ");
        int arr[] = Movenumbers(a);
        for (int i : arr) {//For each loop 
            System.out.println(i);
        }
    }
}
