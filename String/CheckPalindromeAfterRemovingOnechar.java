
public class CheckPalindromeAfterRemovingOnechar {

    static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean validPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abca";
        String str1 = "madam";
        String str2 = "abc";
        System.out.println(validPalindrome(str));
        System.out.println(validPalindrome(str1));
        System.out.println(validPalindrome(str2));
    }
}
