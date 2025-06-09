
public class LongestSubstringWithoutDuplicates {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int maxlength = 1;
        for (int i = 0; i < s.length(); i++) {
            String newstr = "";
            for (int j = i; j < s.length(); j++) {
                char currentchar = s.charAt(j);
                if (visited(newstr, currentchar)) {
                    break;
                } else {
                    newstr += currentchar;
                }
            }
            if (newstr.length() > maxlength) {
                maxlength = newstr.length();
            }
        }
        return maxlength;
    }

    public static boolean visited(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
