
public class IntersectionOfTwoArray {

    static void Intersection(int a[], int b[]) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                int current = a[i];
                while (i < a.length && a[i] == current) {
                    i++;
                }
                while (j < b.length && b[j] == current) {
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 3, 5, 6};
        System.out.println("Intersection of Two Sorted Array ");
        Intersection(a, b);
    }
}
