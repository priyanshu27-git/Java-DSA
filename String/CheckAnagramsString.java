import java.util.Arrays;
public class CheckAnagramsString {

    static boolean Anagrams(String str, String str1) {
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        if(ch1.length != ch2.length){
        return false;
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
