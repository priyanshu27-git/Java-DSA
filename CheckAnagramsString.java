
import java.util.Arrays;

public class CheckAnagramsString {

    static boolean Anagrams(String str, String str1) {
        int n1 = str.length();
        int n2 = str1.length();
        char[] ch1 = new char[n1];
        char[] ch2 = new char[n2];
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = str.charAt(i);
        }
        for (int i = 0; i < ch2.length; i++) {
            ch2[i] = str1.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
    public static void main(String[] args) {
        String str = "heart";
        String str1 = "earth";
        System.out.println(Anagrams(str, str1));
    }
}
