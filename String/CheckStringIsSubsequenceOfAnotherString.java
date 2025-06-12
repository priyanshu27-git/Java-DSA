
public class CheckStringIsSubsequenceOfAnotherString {

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abc",t = "ahbgdc",s1 = "axc",t1 = "ahbgdc";
        System.out.println(isSubsequence(s, t));
        System.out.println(isSubsequence(s1, t1));
    }
}
