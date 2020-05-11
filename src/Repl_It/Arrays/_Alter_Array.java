package Repl_It.Arrays;

public class _Alter_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


          mystery(a);

        for(int e : a)
        {
            System.out.print(e + " ");
        }
    }

    public static void mystery(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            } else {
                array[i] = array[i] * 10;
            }
        }
    }
}
