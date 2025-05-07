public class ReverseArrayInPlace{
    public static void reverse(int a[]) {
        int temp;
        int left = 0;
        int right = a.length - 1;
    for (int i = 0; i < a.length; i++) {
        if(left < right){
            temp = a[right];
            a[right] = a[left];
            a[left] = temp;
        }
        left++;
        right--;  
    }     
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }   
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        reverse(a);
        
    }
}