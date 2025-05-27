public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        for(int i = 0; i < b.length; i++) {
            a[i + a.length] = b[i];
        }
        
    }
}
