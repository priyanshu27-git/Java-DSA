
public class CheckPalindromeString {

    static void CheckPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                break;
            } else {
                left++;
                right--;
            }
        }
        if (left >= right) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("No,it is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "hello";
        System.out.println(str);
        CheckPalindrome(str);
        System.out.println(str1);
        CheckPalindrome(str1);
    }
}
