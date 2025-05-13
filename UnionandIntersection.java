
public class UnionandIntersection {

    static void Union(int a[], int b[]) {
        int result[] = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            result[k++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == b[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[k++] = b[i];
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void Intersection(int a[], int b[]) {
        int size = a.length < b.length ? a.length : b.length;
        int result[] = new int[size];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    boolean alreadyexits = false;
                    for (int m = 0; m < result.length; m++) {
                        if (result[m] == a[i]) {
                            alreadyexits = true;
                            break;
                        }
                    }
                    if (!alreadyexits) {
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
        int b[] = {3, 4, 5, 6};
        System.out.println("Union of Two array");
        Union(a, b);
        System.out.println("\nIntersection of Two array");
        Intersection(a, b);
    }
}
