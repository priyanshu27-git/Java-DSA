
public class FindPairsWhichHaveSameSum {

    static void Pairs(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length - 1; j++) {
                int checksum = a[i] + a[j];
                if (checksum == sum) {
                    System.out.print("(" + a[i] + "," + a[j + 1] + ")" + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 5, 3, 2 , 3};
        int targetSum = 6;
        System.out.println("All possible Pairs which have same sum ");
        Pairs(a, targetSum);
    }
}