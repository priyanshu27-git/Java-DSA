
public class ConvertStringIntoInteger {

    static int StringIntoInteger(String str) {
        int i = 0, result = 0;
        int sign = 1;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        while (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            if (str.charAt(i++) == '-') {
                sign = -1;
            }
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE && str.charAt(i) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = 10 * result + (str.charAt(i++) - '0');
        }
        return result * sign;
    }

    public static void main(String[] args) {
        String str = "127", str1 = "-123", str2 = "1231231231311133", str3 = "-0012gfg4";
        System.out.println("Converted String into Integers ");
        System.out.println(StringIntoInteger(str));
        System.out.println(StringIntoInteger(str1));
        System.out.println(StringIntoInteger(str2));
        System.out.println(StringIntoInteger(str3));

    }
}
