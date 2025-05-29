
public class ReverseString {
     static void Reverse(String str,String str1) {
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println("Original String = " +str);
        System.out.println("Reversed String = " +str1);
        }
    public static void main(String[] args) {
        String str = "desserts";
        String str1 = "";
        Reverse(str,str1);
    }
}