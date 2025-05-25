
public class MaximumSubarraySum {

    public static int Kadane_algo(int a[]) {
        int currentsum = 0, MaxSum = a[0];
        try{
        for (int i = 0; i < a.length; i++) {
            currentsum += a[i];
            if (MaxSum < currentsum) {
                MaxSum = currentsum;
            }
            if (currentsum < 0) {
                currentsum = 0;
            }
        }
        }
    catch(Exception e){
        System.out.println(e);
    }
        return MaxSum;
    }

    public static void main(String[] args) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int MaximumSum = Kadane_algo(a);
        System.out.println("MaximumSum of Subarray = " + MaximumSum);
    }
}
