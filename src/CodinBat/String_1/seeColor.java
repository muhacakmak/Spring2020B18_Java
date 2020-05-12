package CodinBat.String_1;

public class seeColor {
    /*
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"
     */
    public static void main(String[] args) {


    }

    public String seeColor(String str) {
        String result = "";
        if (str.indexOf("red") == 0) {
            result = "red";
        } else if (str.indexOf("blue") == 0) {
            result = "blue";
        } else {
            result = "";
        }
      return result;
    }
}
