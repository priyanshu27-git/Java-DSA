
public class IntersectionOfTwoArray {

    static void Intersection(int a[], int b[]) {
        int size = (a.length < b.length) ? a.length : b.length;
        int result[] = new int[size];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    boolean alreadyexists = false;
                    for (int m = 0; m < result.length; m++) {
                        if (result[m] == a[i]) {
                            alreadyexists = true;
                            break;
                        }
                    }
                    if (!alreadyexists) {
                        result[k++] = a[i];
                    }
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 3, 5, 6};
        System.out.println("Intersection of Two Array ");
        Intersection(a, b);
    }
}
