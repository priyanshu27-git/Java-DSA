public class CheckStringIsRotationOfAnotherString {

    public static boolean solve(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int length = s1.length();
        String temp = s1 + s1;
        for (int i = 0; i <= length; i++) {
            boolean found = true;
            for (int j = 0; j < length; j++) {
                if (temp.charAt(i + j) != s2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abcd",s2 = "cdab",s3 = "abcd",s4 = "cdba";
        System.out.println(solve(s1, s2));
        System.out.println(solve(s3, s4));
    }
}
