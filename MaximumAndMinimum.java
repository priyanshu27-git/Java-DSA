public class MaximumAndMinimum {
    public static void MaxAndMin(int arr[]) { 
        int max = 1;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
             min = arr[i];
            }
        }
        System.out.println("Maximum element = " +max);
        System.out.println("Minimum element = " +min);
    }
    public static void main(String[] args) {
        int arr[] = {5,8,9,2,7};
        MaxAndMin(arr);
    }
}
