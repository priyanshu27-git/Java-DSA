public class RearrangeElements {
     static void Rearrange(int a[]) {
        int positive[] = new int[a.length];
        int negative[] = new int[a.length];
        int p = 0, ne = 0;
        //boolean check = true;
        for (int i = 0; i < a.length; i++) {
        if(a[i] >= 0){
            positive[p++] = a[i];
        }
        else{
            negative[ne++] = a[i];
        }
    }
    int i = 0,j = 0, k = 0;
    while(i < p && j < ne){
                a[k++] = positive[i++];
                a[k++] = negative[j++];
    }
    while(i < p){
        a[k++] = positive[i++];
    }
    while(j < ne){
        a[k++] = negative[j++];
    }
        for (int m : a) {
            System.out.print(m +" ");
        }
}
    public static void main(String[] args) {
        int a[] ={1,2,3,-4,-1,4};
        System.out.println("Original Array ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("Updated Array \n");
        Rearrange(a);
    }
}
