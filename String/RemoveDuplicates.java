
public class RemoveDuplicates {

    static void RemoveDuplicate(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (newstr.indexOf(c) == -1) {
                newstr += c;
            }
        }
        System.out.println("Original String = " + str);
        System.out.println("After removing duplicates = " + newstr);
    }

    public static void main(String[] args) {
        String str = "priyanshusahu";
        RemoveDuplicate(str);
    }
}
