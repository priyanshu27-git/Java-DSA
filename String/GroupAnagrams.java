public class GroupAnagrams {
    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return new String(arr);
    }

    public static void groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            String key = sortString(strs[i]);
            System.out.print("[ " + strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && sortString(strs[j]).equals(key)) {
                    System.out.print(", " + strs[j]);
                    visited[j] = true;
                }
            }

            visited[i] = true;
            System.out.print(" ]");
        }
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "nat", "ate", "tea", "tan", "bat"};
        groupAnagrams(strs);
    }
}
