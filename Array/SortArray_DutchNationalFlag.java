public class SortArray_DutchNationalFlag {
    static void sortColors(int[] a) {
        int low = 0, mid = 0, high = a.length - 1;
        while(mid <= high){
        switch(a[mid]){
            case 0://Swap a[mid] and a[low]
            int temp0 = a[low];
            a[low] = a[mid];
            a[mid] = temp0;
            low++;
            mid++;
            break;
            case 1:
            mid++;
            break;
            case 2://Swap a[mid] and a[high]
            int temp2 = a[high];
            a[high] = a[mid];
            a[mid] = temp2;
            high--;
            break;
        }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 0, 1, 2, 0, 1};
        System.out.println("Original Array ");
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("Sorted Array ");
        sortColors(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
