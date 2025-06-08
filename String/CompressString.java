
public class CompressString {

    static void compressString(char c[]) {
        String s = "";
        int count = 1;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                count++;
            } else {
                s += c[i - 1];
                if (count > 1) {
                    s += count;
                }
                count = 1;
            }
        }
        s += c[c.length - 1];
        if (count > 1) {
            s += count;
        }
        int newlength = s.length();
        for (int i = 0; i < newlength; i++) {
            c[i] = s.charAt(i);
        }
        System.out.println("Compressed Length = " + newlength);
        for (int i = 0; i < newlength; i++) {
            System.out.print(c[i]);
        }
    }

    public static void main(String[] args) {
        char c[] = {'a', 'a', 'b', 'b', 'b', 'c', 'c'};
        compressString(c);
    }
}
