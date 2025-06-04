
public class CountAndSayProblem {

    static String CountandSay(int n) {
        if (n == 1) {
            return "1";
        }

        String result = "1";

        for (int i = 2; i <= n; i++) {
            String current = "";
            char ch[] = result.toCharArray();
            int count = 1;
            char c = ch[0];
            for (int j = 1; j < result.length(); j++) {
                if (ch[j] == c) {
                    count++;
                } else {
                    current += count + "" + c;
                    c = ch[j];
                    count = 1;
                }
            }
            current += count + "" + c;
            result = current;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountandSay(n));
    }
}
