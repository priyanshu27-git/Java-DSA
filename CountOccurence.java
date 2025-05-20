
public class CountOccurence {

    static int countElement(int a[], int element) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 3, 2};
        int element = 2;
        int result = countElement(a, element);
        System.out.println(element + " occurred " + result + " times");
    }
}
