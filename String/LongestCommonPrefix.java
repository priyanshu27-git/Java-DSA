
public class LongestCommonPrefix {

    public static String LongestPrefix(String str[]) {
        if (str.length == 0) {
            return "";
        }
        String newstr = "";
        for (int i = 0; i < str[0].length(); i++) {
            char c = str[0].charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != c) {
                    for (int k = 0; k < i; k++) {
                        newstr += str[0].charAt(k);
                    }

                    return newstr;
                }
            }
        }
        return str[0];
    }

    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        System.out.println(LongestPrefix(str));
    }
}
