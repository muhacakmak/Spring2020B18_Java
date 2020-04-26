package day18_nestedLoops.Day22;

public class WarmUp {
    /*
    start after fourth min
     3. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number
		Ex:
			1 2 FIN 4 RA FIND .... FINDRA
     */
    public static void main(String[] args) {

        String str = "";
        int i = 1;
        while (i <= 30) {
            /*
            if (i % 5 == 0 && i % 3 == 0) {
                str += "FINRA ";
            } else if (i % 3 == 0) {
                str += "FIN ";
            } else if (i % 5 == 0) {
                str += "RA ";
            } else {
                str += i + " ";
            }
*/

            str+=(i % 5 == 0 && i % 3 == 0)?"FINRA ":(i % 3 == 0)?"FIN ":(i % 5 == 0)?"RA ":i+" ";
            i++;
        }
        System.out.println(str);


    }
}
