
public class CheckSorted_rotatedarray {

    static void sorted_rotated(int a[]) {
        int count = 0;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i+1]) {
                count++;
            }
        }
        boolean islastbreakfirst = a[n-1] > a[0];
        if (count == 0 && islastbreakfirst) {
            System.out.println("Array is Sorted but not rotated"); 
        }else if (count == 1 && !islastbreakfirst) {
            System.out.println("Array is Sorted and Rotated"); 
        }else {
            System.out.println("Array is not Sorted and Rotated");
        }
    }
    public static void main(String[] args) {
        int a[] = {2,1,3,4,5};
        int b[] = {1,2,3,4,5};
        int c[] = {3,4,5,1,2};
        sorted_rotated(a);
        sorted_rotated(b);
        sorted_rotated(c);
    }
}
