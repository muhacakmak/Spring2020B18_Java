package Repl_It.Arrays;

public class _119_Arrays_Average_temperature_Loop {
    /*
    Given an array temps of doubles, containing temperature data, compute the average temperature.
Store the average in a variable called avgTemp.
Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double
variable named total, which have been declared.
Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
     */
    public static void main(String[] args) {

        double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};
        double total = 0;
        double avgTemp = 0;



        for (double eachTemp:temps){

            total += eachTemp;
            avgTemp = total / (temps.length);

        }


        System.out.println("Sum of temperature: " + total);
        System.out.println("Average of temperature: " + avgTemp);


    }
}
