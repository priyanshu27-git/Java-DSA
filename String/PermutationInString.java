
public class PermutationInString {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        char[] input = new char[n];
        for (int i = 0; i < n; i++) {
            input[i] = str.charAt(i);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    char temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }

        boolean hasNext = true;
        while (hasNext) {

            for (int i = 0; i < n; i++) {
                System.out.print(input[i]);
            }
            System.out.println();

            int i = n - 2;
            while (i >= 0 && input[i] >= input[i + 1]) {
                i--;
            }

            if (i < 0) {
                hasNext = false;
            } else {
                int j = n - 1;
                while (input[j] <= input[i]) {
                    j--;
                }

                char temp = input[i];
                input[i] = input[j];
                input[j] = temp;

                int start = i + 1;
                int end = n - 1;
                while (start < end) {
                    char t = input[start];
                    input[start] = input[end];
                    input[end] = t;
                    start++;
                    end--;
                }
            }
        }
    }
}
