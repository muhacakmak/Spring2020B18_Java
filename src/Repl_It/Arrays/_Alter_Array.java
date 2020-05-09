package Repl_It.Arrays;


public class _Alter_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


//        int[] mystery = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0) {
//                mystery[i] = a[i] / 2;
//            } else {
//                mystery[i] = a[i] * 10;
//            }
//        }
//        System.out.println(Arrays.toString(mystery));

        for(int e : mystery(a))
        {
            System.out.print(e + " ");
        }



    }

    public static int[] mystery(int[] array) {
        int[] mystery = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                mystery[i] = array[i] / 2;
            } else {
                mystery[i] = array[i] * 10;
            }
        }
        return mystery;
    }

}
