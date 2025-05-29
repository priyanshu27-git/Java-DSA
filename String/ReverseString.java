
public class ReverseString {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("desserts");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(str.toString());
    }
}
