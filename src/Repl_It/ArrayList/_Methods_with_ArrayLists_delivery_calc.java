package Repl_It.ArrayList;

import java.util.ArrayList;

public class _Methods_with_ArrayLists_delivery_calc {
    /*

     */
    public static void main(String[] args) {

        ArrayList <Integer> arr = new ArrayList <>();
        arr.add(9);
        arr.add(2);
        System.out.println(refuel_times(arr, 3));

    }

    public static int refuel_times(ArrayList <Integer> deliveries, int max_fuel) {
        int sum = 0;
        int left = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            sum += deliveries.get(i);

            left = sum % max_fuel;//1
        }
        return sum / max_fuel + left;
    }
}
