
public class TrappingRainWater {

    static int TrapWater(int a[]) {
        int result = 0;
        for (int i = 1; i < a.length - 1; i++) {
            int left = a[i];
            for (int j = 0; j < i; j++) {
                left = left > a[j] ? left : a[j];//left max
            }
            int right = a[i];
            for (int j = i + 1; j < a.length; j++) {
                right = right > a[j] ? right : a[j];//right max
            }

            result += ((left < right ? left : right) - a[i]); // update maximum water
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = {2, 1, 5, 3, 1, 0, 4};
        int ans = TrapWater(a);
        System.out.println(ans);
    }
}
