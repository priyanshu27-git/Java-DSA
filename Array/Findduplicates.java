public class Findduplicates {
      static void duplicates(int a[]) {
        boolean hasduplicates = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    hasduplicates = true;
                    System.out.println("\n"+ a[i] + " is Duplicate ");
                    break;
                }
            }
    }
    if(!hasduplicates){
        System.out.println("\n No Duplicates found");
    }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,2,3};
        for (int i : a) {
            System.out.print(i + " ");
        }
        duplicates(a);
    }
}
