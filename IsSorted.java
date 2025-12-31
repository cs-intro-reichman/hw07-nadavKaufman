public class IsSorted {

    // Public function: called by the user
    public static boolean isSorted(int[] a) {
        return isSorted(a, 0);
    }

    // Helper recursive function
    private static boolean isSorted(int[] a, int i) {
        if(a.length-1 <= i)
        return true;
        if(a[i] > a[i+1])
           return false;
        return isSorted(a,i+1);
    }

    public static void main(String[] args) {
        int[] a = {};
        System.out.println(isSorted(a)); // true

        int[] b = { 3};
        System.out.println(isSorted(b)); // false
    }
}
