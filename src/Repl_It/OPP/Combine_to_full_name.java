package Repl_It.OPP;

import java.util.Arrays;

public class Combine_to_full_name {
    public static void main(String[] args) {
        String[] first_name = {"Selcuk", "Elif"};
        String[] last_name = {"Emir", "Tahir"};

        String[] combineNames = new String[first_name.length];

        for (int i = 0; i < combineNames.length; i++) {
            String each = first_name[i] + " " + last_name[i];
            combineNames[i] = each;


        }
        System.out.println(Arrays.toString(combineNames));


    }

    public static String[] combineNames(String[] first_names, String[] last_names) {
        String[] combineNames = new String[first_names.length];

        for (int i = 0; i < combineNames.length; i++) {
            String each = first_names[i] + " " + last_names[i];
            combineNames[i] = each;

        }
        return combineNames;
    }
}