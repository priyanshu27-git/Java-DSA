public class positivetoendnegativeinstart {
     static int[] Movenumbers(int a[]) {
        int arr[] = new int[a.length]; 
        int left = 0,right = arr.length - 1;
       for (int i = 0; i < a.length; i++){
        if(left < right){
        if(a[i] % 2 != 0){
        arr[left] = a[i];
        }
        else if(a[i] % 2 == 0){
        arr[right] = a[i];
        }
    }
        left++;
        right--;
       }
       return arr;
    }
    public static void main(String[] args) {
        int []a = {4,6,2,3,7,9};
        int arr[] = Movenumbers(a);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
