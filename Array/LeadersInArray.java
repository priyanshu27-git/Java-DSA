
public class LeadersInArray {

    static void Leaders(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean checkleader = false;
            for (int j = i; j < a.length - 1; j++) {
                if (a[i] < a[j + 1]) {
                    break;
                }
                if (a[i] >= a[j + 1] && j == a.length - 2) {
                    checkleader = true;
                }
            }
            if (checkleader || i == a.length - 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {16, 17, 3, 4, 5, 2};
        System.out.println("Leaders in an Array ");
        Leaders(a);
    }
}
