package CodinBat.String_1;

public class hasBad {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .
    equals() to compare 2 strings.
       hasBad("badxx") → true
        hasBad("xbadxx") → true
        hasBad("xxbadxx") → false
      */
    public static void main(String[] args) {
        String str="xxbadxx";
        boolean result=false;
        if(str.indexOf("bad")==0 || str.indexOf("bad")==1){
            result=true;
        }else {
            result=false;
        }
        System.out.println(result);


    }
}
