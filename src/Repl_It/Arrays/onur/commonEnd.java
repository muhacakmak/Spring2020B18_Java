package Repl_It.Arrays.onur;

public class commonEnd {

    public static boolean commondEnd(int[] a, int[] b) {

        boolean result = false;

        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            result = true;
        } else {
            result = false;
        }

        return result;

    }

}
