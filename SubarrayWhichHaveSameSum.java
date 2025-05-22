
public class SubarrayWhichHaveSameSum {

    static void Sliding_Window_Algo(int a[], int targetSum) {
        int start = 0, end = 0;
        int currentsum = 0;
        boolean subarray = false;
        while (end < a.length) {
            currentsum += a[end++];
            while (currentsum > targetSum && start <= end) {
                currentsum -= a[start++];
            }
            if (currentsum == targetSum) {
                subarray = true;
                break;
            }
        }
        //print Subarray
        if (subarray) {
            System.out.println("Subarray which have given sum ");
            for (int i = start; i < end; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("No Subarray found of given sum");
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 20, 10, 3, 26};
        int targetSum = 39;
        Sliding_Window_Algo(a, targetSum);
    }
}
