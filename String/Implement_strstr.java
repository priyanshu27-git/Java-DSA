
public class Implement_strstr {

    public static int strstr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean found = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "priyanshu";
        String needle = "anshu";
        String haystack1 = "codingisfun";
        String needle1 = "code";
        System.out.println(strstr(haystack, needle));
        System.out.println(strstr(haystack1, needle1));
    }
}
